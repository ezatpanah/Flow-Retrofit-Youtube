package com.ezatpanah.flow_retrofit_youtube.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import coil.load
import com.ezatpanah.flow_retrofit_youtube.R
import com.ezatpanah.flow_retrofit_youtube.databinding.FragmentDetailsBinding
import com.ezatpanah.flow_retrofit_youtube.utils.Constants.animationDuration
import com.ezatpanah.flow_retrofit_youtube.utils.DataStatus
import com.ezatpanah.flow_retrofit_youtube.utils.roundToTwoDecimals
import com.ezatpanah.flow_retrofit_youtube.utils.toDoubleFloatPairs
import com.ezatpanah.flow_retrofit_youtube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import org.jsoup.Jsoup

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private val args: DetailsFragmentArgs by navArgs()

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentDetailsBinding.inflate(layoutInflater)
        viewModel.getDetailsCoin(args.id)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            binding.apply {

                viewModel.detailsCoin.observe(viewLifecycleOwner) {
                    when (it.status) {
                        DataStatus.Status.LOADING -> {

                        }
                        DataStatus.Status.SUCCESS -> {
                            tvCoinNameSymbol.text = "${it.data?.name} [${it.data?.symbol?.uppercase()}]"
                            tvCurrentPrice.text = it.data?.marketData?.currentPrice?.eur.toString()
                            tvChangePercentage.text = "${it.data?.marketData?.priceChangePercentage24h?.roundToTwoDecimals()} %"
                            imgCoinLogo.load(it.data?.image?.large) {
                                crossfade(true)
                                crossfade(500)
                                placeholder(R.drawable.round_currency_bitcoin_24)
                                error(R.drawable.round_currency_bitcoin_24)
                            }
                            lineChart.gradientFillColors =
                                intArrayOf(
                                    Color.parseColor("#2a9085"),
                                    Color.TRANSPARENT
                                )
                            lineChart.animation.duration = animationDuration
                            val listData = it.data?.marketData?.sparkline7d?.price?.toDoubleFloatPairs()
                            lineChart.animate(listData!!)

                            tvDescription.text=Jsoup.parse(it.data.description?.en!!).text()
                        }
                        DataStatus.Status.ERROR -> {

                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}