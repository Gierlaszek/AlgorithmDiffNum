package com.algorithm.ViewModel

import androidx.lifecycle.MutableLiveData
import com.algorithm.Model.DataModel
import com.algorithm.Model.DetermineData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.util.ArrayList

class MainViewModelTest {

    private lateinit var viewModelTest: MainViewModel
    private lateinit var data: MutableLiveData<DataModel>
    private lateinit var determineData: DetermineData

    @Before
    fun setUp(){
        viewModelTest = MainViewModel()
    }

    @Test
    fun setString() {
        val stringToSet1 = "160, 3, 1719, 19, 11, 13, -21"
        val stringToSet2 = "2, 4, 0, 100, 4, 11, 2602, 36"
        val expectedArray1 = intArrayOf(160, 3, 1719, 19, 11, 13, -21).toCollection(ArrayList())
        val expectedArray2 = intArrayOf(2, 4, 0, 100, 4, 11, 2602, 36).toCollection(ArrayList())

        viewModelTest.setString(stringToSet1)
        assertEquals(expectedArray1, viewModelTest.intList)

        //for test
        viewModelTest.intList.clear()

        viewModelTest.setString(stringToSet2)
        assertEquals(expectedArray2, viewModelTest.intList)
    }
}