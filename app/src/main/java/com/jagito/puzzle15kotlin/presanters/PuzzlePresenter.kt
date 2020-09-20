package com.jagito.puzzle15kotlin.presanters

import com.jagito.puzzle15kotlin.contracts.PuzzleContract
import com.jagito.puzzle15kotlin.models.Coordinate

class PuzzlePresenter(
    private val view: PuzzleContract.View,
    private val model: PuzzleContract.Model
) :
    PuzzleContract.Presenter {
    override var space: Coordinate = Coordinate(3, 3)
    override var step = 0
    private var level: Int = -1
    override fun saveData() {
        model.pref.isSaved = true
        model.pref.score = step
        model.pref.coordinateX = space.x
        model.pref.coordinateY = space.y
        model.pref.endTime = view.getBaseTime()
        model.pref.buttonsPos = getButtonsPos()
    }

    private fun getButtonsPos(): ArrayList<String> {
        val ls = ArrayList<String>()
        for (i in 0..15) {
            ls.add(view.getElementText(Coordinate(i / 4, i % 4)))
        }
        return ls
    }

    override fun finish() {
        view.finishGame()
    }

    override fun startGame(level: Int) {
        this.level = level
        if (model.pref.isSaved) {
            view.showConfirmDialog()
        } else {
            restart()
        }
    }

    override fun restart() {
        val levelImages = model.getImages(level)

        view.hideConfirmDialog()
        if (model.pref.isSaved) {
            view.setScore(model.pref.score)
            step = model.pref.score
            val setTime = view.getBaseTime() - (model.pref.endTime - model.pref.beginTime)
            view.startTimer(setTime)
            model.pref.beginTime = view.getBaseTime() - (model.pref.endTime - model.pref.beginTime)
            space = Coordinate(model.pref.coordinateX, model.pref.coordinateY)
            view.loadData(model.pref.buttonsPos, levelImages)
        } else {
            step = 0
            view.setScore(step)
            space = Coordinate(3, 3)
            view.setElementText(space, "")
            view.loadData(getNumbersToString(), levelImages)
            view.startTimer()
            model.pref.beginTime = view.getBaseTime()
        }
        model.pref.isSaved = false
    }

    override fun onResume() {
        val setTime = view.getBaseTime() - (model.pref.endTime - model.pref.beginTime)
        view.startTimer(setTime)
    }

    override fun click(coordinate: Coordinate) {
        val dx: Int = kotlin.math.abs(space.x - coordinate.x)
        val dy: Int = kotlin.math.abs(space.y - coordinate.y)
        if (dx + dy == 1) {
            step++
            view.setScore(step)
            val t1: String = view.getElementText(coordinate)
            view.setElementText(space, t1)
            view.setElementText(coordinate, "")
            space = coordinate
        }
        if (isWin) {
            view.showWin(step)
            model.pref.clear()
        }
    }

    override fun onClickNoInConfirm() {
        model.pref.isSaved = false
        restart()
    }

    private fun getNumbersToString(): ArrayList<String> {
        val ls = ArrayList<String>()
        for (i in model.numbers) {
            ls.add(i.toString())
        }
        return ls
    }

    private val isWin: Boolean
        get() {
            if (space.y != 3 || space.x != 3) return false
            for (i in 0..14) {
                val text: String = view.getElementText(Coordinate(i / 4, i % 4))
                if (text != (i + 1).toString()) {
                    return false
                }
            }
            return true
        }
}
