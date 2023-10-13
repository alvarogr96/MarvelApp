package com.alvarogomez.marvelapp.presentation.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadImageWithPicasso(path: String) {
    Picasso.get().load(path).into(this)
}