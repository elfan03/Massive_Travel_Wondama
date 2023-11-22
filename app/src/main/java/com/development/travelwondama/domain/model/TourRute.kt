package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourRute(
    val id: String,
    val location: String,
): Parcelable
