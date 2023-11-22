package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ksp(
    val id: Int,
    val title: String,
    val place: String,
    val imageUrl: String,
    val category: List<String>,
    val tourismCulture: List<Tourism>,
    val tourismBahari: List<Tourism>,
    val tourismHistory: List<Tourism>,
) : Parcelable