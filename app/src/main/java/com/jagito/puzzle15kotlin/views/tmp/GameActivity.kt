package com.jagito.puzzle15kotlin.views.tmp

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.jagito.puzzle15kotlin.R
import com.jagito.puzzle15kotlin.contracts.PuzzleContract
import com.jagito.puzzle15kotlin.data.LevelData
import com.jagito.puzzle15kotlin.models.Coordinate
import com.jagito.puzzle15kotlin.models.LocalStorage
import com.jagito.puzzle15kotlin.models.PuzzleRepository
import com.jagito.puzzle15kotlin.presanters.PuzzlePresenter
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(), PuzzleContract.View {
    private lateinit var presenter: PuzzleContract.Presenter
    private lateinit var buttons: Array<Array<Button>>
    private lateinit var strings: Array<String>
    private val preferences by lazy { LocalStorage(this) }
    private val size = 4
    private val imagesData = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        title = "Game"

        val b = intent.extras
        presenter = PuzzlePresenter(this, PuzzleRepository(preferences))
        if (b != null) {
            val level = b.get("LEVEL").toString().toInt()
            loadViews()
            presenter.startGame(level + 1)
        }
    }

    override fun onStop() {
        super.onStop()
        presenter.saveData()
        textTimer.stop()
    }

    override fun onPause() {
        super.onPause()
        presenter.saveData()
        textTimer.stop()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    private fun loadViews() {
        strings = Array(size * size) { "" }
        buttons = Array(size) { Array(size) { Button(this) } }

        buttonToBack.setOnClickListener { presenter.finish() }
        buttonRestart.setOnClickListener { presenter.restart() }
        btn_continue_confirm.setOnClickListener { presenter.restart() }
        btn_cancel_confirm.setOnClickListener { presenter.onClickNoInConfirm() }

        val group = findViewById<ViewGroup>(R.id.group)
        for (i in 0 until group.childCount) {
            val button = group.getChildAt(i) as Button
            buttons[i / size][i % size] = button
            button.setOnClickListener { v: View ->
                presenter.click(
                    v.tag as Coordinate
                )
            }
            button.tag = Coordinate(i / size, i % size)
        }
    }

    override fun finishGame() {
        finish()
    }

    override fun loadData(data: List<String>, images: ArrayList<Int>) {
        imagesData.addAll(images)
        for (i in data.indices) {
            buttons[i / size][i % size].text = data[i]
            if (data[i].isNotEmpty())
                buttons[i / size][i % size].setBackgroundResource(images[data[i].toInt()])
        }
    }

    override fun setElementText(coordinate: Coordinate, s: String) {
        buttons[coordinate.x][coordinate.y].text = s
        if (s.isNotEmpty())
            buttons[coordinate.x][coordinate.y].setBackgroundResource(imagesData[s.toInt()])
        else
            buttons[coordinate.x][coordinate.y].setBackgroundResource(R.drawable.bg_button)
    }

    override fun getElementText(coordinate: Coordinate): String {
        return buttons[coordinate.x][coordinate.y].text.toString()
    }

    override fun setScore(score: Int) {
        textScore.text = score.toString()
    }

    override fun showWin(score: Int) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("TIME", textTimer.text)
        startActivityForResult(intent, 1)
    }

    override fun startTimer(base: Long) {
        Log.d("LOL", "time= $base")
        if (base == 0L) {
            textTimer.stop()
            textTimer.base = SystemClock.elapsedRealtime()
            textTimer.start()
        } else {
            //textTimer.stop()
            textTimer.base = base
            textTimer.start()
        }
    }

    override fun getBaseTime(): Long {
        return SystemClock.elapsedRealtime()
    }

    override fun showConfirmDialog() {
        confirm_layout.visibility = View.VISIBLE
    }

    override fun hideConfirmDialog() {
        confirm_layout.visibility = View.INVISIBLE
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 1) {
            finish()
        }
        if (resultCode == 2) {
            presenter = PuzzlePresenter(this, PuzzleRepository(preferences))
            presenter.restart()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        for (i in 0 until size * size) {
            strings[i] = buttons[i / size][i % size].text.toString()
        }
        outState.putStringArray("BUTTONS", strings)
        outState.putLong("TIME", textTimer.base)
        outState.putString("SCORE", textScore.text as String)
        outState.putInt("SPACE_X", presenter.space.x)
        outState.putInt("SPACE_Y", presenter.space.y)
        outState.putInt("STEP", presenter.step)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        presenter.restart()
    }
}