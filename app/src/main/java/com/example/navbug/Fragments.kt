package com.example.navbug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_nested_start.*
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        startButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_startFragment_to_nested_nav_graph)
        }
    }
}

class NestedStartFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_nested_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        nestedButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_nestedStartFragment_to_nestedSecondFragment)
        }
    }
}

class NestedSecondFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_nested_second, container, false)
    }
}