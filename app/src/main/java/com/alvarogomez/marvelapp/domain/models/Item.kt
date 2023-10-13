package com.alvarogomez.marvelapp.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val name: String,
    val resourceURI: String
): Parcelable