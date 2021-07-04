package com.algorithm.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.algorithm.R
import com.algorithm.ViewModel.MainViewModel

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val v = inflater.inflate(R.layout.fragment_first, container, false)

        editText = v.findViewById(R.id.EditText)
        button = v.findViewById(R.id.SearchButton)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        button.setOnClickListener{
            viewModel.setString(editText.text.toString())  //data transfer to ViewModel
            Navigation.findNavController(view).navigate(R.id.navigateToSecondFragment) //navigate to second fragment
        }
    }

}