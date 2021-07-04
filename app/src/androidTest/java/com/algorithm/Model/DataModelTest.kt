package com.algorithm.Model

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DataModelTest {

    private lateinit var DataModelTest: DataModel

    @Before
    fun setUp(){
        DataModelTest = DataModel(1)
    }

    @Test
    fun getNumber() {
        val expectedNum = 1
        assertEquals(expectedNum, DataModelTest.number)
    }
    @Test
    fun testToString() {
        val expectedNum = "1"
        assertEquals(expectedNum, DataModelTest.number.toString())
    }

    @Test
    fun setNumber() {
        val expectedNum = 2
        DataModelTest.number = 2
        assertEquals(expectedNum, DataModelTest.number)
    }
}