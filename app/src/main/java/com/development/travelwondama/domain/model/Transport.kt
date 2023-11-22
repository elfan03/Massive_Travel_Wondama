package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Transport(
    val id: Int,
    val name: String,
    val goal: String,
    val timeStart: String,
    val timeFinish: String,
    val travelTime: String,
    val imageUrl: String,
): Parcelable
