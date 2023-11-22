package com.development.travelwondama.data

import com.development.travelwondama.domain.model.Transport

object TransportsData {
    val dummyShip = listOf(
        Transport(
            id = 1,
            name = "KM.GUNUNG DEMPO EKONOMI EKS KABIN KLS 1/A",
            goal = "Manokwari - Wasior",
            timeStart = "Rabu, 06 September 2023 17.00",
            timeFinish = "Kamis, 07 September 2023 00.01",
            travelTime = "07 Jam 01 Menit",
            imageUrl = "https://asset-2.tstatic.net/papua/foto/bank/images/Kapal-Motor-KM-Gunung-Dempo-sandar-di-Pelabuhan-Manokwari.jpg"
        ),
        Transport(
            id = 2,
            name = "KM. GUNUNG DEMPO EKONOMI EKS KABIN KLS 2/B",
            goal = "Manokwari - Wasior",
            timeStart = "Rabu, 06 September 2023 00.30",
            timeFinish = "Kamis, 07 September 2023 08.00",
            travelTime = "05 Jam 02 Menit",
            imageUrl = "https://asset-2.tstatic.net/papua/foto/bank/images/KM-Ciremai.jpg"
        )
    )

    val dummyPlane = listOf(
        Transport(
            id = 1,
            name = "Susi Air",
            goal = "Manokwari - Wasior",
            timeStart = "setiap hari selasa",
            timeFinish = "Setiap hari selasa",
            travelTime = "50 Menit",
            imageUrl = "http://wondamakab.go.id/lib/filemanager/userfiles/bandara.jpg"
        ),
        Transport(
            id = 2,
            name = "Susi Air",
            goal = "Manokwari - Wasior",
            timeStart = "setiap hari kamis",
            timeFinish = "Setiap hari kamis",
            travelTime = "50 Menit",
            imageUrl = "http://wondamakab.go.id/lib/filemanager/userfiles/susiair.jpg"
        ),
    )
}