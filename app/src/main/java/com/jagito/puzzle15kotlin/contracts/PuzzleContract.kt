package com.jagito.puzzle15kotlin.contracts

import com.jagito.puzzle15kotlin.data.Base
import com.jagito.puzzle15kotlin.data.LevelData
import com.jagito.puzzle15kotlin.models.Coordinate
import com.jagito.puzzle15kotlin.models.LocalStorage

interface PuzzleContract {
    interface Model {
        val numbers: List<Int>
        val pref: LocalStorage
        fun getImages(level:Int):ArrayList<Int>
    }

    interface View {
        fun finishGame()
        fun loadData(data: List<String>, images: ArrayList<Int>)
        fun setElementText(coordinate: Coordinate, s: String)
        fun getElementText(coordinate: Coordinate): String
        fun setScore(score: Int)
        fun showWin(score: Int)
        fun startTimer(base: Long = 0)
        fun getBaseTime(): Long
        fun showConfirmDialog()
        fun hideConfirmDialog()
    }

    interface Presenter {
        fun saveData()
        fun finish()
        fun startGame(level: Int)
        fun restart()
        fun onResume()
        fun click(coordinate: Coordinate)
        fun onClickNoInConfirm()
        var space: Coordinate
        var step: Int
    }
}