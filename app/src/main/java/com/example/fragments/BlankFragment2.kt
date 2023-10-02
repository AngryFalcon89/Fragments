package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragments.databinding.FragmentBlank2Binding
import com.example.fragments.databinding.FragmentBlankBinding


class BlankFragment2 : Fragment() {

    private lateinit var binding : FragmentBlank2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlank2Binding.inflate(inflater, container, false)

        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    companion object {

    }
}