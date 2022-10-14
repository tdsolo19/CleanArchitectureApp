package com.cleanarchitectureapp.androidbase.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cleanarchitectureapp.androidbase.base.fragment.BaseFragment
import com.cleanarchitectureapp.androidbase.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var dataBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentHomeBinding.inflate(inflater)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataBinding.btnJsonPlaceHolder.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToJsonPlaceHolderFragment()
            findNavController().navigate(action)
        }

        dataBinding.btnStackOverFlow.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToStackOverFlowFragment()
            findNavController().navigate(action)
        }

    }


}