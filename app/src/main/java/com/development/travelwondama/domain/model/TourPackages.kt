package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourPackages(
    val id: Int,
    val name: String,
    val nameDesc: String,
    val rating: Double,
    val totalReview: Int,
    val price: Int,
    val imageList: List<ImageTourism>,
    val description: String,
    val activity: List<TourRute>,
): Parcelable