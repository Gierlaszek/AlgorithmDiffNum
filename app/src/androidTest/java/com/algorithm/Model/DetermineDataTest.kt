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
        //Test for first set
        val inputArray1 = intArrayOf(160, 3, 1719, 19, 11, 13, -21).toCollection(ArrayList())
        val expectedNumber1 = 160
        val receivedNumber1 = determineDataTest.determineNumber(inputArray1)

        assertEquals(expectedNumber1, receivedNumber1)

        //Test for second set
        val inputArray2 = intArrayOf(2, 4, 0, 100, 4, 11, 2602, 36).toCollection(ArrayList())
        val expectedNumber2 = 11
        val receivedNumber2 = determineDataTest.determineNumber(inputArray2)

        assertEquals(expectedNumber2, receivedNumber2)

        //Test for two odd number in list
        val inputArray3 = intArrayOf(2, 4, 0, 101, 4, 11, 2602, 36).toCollection(ArrayList())
        val expectedNumber3 = null
        val receivedNumber3 = determineDataTest.determineNumber(inputArray3)

        assertEquals(expectedNumber3, receivedNumber3)

        //Test for two even number in list
        val inputArray4 = intArrayOf(160, 3, 1719, 50, 11, 13, -21).toCollection(ArrayList())
        val expectedNumber4 = null
        val receivedNumber4 = determineDataTest.determineNumber(inputArray4)

        assertEquals(expectedNumber4, receivedNumber4)

        //Test for two odd and even number
        val inputArray5 = intArrayOf(0, 1, 2, 3).toCollection(ArrayList())
        val expectedNumber5 = null
        val receivedNumber5 = determineDataTest.determineNumber(inputArray5)

        assertEquals(expectedNumber5, receivedNumber5)

        //Test for all even numbers
        val inputArray6 = intArrayOf(0, 2, 4, 6).toCollection(ArrayList())
        val expectedNumber6 = null
        val receivedNumber6 = determineDataTest.determineNumber(inputArray6)

        assertEquals(expectedNumber6, receivedNumber6)

        //Test for all odd number
        val inputArray7 = intArrayOf(1, 3, 5, 7).toCollection(ArrayList())
        val expectedNumber7 = null
        val receivedNumber7 = determineDataTest.determineNumber(inputArray7)

        assertEquals(expectedNumber7, receivedNumber7)

        //Test for empty list
        val inputArray8 = intArrayOf().toCollection(ArrayList())
        val expectedNumber8 = null
        val receivedNumber8 = determineDataTest.determineNumber(inputArray8)

        assertEquals(expectedNumber8, receivedNumber8)

        //Test for two number
        val inputArray9 = intArrayOf(0, 1).toCollection(ArrayList())
        val expectedNumber9 = null
        val receivedNumber9 = determineDataTest.determineNumber(inputArray9)

        assertEquals(expectedNumber9, receivedNumber9)

        //Test for negative numbers
        val inputArray10 = intArrayOf(-0, -1, -13, -23, -21).toCollection(ArrayList())
        val expectedNumber10 = -0
        val receivedNumber10 = determineDataTest.determineNumber(inputArray10)

        assertEquals(expectedNumber10, receivedNumber10)

        val inputArray11 = intArrayOf(-3, -6, -13, -23, -21, -6).toCollection(ArrayList())
        val expectedNumber11 = null
        val receivedNumber11 = determineDataTest.determineNumber(inputArray11)

        assertEquals(expectedNumber11, receivedNumber11)

    }
    
}