package com.algorithm.Model

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.util.ArrayList

class DetermineDataTest {

    private lateinit var determineDataTest: DetermineData

    @Before
    fun setUp(){
        determineDataTest = DetermineData()
    }

    @Test
    fun determineNumber() {
        val inputArray1 = intArrayOf(160, 3, 1719, 19, 11, 13, -21).toCollection(ArrayList())
        val expectedNumber1 = 160
        val receivedNumber1 = determineDataTest.determineNumber(inputArray1)

        assertEquals(expectedNumber1, receivedNumber1)

        val inputArray2 = intArrayOf(2, 4, 0, 100, 4, 11, 2602, 36).toCollection(ArrayList())
        val expectedNumber2 = 11
        val receivedNumber2 = determineDataTest.determineNumber(inputArray2)

        assertEquals(expectedNumber2, receivedNumber2)

    }
}