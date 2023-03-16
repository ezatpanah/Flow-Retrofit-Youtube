package com.ezatpanah.flow_retrofit_youtube.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezatpanah.flow_retrofit_youtube.R
import com.ezatpanah.flow_retrofit_youtube.adapter.CryptosAdapter
import com.ezatpanah.flow_retrofit_youtube.databinding.FragmentHomeBinding
import com.ezatpanah.flow_retrofit_youtube.utils.Constants.animationDuration
import com.ezatpanah.flow_retrofit_youtube.utils.DataStatus
import com.ezatpanah.flow_retrofit_youtube.utils.getCompatColor
import com.ezatpanah.flow_retrofit_youtube.utils.initRecycler
import com.ezatpanah.flow_retrofit_youtube.utils.isVisible
import com.ezatpanah.flow_retrofit_youtube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var cryptosAdapter: CryptosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()

        lifecycleScope.launch {

            binding.apply {
                viewModel.getCoinsList("eur")
                viewModel.coinsList.observe(viewLifecycleOwner) {
                    when (it.status) {
                        DataStatus.Status.LOADING -> {
                            pBarLoading.isVisible(true,rvCrypto)
                        }
                        DataStatus.Status.SUCCESS -> {
                            pBarLoading.isVisible(false,rvCrypto)
                            cryptosAdapter.differ.submitList(it.data)
                            cryptosAdapter.setOnItemClickListener { item ->
                                Log.d("HomeFragment", item.id!!)
                                val direction = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(item.id)
                                findNavController().navigate(direction)
                            }
                        }
                        DataStatus.Status.ERROR -> {
                            pBarLoading.isVisible(true,rvCrypto)
                            Toast.makeText(requireContext(), "There is something wrong!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    private fun setupRecyclerView() {
        binding.rvCrypto.initRecycler(LinearLayoutManager(requireContext()), cryptosAdapter)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
