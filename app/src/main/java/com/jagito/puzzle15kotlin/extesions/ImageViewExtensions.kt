package com.jagito.puzzle15kotlin.extesions

import android.os.Build
import android.widget.ImageView
import androidx.annotation.ColorRes
import com.jagito.puzzle15kotlin.R
import com.jagito.puzzle15kotlin.extesions.dp
import com.squareup.picasso.Picasso

fun ImageView.setTint(@ColorRes colorRes: Int) {
    val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        resources.getColor(colorRes, context.theme)
    } else {
        resources.getColor(colorRes)
    }
    setColorFilter(color)
}

fun ImageView.loadFromUrl(url: String) {
    Picasso.get()
        .load(url)
        .resize(80.dp, 80.dp)
        .centerCrop()
        .placeholder(R.drawable.ic_launcher_background)
        .into(this)
}