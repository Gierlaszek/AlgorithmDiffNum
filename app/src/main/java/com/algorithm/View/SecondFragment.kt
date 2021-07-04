package com.algorithm.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.algorithm.R
import com.algorithm.ViewModel.MainViewModel

class SecondFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val v = inflater.inflate(R.layout.fragment_second, container, false)

        textView = v.findViewById(R.id.textView)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        //observe life cycle data, set determine number to textView
        viewModel.data.observe(viewLifecycleOwner, Observer {
            textView.text = it.number.toString()
        })

    }

}