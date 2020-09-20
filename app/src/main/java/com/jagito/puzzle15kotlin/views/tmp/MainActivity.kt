package com.jagito.puzzle15kotlin.views.tmp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.jagito.puzzle15kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_play.setOnClickListener {
            startActivity(
                Intent(this, ListActivity::class.java)
            )
        }
        main_about.setOnClickListener {
            startActivity(
                Intent(this, AboutActivity::class.java)
            )
        }
        main_exit.setOnClickListener { finish() }
    }
}