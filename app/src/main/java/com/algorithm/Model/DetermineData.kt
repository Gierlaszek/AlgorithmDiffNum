package com.algorithm.Model

import java.util.ArrayList

class DetermineData {

    //calculates an even or an odd number
    fun determineNumber(list: ArrayList<Int>) : Int{
        var even = 0
        var odd = 0
        var numEven = 0
        var numOdd = 0
        for(i in list){
            if(i % 2 == 0){
                even++
                if(even == 1){
                    numEven = i
                }
            }
            else{
                odd++
                if(odd == 1){
                    numOdd = i
                }
            }
        }
        if(even == 1){
            return numEven
        }
        else{
            return numOdd
        }
    }
}