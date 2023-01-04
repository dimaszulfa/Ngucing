package com.arcquila.ngucing.Util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseClass<viewBinding : ViewBinding>(private val inflateMethod: (LayoutInflater, ViewGroup?, Boolean) -> viewBinding) :
    Fragment() {

    private var _binding: viewBinding? = null
    val binding get() = _binding!!

    open fun viewBinding.initialize() {}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = inflateMethod.invoke(inflater, container, false)
        binding.initialize()
        return binding.root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}