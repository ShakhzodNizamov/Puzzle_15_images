package com.jagito.puzzle15kotlin.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jagito.puzzle15kotlin.R
import com.jagito.puzzle15kotlin.data.ListData
import kotlinx.android.synthetic.main.item.view.*

class LAdapter(val data: List<ListData>) :
    RecyclerView.Adapter<LAdapter.ViewHolder>() {
    private var listener: ItemListener? = null

    fun setOnClickListener(f: ItemListener) {
        listener = f
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            view.apply {
                item.setOnClickListener {
                    listener?.invoke(adapterPosition)
                }
            }
        }

        fun bind() {
            val d = data[adapterPosition]
            itemView.apply {
                img_item.setImageResource(d.img)
                text_item.text = d.level
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()


}
typealias ItemListener = (Int) -> Unit