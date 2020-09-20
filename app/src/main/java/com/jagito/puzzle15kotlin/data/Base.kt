package com.jagito.puzzle15kotlin.data

import com.jagito.puzzle15kotlin.R

class Base {
    val list = ArrayList<ArrayList<Int>>()
//        get() {
//
//            val list = ArrayList<ArrayList<Int>>()
//
//            val level1 = ArrayList<Int>()
//            level1.add(R.drawable.level_1_1)
//            level1.add(R.drawable.level_1_box_1)
//            level1.add(R.drawable.level_1_box_2)
//            level1.add(R.drawable.level_1_box_3)
//            level1.add(R.drawable.level_1_box_4)
//            level1.add(R.drawable.level_1_box_5)
//            level1.add(R.drawable.level_1_box_6)
//            level1.add(R.drawable.level_1_box_7)
//            level1.add(R.drawable.level_1_box_8)
//            level1.add(R.drawable.level_1_box_9)
//            level1.add(R.drawable.level_1_box_10)
//            level1.add(R.drawable.level_1_box_11)
//            level1.add(R.drawable.level_1_box_12)
//            level1.add(R.drawable.level_1_box_13)
//            level1.add(R.drawable.level_1_box_14)
//            level1.add(R.drawable.level_1_box_15)
//
//            list.add(level1)
//
//
//
//            val level2 = ArrayList<Int>()
//            level1.add(R.drawable.level_2_2)
//            level1.add(R.drawable.level_2_box_1)
//            level1.add(R.drawable.level_2_box_2)
//            level1.add(R.drawable.level_2_box_3)
//            level1.add(R.drawable.level_2_box_4)
//            level1.add(R.drawable.level_2_box_5)
//            level1.add(R.drawable.level_2_box_6)
//            level1.add(R.drawable.level_2_box_7)
//            level1.add(R.drawable.level_2_box_8)
//            level1.add(R.drawable.level_2_box_9)
//            level1.add(R.drawable.level_2_box_10)
//            level1.add(R.drawable.level_2_box_11)
//            level1.add(R.drawable.level_2_box_12)
//            level1.add(R.drawable.level_2_box_13)
//            level1.add(R.drawable.level_2_box_14)
//            level1.add(R.drawable.level_2_box_15)
//
//            list.add(level2)
//
//            return list
//        }


    fun getB(): ArrayList<ArrayList<Int>>{
        val level1 = ArrayList<Int>()
        level1.add(R.drawable.level_1_1)
        level1.add(R.drawable.level_1_box_1)
        level1.add(R.drawable.level_1_box_2)
        level1.add(R.drawable.level_1_box_3)
        level1.add(R.drawable.level_1_box_4)
        level1.add(R.drawable.level_1_box_5)
        level1.add(R.drawable.level_1_box_6)
        level1.add(R.drawable.level_1_box_7)
        level1.add(R.drawable.level_1_box_8)
        level1.add(R.drawable.level_1_box_9)
        level1.add(R.drawable.level_1_box_10)
        level1.add(R.drawable.level_1_box_11)
        level1.add(R.drawable.level_1_box_12)
        level1.add(R.drawable.level_1_box_13)
        level1.add(R.drawable.level_1_box_14)
        level1.add(R.drawable.level_1_box_15)

        list.add(level1)



        val level2 = ArrayList<Int>()
        level1.add(R.drawable.level_2_2)
        level1.add(R.drawable.level_2_box_1)
        level1.add(R.drawable.level_2_box_2)
        level1.add(R.drawable.level_2_box_3)
        level1.add(R.drawable.level_2_box_4)
        level1.add(R.drawable.level_2_box_5)
        level1.add(R.drawable.level_2_box_6)
        level1.add(R.drawable.level_2_box_7)
        level1.add(R.drawable.level_2_box_8)
        level1.add(R.drawable.level_2_box_9)
        level1.add(R.drawable.level_2_box_10)
        level1.add(R.drawable.level_2_box_11)
        level1.add(R.drawable.level_2_box_12)
        level1.add(R.drawable.level_2_box_13)
        level1.add(R.drawable.level_2_box_14)
        level1.add(R.drawable.level_2_box_15)

        list.add(level2)

        return list
    }
}