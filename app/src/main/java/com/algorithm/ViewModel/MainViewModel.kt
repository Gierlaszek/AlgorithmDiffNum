package com.algorithm.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algorithm.Model.DataModel
import com.algorithm.Model.DetermineData
import java.util.ArrayList

class MainViewModel : ViewModel() {

    //The model stores determine int from first fragment
    val intList = ArrayList<Int>()
    val data = MutableLiveData<DataModel>()
    val determine = DetermineData()

    //set String replacing a string with numbers it writes into the array
    fun setString(_input : String){
        try {
            for (i in _input.split(", ")){
                intList.add(i.toInt())
            }
        }catch (e : NumberFormatException ){
            println("Wrong format type. Try again by separating the numbers , and a space")
        }

        data.value = DataModel(determine.determineNumber(intList))
    }
}