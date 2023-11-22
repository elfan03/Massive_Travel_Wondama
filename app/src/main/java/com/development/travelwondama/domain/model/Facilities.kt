package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Facilities(
    val id: Int,
    val facility: String,
    val icon: Int
) : Parcelable
