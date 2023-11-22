package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tourism(
    val id: Int,
    val name: String,
    val rating: Double,
    val totalReview: Int,
    val address: String = "",
    val description: String,
    val imageUrl: String,
    val imageList: List<ImageTourism>
) : Parcelable
