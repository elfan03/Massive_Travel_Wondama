package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SpecificBedroom(
    val specific: String,
    val icon: Int
): Parcelable
