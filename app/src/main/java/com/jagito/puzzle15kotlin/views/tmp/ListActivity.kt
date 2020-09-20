package com.jagito.puzzle15kotlin.views.tmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jagito.puzzle15kotlin.R
import com.jagito.puzzle15kotlin.adapters.LAdapter
import com.jagito.puzzle15kotlin.data.Base
import com.jagito.puzzle15kotlin.data.ListData
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val ls = ArrayList<ListData>()
    private val adapter = LAdapter(ls)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        ls.add(ListData(R.drawable.level_1_1,"Level 1"))
        ls.add(ListData(R.drawable.level_2_2,"Level 2"))
        ls.add(ListData(R.drawable.level_3_3,"Level 3"))
        ls.add(ListData(R.drawable.level_4_4,"Level 4"))
        ls.add(ListData(R.drawable.level_5_5,"Level 5"))
        ls.add(ListData(R.drawable.level_6_6,"Level 6"))
        ls.add(ListData(R.drawable.level_7_7,"Level 7"))
        ls.add(ListData(R.drawable.level_8_8,"Level 8"))
        ls.add(ListData(R.drawable.level_9_9,"Level 9"))
        ls.add(ListData(R.drawable.level_10_10,"Level 10"))

        list_item.adapter = adapter
        list_item.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java).putExtra("LEVEL", it))
        }
    }
}