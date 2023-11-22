package com.development.travelwondama.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val telephone: Long,
    val email: String,
    val address: String,
    val imageProfile: String,
    val password: String,
): Parcelable
