package com.ezatpanah.flow_retrofit_youtube.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezatpanah.flow_retrofit_youtube.R
import com.ezatpanah.flow_retrofit_youtube.adapter.CryptosAdapter
import com.ezatpanah.flow_retrofit_youtube.databinding.FragmentHomeBinding
import com.ezatpanah.flow_retrofit_youtube.utils.DataStatus
import com.ezatpanah.flow_retrofit_youtube.utils.getCompatColor
import com.ezatpanah.flow_retrofit_youtube.utils.isVisible
import com.ezatpanah.flow_retrofit_youtube.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    @Inject
    lateinit var cryptosAdapter: CryptosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel.getServerStatus()
            viewModel.serverStatus.observe(viewLifecycleOwner) {
                when (it.status) {
                    DataStatus.Status.LOADING -> {
                        pBarStatus.isVisible(true, imgStatus)
                    }
                    DataStatus.Status.SUCCESS -> {
                        Log.d("MainActivity", "onCreate: ${it.data!!.geckoSays}")
                        pBarStatus.isVisible(false, imgStatus)
                        imgStatus.setColorFilter(requireContext().getCompatColor(R.color.status_green))
                    }
                    DataStatus.Status.ERROR -> {
                        pBarStatus.isVisible(true, imgStatus)
                        imgStatus.setColorFilter(requireContext().getCompatColor(R.color.status_red))
                    }
                }
            }

            viewModel.getCoinsList("eur")
            viewModel.coinsList.observe(viewLifecycleOwner){
                when (it.status) {
                    DataStatus.Status.LOADING -> {
                    }
                    DataStatus.Status.SUCCESS -> {
                        cryptosAdapter.differ.submitList(it.data)
                        rvCrypto.apply {
                            layoutManager = LinearLayoutManager(requireContext())
                            adapter = cryptosAdapter
                        }
                    }
                    DataStatus.Status.ERROR -> {

                    }
                }
            }
        }
    }
}