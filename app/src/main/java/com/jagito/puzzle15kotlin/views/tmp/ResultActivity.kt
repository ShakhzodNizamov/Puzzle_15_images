package com.jagito.puzzle15kotlin.views.tmp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Chronometer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jagito.puzzle15kotlin.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val bundle = intent.extras

        if (bundle != null) {
            result_score.text = "SCORE: " + bundle.getInt("SCORE", 0)
            result_time.text = bundle.getString("TIME", "--:--").toString()
        }
        result_main.setOnClickListener {
            setResult(1)
            finish()
        }
        result_restart.setOnClickListener {
            setResult(2)
            finish()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("SCORE", result_score.text as String)
        outState.putString("TIME", result_time.text as String)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        result_score.text = savedInstanceState["SCORE"] as String
        result_time.text = savedInstanceState["TIME"] as String
    }
}
