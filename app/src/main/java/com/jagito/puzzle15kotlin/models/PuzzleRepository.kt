package com.jagito.puzzle15kotlin.models

import com.jagito.puzzle15kotlin.R
import com.jagito.puzzle15kotlin.contracts.PuzzleContract
import com.jagito.puzzle15kotlin.data.Base
import com.jagito.puzzle15kotlin.data.LevelData
import java.util.*
import kotlin.collections.ArrayList

class PuzzleRepository(override val pref: LocalStorage) : PuzzleContract.Model {
    private val list = ArrayList<Int>()
    override fun getImages(level: Int): ArrayList<Int> {
        val img = ArrayList<Int>()
        when (level) {
            1 -> {
                img.add(R.drawable.level_1_1)
                img.add(R.drawable.level_1_box_1)
                img.add(R.drawable.level_1_box_2)
                img.add(R.drawable.level_1_box_3)
                img.add(R.drawable.level_1_box_4)
                img.add(R.drawable.level_1_box_5)
                img.add(R.drawable.level_1_box_6)
                img.add(R.drawable.level_1_box_7)
                img.add(R.drawable.level_1_box_8)
                img.add(R.drawable.level_1_box_9)
                img.add(R.drawable.level_1_box_10)
                img.add(R.drawable.level_1_box_11)
                img.add(R.drawable.level_1_box_12)
                img.add(R.drawable.level_1_box_13)
                img.add(R.drawable.level_1_box_14)
                img.add(R.drawable.level_1_box_15)
            }
            2 -> {
                img.add(R.drawable.level_2_2)
                img.add(R.drawable.level_2_box_1)
                img.add(R.drawable.level_2_box_2)
                img.add(R.drawable.level_2_box_3)
                img.add(R.drawable.level_2_box_4)
                img.add(R.drawable.level_2_box_5)
                img.add(R.drawable.level_2_box_6)
                img.add(R.drawable.level_2_box_7)
                img.add(R.drawable.level_2_box_8)
                img.add(R.drawable.level_2_box_9)
                img.add(R.drawable.level_2_box_10)
                img.add(R.drawable.level_2_box_11)
                img.add(R.drawable.level_2_box_12)
                img.add(R.drawable.level_2_box_13)
                img.add(R.drawable.level_2_box_14)
                img.add(R.drawable.level_2_box_15)
            }
            3 -> {
                img.add(R.drawable.level_3_3)
                img.add(R.drawable.level_3_box_1)
                img.add(R.drawable.level_3_box_2)
                img.add(R.drawable.level_3_box_3)
                img.add(R.drawable.level_3_box_4)
                img.add(R.drawable.level_3_box_5)
                img.add(R.drawable.level_3_box_6)
                img.add(R.drawable.level_3_box_7)
                img.add(R.drawable.level_3_box_8)
                img.add(R.drawable.level_3_box_9)
                img.add(R.drawable.level_3_box_10)
                img.add(R.drawable.level_3_box_11)
                img.add(R.drawable.level_3_box_12)
                img.add(R.drawable.level_3_box_13)
                img.add(R.drawable.level_3_box_14)
                img.add(R.drawable.level_3_box_15)
            }
            4 -> {
                img.add(R.drawable.level_4_4)
                img.add(R.drawable.level_4_box_1)
                img.add(R.drawable.level_4_box_2)
                img.add(R.drawable.level_4_box_3)
                img.add(R.drawable.level_4_box_4)
                img.add(R.drawable.level_4_box_5)
                img.add(R.drawable.level_4_box_6)
                img.add(R.drawable.level_4_box_7)
                img.add(R.drawable.level_4_box_8)
                img.add(R.drawable.level_4_box_9)
                img.add(R.drawable.level_4_box_10)
                img.add(R.drawable.level_4_box_11)
                img.add(R.drawable.level_4_box_12)
                img.add(R.drawable.level_4_box_13)
                img.add(R.drawable.level_4_box_14)
                img.add(R.drawable.level_4_box_15)
            }
            5 -> {
                img.add(R.drawable.level_5_5)
                img.add(R.drawable.level_5_box_1)
                img.add(R.drawable.level_5_box_2)
                img.add(R.drawable.level_5_box_3)
                img.add(R.drawable.level_5_box_4)
                img.add(R.drawable.level_5_box_5)
                img.add(R.drawable.level_5_box_6)
                img.add(R.drawable.level_5_box_7)
                img.add(R.drawable.level_5_box_8)
                img.add(R.drawable.level_5_box_9)
                img.add(R.drawable.level_5_box_10)
                img.add(R.drawable.level_5_box_11)
                img.add(R.drawable.level_5_box_12)
                img.add(R.drawable.level_5_box_13)
                img.add(R.drawable.level_5_box_14)
                img.add(R.drawable.level_5_box_15)
            }
            6 -> {
                img.add(R.drawable.level_6_6)
                img.add(R.drawable.level_6_box_1)
                img.add(R.drawable.level_6_box_2)
                img.add(R.drawable.level_6_box_3)
                img.add(R.drawable.level_6_box_4)
                img.add(R.drawable.level_6_box_5)
                img.add(R.drawable.level_6_box_6)
                img.add(R.drawable.level_6_box_7)
                img.add(R.drawable.level_6_box_8)
                img.add(R.drawable.level_6_box_9)
                img.add(R.drawable.level_6_box_10)
                img.add(R.drawable.level_6_box_11)
                img.add(R.drawable.level_6_box_12)
                img.add(R.drawable.level_6_box_13)
                img.add(R.drawable.level_6_box_14)
                img.add(R.drawable.level_6_box_15)
            }
            7 -> {
                img.add(R.drawable.level_7_7)
                img.add(R.drawable.level_7_box_1)
                img.add(R.drawable.level_7_box_2)
                img.add(R.drawable.level_7_box_3)
                img.add(R.drawable.level_7_box_4)
                img.add(R.drawable.level_7_box_5)
                img.add(R.drawable.level_7_box_6)
                img.add(R.drawable.level_7_box_7)
                img.add(R.drawable.level_7_box_8)
                img.add(R.drawable.level_7_box_9)
                img.add(R.drawable.level_7_box_10)
                img.add(R.drawable.level_7_box_11)
                img.add(R.drawable.level_7_box_12)
                img.add(R.drawable.level_7_box_13)
                img.add(R.drawable.level_7_box_14)
                img.add(R.drawable.level_7_box_15)
            }
            8 -> {
                img.add(R.drawable.level_8_8)
                img.add(R.drawable.level_8_box_1)
                img.add(R.drawable.level_8_box_2)
                img.add(R.drawable.level_8_box_3)
                img.add(R.drawable.level_8_box_4)
                img.add(R.drawable.level_8_box_5)
                img.add(R.drawable.level_8_box_6)
                img.add(R.drawable.level_8_box_7)
                img.add(R.drawable.level_8_box_8)
                img.add(R.drawable.level_8_box_9)
                img.add(R.drawable.level_8_box_10)
                img.add(R.drawable.level_8_box_11)
                img.add(R.drawable.level_8_box_12)
                img.add(R.drawable.level_8_box_13)
                img.add(R.drawable.level_8_box_14)
                img.add(R.drawable.level_8_box_15)
            }
            9 -> {
                img.add(R.drawable.level_9_9)
                img.add(R.drawable.level_9_box_1)
                img.add(R.drawable.level_9_box_2)
                img.add(R.drawable.level_9_box_3)
                img.add(R.drawable.level_9_box_4)
                img.add(R.drawable.level_9_box_5)
                img.add(R.drawable.level_9_box_6)
                img.add(R.drawable.level_9_box_7)
                img.add(R.drawable.level_9_box_8)
                img.add(R.drawable.level_9_box_9)
                img.add(R.drawable.level_9_box_10)
                img.add(R.drawable.level_9_box_11)
                img.add(R.drawable.level_9_box_12)
                img.add(R.drawable.level_9_box_13)
                img.add(R.drawable.level_9_box_14)
                img.add(R.drawable.level_9_box_15)
            }
            10 -> {
                img.add(R.drawable.level_10_10)
                img.add(R.drawable.level_10_box_1)
                img.add(R.drawable.level_10_box_2)
                img.add(R.drawable.level_10_box_3)
                img.add(R.drawable.level_10_box_4)
                img.add(R.drawable.level_10_box_5)
                img.add(R.drawable.level_10_box_6)
                img.add(R.drawable.level_10_box_7)
                img.add(R.drawable.level_10_box_8)
                img.add(R.drawable.level_10_box_9)
                img.add(R.drawable.level_10_box_10)
                img.add(R.drawable.level_10_box_11)
                img.add(R.drawable.level_10_box_12)
                img.add(R.drawable.level_10_box_13)
                img.add(R.drawable.level_10_box_14)
                img.add(R.drawable.level_10_box_15)
            }
        }
        return img
    }

    override val numbers: List<Int>
        get() {
            list.shuffle()
            return checkShuffle(list)
        }

    private fun checkShuffle(list: List<Int>): List<Int> {
        var sum = 0
        for (i in list.indices) {
            for (j in list.size - 1 downTo i + 1) {
                if (list[i] > list[j]) sum++
            }
        }
        return if (sum % 2 == 0) {
            list
        } else checkShuffle(numbers)
    }

    init {
        for (i in 1..15) {
            list.add(i)
        }
    }
}