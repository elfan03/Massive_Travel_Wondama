package com.development.travelwondama.data

import com.development.travelwondama.R
import com.development.travelwondama.domain.model.BedRoom
import com.development.travelwondama.domain.model.Facilities
import com.development.travelwondama.domain.model.Hotel
import com.development.travelwondama.domain.model.ImagesHotel
import com.development.travelwondama.domain.model.SpecificBedroom

object HotelsData {
    val dummyHotels = listOf(
        Hotel(
            id = 1,
            name = "Brar homestay",
            rating = 4.5,
            totalReview = 24,
            slogan = "Bungalow pribadi di atas pasir, semua kenikmatan laut dan pusat menyelam di pantai utara Kri, dan pantai yang menakjubkan di teluk yang damai dan terpencil.",
            imageCover = "https://www.stayrajaampat.com/wp-content/uploads/2016/07/dti1606idn1550.jpg",
            address = "Pulau Mansuar Kecil (Kri, Yenbuba, Meos Mansar, Raja Ampat Regency, West Papua",
            bedRoom = listOf(
                BedRoom(
                    id = 1,
                    name = "Kamar Standart Twin",
                    type = "VIP",
                    pricePerNight = 500000,
                    specificBedroom = listOf(
                        SpecificBedroom(
                            icon = R.drawable.outline_bed,
                            specific = "2 Single"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.ic_house_size,
                            specific = "Ukuran 19 m"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_sync_disabled,
                            specific = "Non-Refundable"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_account_balance_wallet,
                            specific = "Bayar di awal"
                        )
                    ),
                    imageList = listOf(
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/07/Brar_Homestay_Raja_Ampat_Feb_2023-01.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/07/Brar_Homestay_Raja_Ampat_Feb_2023-03.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/07/Brar_Homestay_Raja_Ampat_Feb_2023-08.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/07/Brar_Homestay_Raja_Ampat_Feb_2023-09.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/07/Brar_Homestay_Raja_Ampat_Feb_2023-10.jpg")
                    ),
                    facilities = listOf(
                        Facilities(
                            id = 1,
                            icon = R.drawable.baseline_wifi,
                            facility = "Free Wifi"
                        ),
                        Facilities(
                            id = 2,
                            icon = R.drawable.baseline_tv,
                            facility = "TV LED"
                        ),
                        Facilities(
                            id = 3,
                            icon = R.drawable.baseline_shower,
                            facility = "Shower"
                        ),
                        Facilities(
                            id = 3,
                            icon = R.drawable.baseline_fastfood_24,
                            facility = "Restaurant"
                        )
                    )
                ),
                BedRoom(
                    id = 2,
                    name = "Kamar Single",
                    type = "VIP",
                    pricePerNight = 370590,
                    imageList = listOf(
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Apr_2023-02.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Mar_2023-01.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Mar_2023-02.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-01.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-03.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-02.jpg")
                    ),
                    specificBedroom = listOf(
                        SpecificBedroom(
                            icon = R.drawable.outline_bed,
                            specific = "1 Single"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.ic_house_size,
                            specific = "Ukuran 25 m"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_sync_disabled,
                            specific = "Non-Refundable"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_account_balance_wallet,
                            specific = "Bayar di awal"
                        )
                    ),
                    facilities = listOf(
                        Facilities(
                            id = 1,
                            icon = R.drawable.baseline_wifi,
                            facility = "Free Wifi"
                        ),
                        Facilities(
                            id = 2,
                            icon = R.drawable.baseline_local_parking,
                            facility = "Free Parkir"
                        ),
                        Facilities(
                            id = 3,
                            icon = R.drawable.baseline_beach_access,
                            facility = "Area Pantai"
                        ),
                    ),
                )
            )
        ),
        Hotel(
            id = 2,
            name = "Blue Ocean Lodge",
            rating = 4.0,
            totalReview = 12,
            slogan = "Bungalo bulan madu di atas air yang penuh kasih sayang, sangat pribadi, di tengah hutan bakau, kehidupan burung, dan karang di dekat desa Kapisawar Gam.",
            imageCover = "https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-01.jpg",
            address = "Kampung yenbuba, Distrik meosmansar, 98472 Kri, Indonesia",
            bedRoom = listOf(
                BedRoom(
                    id = 1,
                    name = "Kamar Standart Double",
                    type = "VIP",
                    pricePerNight = 470590,
                    imageList = listOf(
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-04.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-05.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-08.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-03.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2023/01/Blue_Ocean_Lodge_Raja_Ampat_Dec2022-04.jpg"),
                    ),
                    specificBedroom = listOf(
                        SpecificBedroom(
                            icon = R.drawable.outline_bed,
                            specific = "1 Single"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.ic_house_size,
                            specific = "Ukuran 20 m"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_sync_disabled,
                            specific = "Non-Refundable"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_account_balance_wallet,
                            specific = "Bayar di awal"
                        )
                    ),
                    facilities = listOf(
                        Facilities(
                            id = 1,
                            icon = R.drawable.baseline_smoke_free,
                            facility = "Bebas Rokok"
                        ),
                        Facilities(
                            id = 2,
                            icon = R.drawable.baseline_local_parking,
                            facility = "Free Parkir"
                        ),
                        Facilities(
                            id = 3,
                            icon = R.drawable.baseline_wifi,
                            facility = "Free Wifi"
                        ),
                        Facilities(
                            id = 4,
                            icon = R.drawable.baseline_beach_access,
                            facility = "Area Pantai"
                        ),
                        Facilities(
                            id = 4,
                            icon = R.drawable.baseline_fastfood_24,
                            facility = "Restaurant"
                        )
                    ),
                )
            ),
        ),
        Hotel(
            id = 3,
            name = "Kayafyof Homestay",
            rating = 5.0,
            totalReview = 14,
            slogan = "Pemandangan Selat Dampier dan Batanta dari bungalow pantai pribadi di pantai selatan Pulau Arborek. Menyelam, manta, dan kehidupan desa semuanya dekat.",
            imageCover = "https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Apr_2023-01.jpg",
            address = "Pulau Arborek, Kabupaten Raja Ampat, Papua Barat",
            bedRoom = listOf(
                BedRoom(
                    id = 1,
                    name = "Kamar Twin",
                    type = "VIP",
                    pricePerNight = 470590,
                    imageList = listOf(
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Apr_2023-02.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Mar_2023-01.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_Raja_Ampat_Mar_2023-02.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-01.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-03.jpg"),
                        ImagesHotel("https://www.stayrajaampat.com/wp-content/uploads/2016/11/Kayafyof_Homestay_SEPT2022-02.jpg")
                    ),
                    specificBedroom = listOf(
                        SpecificBedroom(
                            icon = R.drawable.outline_bed,
                            specific = "2 Single"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.ic_house_size,
                            specific = "Ukuran 25 m"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_sync_disabled,
                            specific = "Non-Refundable"
                        ),
                        SpecificBedroom(
                            icon = R.drawable.outline_account_balance_wallet,
                            specific = "Bayar di awal"
                        )
                    ),
                    facilities = listOf(
                        Facilities(
                            id = 1,
                            icon = R.drawable.baseline_wifi,
                            facility = "Free Wifi"
                        ),
                        Facilities(
                            id = 2,
                            icon = R.drawable.baseline_local_parking,
                            facility = "Free Parkir"
                        ),
                        Facilities(
                            id = 3,
                            icon = R.drawable.baseline_beach_access,
                            facility = "Area Pantai"
                        ),
                    )
                )
            ),
        )
    )
}
