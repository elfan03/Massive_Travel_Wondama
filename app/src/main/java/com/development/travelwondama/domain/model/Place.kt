package com.development.travelwondama.domain.model

data class Place(
    val id: Int,
    val name: String,
    val photoUrl: String,
    val lat: Double,
    val long: Double
)
