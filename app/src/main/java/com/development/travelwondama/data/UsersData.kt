package com.development.travelwondama.data

import com.development.travelwondama.domain.model.User

object UsersData {
    val dummyUser = User(
        id = 1,
        name = "Regina Bara",
        telephone = 82199094203,
        email = "reginabara@gmail.com",
        address = "Jl Amban Pantai no 19",
        password = "reginabara",
        imageProfile = "https://media.vanityfair.com/photos/5d07ad7476711f48937fe6ed/master/w_1920,c_limit/American-Woman-Miller.jpg"
    )
}