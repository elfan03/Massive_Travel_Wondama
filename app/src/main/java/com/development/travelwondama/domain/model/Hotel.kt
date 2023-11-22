package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hotel(
    val id: Int,
    val name: String,
    val rating: Double,
    val totalReview: Int,
    val slogan: String,
    val imageCover: String,
    val address: String,
    val bedRoom: List<BedRoom>,
): Parcelable
