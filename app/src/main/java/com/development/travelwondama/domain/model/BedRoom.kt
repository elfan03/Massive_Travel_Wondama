package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BedRoom(
    val id: Int,
    val name: String,
    val type: String,
    val pricePerNight: Int,
    val specificBedroom: List<SpecificBedroom>,
    val facilities: List<Facilities>,
    val imageList: List<ImagesHotel>
): Parcelable