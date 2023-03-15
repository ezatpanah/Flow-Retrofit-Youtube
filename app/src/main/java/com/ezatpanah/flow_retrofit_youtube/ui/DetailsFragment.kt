package com.ezatpanah.flow_retrofit_youtube.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.ezatpanah.flow_retrofit_youtube.databinding.FragmentDetailsBinding
import com.ezatpanah.flow_retrofit_youtube.utils.Constants.animationDuration
import com.ezatpanah.flow_retrofit_youtube.utils.toDoubleFloatPairs
import com.ezatpanah.flow_retrofit_youtube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.stream.Collectors.toList

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private val args: DetailsFragmentArgs by navArgs()
    private var id = ""

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        id = args.id
        Log.d("DetailsFragment", id)




        lifecycleScope.launch {
            binding.apply {
                viewModel.getDetailsCoin(id)
                viewModel.detailsCoin.observe(viewLifecycleOwner) {
                    tvCoinName.text=it.data?.name
                    lineChart.gradientFillColors =
                        intArrayOf(
                            Color.parseColor("#81FFFFFF"),
                            Color.TRANSPARENT
                        )
                    lineChart.animation.duration = animationDuration
                    val listData = it.data?.marketData?.sparkline7d?.price?.toDoubleFloatPairs()
                    lineChart.animate(listData!!)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}