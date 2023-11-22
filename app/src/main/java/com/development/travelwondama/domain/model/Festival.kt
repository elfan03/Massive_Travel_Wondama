package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Festival(
    val id: Int,
    val title: String,
    val date: String,
    val description: String,
    val imageUrl: String
): Parcelable
