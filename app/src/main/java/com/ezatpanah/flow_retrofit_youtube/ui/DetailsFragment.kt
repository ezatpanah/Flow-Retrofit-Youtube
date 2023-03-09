package com.ezatpanah.flow_retrofit_youtube.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.ezatpanah.flow_retrofit_youtube.databinding.FragmentDetailsBinding
import com.ezatpanah.flow_retrofit_youtube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

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
    ): View? {
        _binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        id = args.id

        lifecycleScope.launch {
            binding.apply {
                viewModel.getDetailsCoin(id)
                viewModel.detailsCoin.observe(viewLifecycleOwner) {
                    tvData.text= it.data!!.description.en
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}