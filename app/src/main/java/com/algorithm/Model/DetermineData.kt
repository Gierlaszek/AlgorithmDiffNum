package com.algorithm.Model

import java.util.ArrayList

class DetermineData {

    //calculates an even or an odd number
    fun determineNumber(list: ArrayList<Int>) : Int? {
        var even = 0
        var odd = 0
        var numEven = 0
        var numOdd = 0
        if(list.size > 2){
            for(i in list){
                if((i and 1) == 0){
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
        }
        if(even == 1){
            return numEven
        }
        else if(odd == 1){
            return numOdd
        }
        else{
            return null
        }
    }

//    fun determineNumber(ListWithData: ArrayList<DataModel>) : DataModel{
//        var countEven = 0
//        var countOdd = 0
//        for(i in ListWithData){
//            if(i.evenOrOdd){
//                countEven++
//            }
//            else{
//
//            }
//        }
//    }
//
//    fun detectEvenOrOddNum(list: ArrayList<Int>) : ArrayList<DataModel>{
//        val ListWithData = ArrayList<DataModel>()
//        for(i in list){
//            if((i and 1) == 0){
//                ListWithData.add(DataModel(i, true))
//            }
//            else{
//                ListWithData.add(DataModel(i, false))
//            }
//        }
//        return ListWithData
//    }
}