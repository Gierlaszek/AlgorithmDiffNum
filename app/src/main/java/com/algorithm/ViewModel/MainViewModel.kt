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
        for (i in _input.split(", ")) {
            try {
                intList.add(i.toInt())
            } catch (e: NumberFormatException) {
                println("Wrong format type. Try again by separating the numbers , and a space")
            } catch (e: NullPointerException) {
                println("Wrong type")
            }
        }
        data.postValue(determine.determineNumber(intList)?.let { DataModel(it) })

    }
}