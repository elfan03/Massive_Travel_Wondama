package com.development.travelwondama.data

import com.development.travelwondama.domain.model.ImageTourism
import com.development.travelwondama.domain.model.TourPackages
import com.development.travelwondama.domain.model.TourRute

object TourPackagesData {
    val dummyTourPackages = listOf(
        TourPackages(
            id = 1,
            name = "Paket Torowar 6D5N",
            nameDesc = "Mengunjungi Suku Torowar di Wondama Papua Barat 6 Hari/ 5 Malam",
            description = "Indonesia merupakan negara yang sangat kaya akan keberagaman suku, namun banyak suku pedalaman di Indonesia yang terisolasi dari dunia luar, salah satunya adalah suku Torowar.\n" +
                    "\n" +
                    "Torowar adalah nama suku salah satu suku terasing di Kabupaten Teluk Wondama, Papua Barat, Indonesia.\n" +
                    "\n" +
                    "Suku Torowar masih terisolasi dari dunia luar. Dalam pengertian konsep secara harafiah, suku terasing adalah komunitas suku yang hidup di pedalaman yang mempunyai segala keterbatasan.\n" +
                    "\n" +
                    "Suku Torowar berada di pedalaman Kabupaten Teluk Wondama, puluhan tahun yang lalu suku ini masih sangat primitif, sulit dijangkau, dan belum dikenal dunia luar. Hingga awal abad ke-21, suku ini dicapai dengan berjalan kaki selama empat hari 3 malam dari desa Wombu, dan sejak tahun 2022 pemerintah telah berhasil membangun jalan penghubung.\n" +
                    "Suku ini belum dikenal masyarakat luas, mereka mempunyai budaya membangun rumah adat yang berfungsi sebagai tempat berkumpul, tempat makan bersama, tempat pesta dan tempat ritual adat lainnya.\n",
            rating = 3.5,
            totalReview = 54,
            price = 26500000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/suku-torowar-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/suku-torowar-2.jpg"),
                ImageTourism("https://asset-a.grid.id/crop/0x0:0x0/700x0/photo/2020/01/28/4031224091.jpg")
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan berangkat dari pelabuhan Anggrem Manokwari menuju kota Wasior Kabupaten Teluk Wondama, wisatawan sampai di Wasior, dijemput dan diantar menuju penginapan."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Bersama wisatawan melakukan perjalanan menggunakan kendaraan roda empat (4WD) dari kota Wasior menuju desa undurara, wisatawan sampai di undurara suku Torowar kemudian diantar dengan prosesi penyambutan adat, pertemuan singkat dengan kepala desa, kepala suku dusun dan Masyarakat, makan bersama dari bahan makanan khas suku torowar."
                ),
                TourRute(
                    id = "Day 3",
                    location = "Wisatawan berkeliling desa mendengar dan melihat berbagai jenis burung yang berkicau di sekitar desa pada pagi hari, melihat burung cendrawasih kecil, melihat burung surga dua belas antena, melihat cara menjahit noken, cara menjahit tikar dan gelang. dari bahan lokal, melihat cara membuat pakaian (cawat) dari kulit kayu, makan siang diiringi musik tradisional, belajar bermain tifa, melihat tempat pembakaran sisa makanan, tulang satwa dan melihat aktivitas masyarakat lainnya di sore hari."
                ),
                TourRute(
                    id = "Day 4",
                    location = "Melakukan kegiatan berburu mencari binatang, memasang ranjau (jerat), wisatawan diajak berburu dan mencari ulat kayu, wisatawan belajar memanah dengan panah tradisional, bertemu dengan kepala suku Toro di hutan, menyaksikan kegiatan berkebun dan wisatawan diajak memanen hasil kebun. Makan malam bersama di rumah adat."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Sarapan pagi bersama, wisatawan diantar dengan prosesi adat menuju kendaraan yang ditumpangi, wisatawan kembali ke kota Wasior."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Wisatawan Berangkat kembali ke kota Manokwari, Papua Barat."
                )
            )
        ),
        TourPackages(
            id = 2,
            name = "Paket Terasing 11D10",
            nameDesc = "Menjelajah Suku Terasing di Wondama Papua Barat 11 Hari/ 10 Malam",
            description = "",
            rating = 4.0,
            totalReview = 40,
            price = 27000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/terasing-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/terasing-2.jpg"),
                ImageTourism("https://superlive.id/storage/superadventure/2018/08/16/58313dca287e.jpg")
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan Berangkat dari pelabuhan Anggrem Manokwari menuju kota wasior Kabupaten Teluk Wondama, wisatawan tiba di wasior kemudian dijemput dan  diantar ke tempat nginap."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Melakukan perjalanan dari kota wasior menuju kampung undurara, Wisatawan tiba di undurara suku torowar lalu dejumput dengan prosesi adat penyambutan, melakukan pertemuan singkat dengan kepala kampung, kepala suku dusun dan masyarakat,  makan bersama dari bahan makanan lokal."
                ),
                TourRute(
                    id = "Day 3",
                    location = "Wisatawan berjalan keliling kampun untuk mendengar dan melihat berbagai macam jenis burung yang berkicau keliling kampung di pagi hari, melihat burung surga kuning kecil, melihat burung surga dua belas antena, melihat cara menjahit noken, cara menjahit tikar dan gelang gelang dari bahan lokal, melihat cara membuat pakaian (cawat) dari bahan kulit kayu, makan siang diiringi dengan alunan musik tradisional khas suku toro, belajar bermain tifa, melihat tempat pembakaran sisa sisa makanan dan melihat aktivitas lain masyarakat di sore hari."
                ),
                TourRute(
                    id = "Day 4",
                    location = "Melakukan aktifitas berburu mencari binatang, memasang ranjau (jerat), wisatawan diajak berburu dan mencari ulat kayu, Wisatawan sekaligus belajar memanah dengan peralatan panah tradisional, Menemui kepala suku toro di hutan, melihat aktivitas berkebun dan wisatawan diajak memanen hasil kebun."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Tracking ke sungai mencari belut dan ikan, mengambil sayuran hutan dan melihat berbagai macam tumbuhan obat obatan di hutan."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Tracking ke hutan menjumpai masyarakat suku toro yang berada di hutan hutan, berkebun dan meramu."
                ),
                TourRute(
                    id = "Day 7",
                    location = "Trekking ke bukit anggut dan pasir putih di hutan."
                ),
                TourRute(
                    id = "Day 8",
                    location = "Menjelajahi bukit anggut, melihat berbagai jenis burung dan satwa liar lain, melihat tempat khusus pemakaman kepala suku."
                ),
                TourRute(
                    id = "Day 9",
                    location = "Kembali dari bukit anggut ke undurara."
                ),
                TourRute(
                    id = "Day 10",
                    location = "Sarapan pagi bersama, wisatawan diantar dengan prosesi adat ke kendaraan yang ditumpangi, wisatawan kembali ke kota wasior."
                ),
                TourRute(
                    id = "Day 11",
                    location = "Wisatawan Berangkat kembali ke kota manokwari papua barat."
                )
            )
        ),
        TourPackages(
            id = 3,
            name = "Paket Satwa 7D6N1",
            nameDesc = "Pengamatan Burung dan Satwa Liar di Pegunungan Wondiboy Wasior 7 Hari/6 Malam",
            description = "Mengamati burung dan satwa liar merupakan kegiatan yang disukai banyak wisatawan. Salah satu tempat yang terkenal di dunia adalah Pegunungan Wondiboi, namun atraksi pengamatan burung dan satwa liar lainnya belum dikenal di dunia.\n" +
                    "\n" +
                    "Pegunungan Wondiboi bisa menjadi tempat pendakian favorit bagi wisatawan pecinta alam dari seluruh dunia yang ingin melihat tumbuhan dan satwa endemik Papua.\n" +
                    "\n" +
                    "Terletak di Teluk Wundama atau Semenanjung Wandammen, Pegunungan Womdiboi dapat dicapai dengan mudah dengan berjalan kaki dari tempat tinggal wisatawan. Di pinggiran pegunungan dan lereng Pegunungan Wondiboi, wisatawan bisa melihat berbagai jenis burung seperti burung cendrawasih, kakatua putih, taun taun/rangkong, kakatua raja, kakatua, dan lain-lain\n",
            rating = 5.0,
            totalReview = 39,
            price = 15000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/wandiboy-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/wandiboy-2.jpg"),
                ImageTourism("https://superlive.id/storage/superadventure/2018/08/16/58313dca287e.jpg")
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan sampai di Wasior kemudian dijemput dan diantar menuju penginapan. Sarapan pagi, setelah itu melakukan trekking ke hutan menuju basecamp 1 yang berada di ketinggian 600 meter di atas permukaan laut, wisatawan dapat mengamati berbagai jenis burung, kupu-kupu, serangga selama perjalanan. Telusuri aliran sungai dan lihat berbagai macam tanaman dan obat-obatan tradisional. Di basecamp 1 wisatawan dapat melihat burung cendrawasih kecil, jika beruntung dapat melihat kanguru Pohon Grizzled, (dendrolagus inustus)."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Perjalanan dari basecamp 1 menuju basecamp 2. Selama perjalanan wisatawan dapat mengamati berbagai jenis burung, kupu-kupu, serangga, tumbuhan hutan dan satwa liar lainnya baik jenis dataran rendah maupun dataran tinggi."
                ),
                TourRute(
                    id = "Day 3",
                    location = "Melakukan kegiatan pengamatan burung di sekitar lokasi basecamp 2 yang berada pada ketinggian 1250 meter diatas permukaan laut. Di lokasi basecamp 2 wisatawan dapat melihat berbagai jenis burung dataran tinggi, wisatawan dapat menjumpai kuskus ekor kait, kuskus, kanguru tanah kecil atau walabi hutan sejenis kanguru pohon vogelkop (dendrolagus ursinus). Selanjutnya melakukan trekking ke basecamp 3 yang berada di ketinggian 1.500 mdpl."
                ),
                TourRute(
                    id = "Day 4",
                    location = "Melakukan observasi sepanjang perjalanan menuju basecamp 3 yang berada pada ketinggian 1500 meter diatas permukaan laut. Wisatawan bisa melihat Burung Bowerbird, dan berbagai jenis burung endemik lainnya, jika beruntung bisa menjumpai kanguru pohon wondiwoi (dendrolagus mayri), melihat pohon pisang raksasa yang tingginya sekitar 15-20 meter."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Melihat burung bowerbird dan sarang burung bower yang dihias dengan bahan-bahan alami berwarna-warni. Melakukan observasi melihat kanguru pohon wondiwoi (dendrolagus mayri), melihat burung black sicklebill, western parotia, superb bird of paradise, dan berbagai burung endemic wondiwoi lainnya."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Lakukan perjalanan kembali ke kota."
                ),
                TourRute(
                    id = "Day 7",
                    location = "Wisatawan Berangkat kembali ke kota Manokwari, Papua Barat."
                )
            )
        ),
        TourPackages(
            id = 4,
            name = "Paket Satwa 7D6N2",
            nameDesc = "Pengamatan Burung dan Satwa Liar di Pegunungan Wondiboy Wasior 7 Hari/6 Malam",
            description = "Mengamati burung dan satwa liar merupakan kegiatan yang disukai banyak wisatawan. Salah satu tempat yang terkenal di dunia adalah Pegunungan Wondiboi, namun atraksi pengamatan burung dan satwa liar lainnya belum dikenal di dunia.\n" +
                    "\n" +
                    "Pegunungan Wondiboi bisa menjadi tempat pendakian favorit bagi wisatawan pecinta alam dari seluruh dunia yang ingin melihat tumbuhan dan satwa endemik Papua.\n" +
                    "\n" +
                    "Terletak di Teluk Wundama atau Semenanjung Wandammen, Pegunungan Womdiboi dapat dicapai dengan mudah dengan berjalan kaki dari tempat tinggal wisatawan. Di pinggiran pegunungan dan lereng Pegunungan Wondiboi, wisatawan bisa melihat berbagai jenis burung seperti burung cendrawasih, kakatua putih, taun taun/rangkong, kakatua raja, kakatua, dan lain-lain\n",
            rating = 5.0,
            totalReview = 39,
            price = 28000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/satwa2-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/satwa2-2.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/satwa2-3.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/satwa2-4.jpg")
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan sampai di Wasior kemudian dijemput dan diantar menuju penginapan. Sarapan pagi, setelah itu melakukan trekking ke hutan menuju basecamp 1 yang berada di ketinggian 600 meter di atas permukaan laut, wisatawan dapat mengamati berbagai jenis burung, kupu-kupu, serangga selama perjalanan. Telusuri aliran sungai dan lihat berbagai macam tanaman dan obat-obatan tradisional. Di basecamp 1 wisatawan dapat melihat burung cendrawasih kecil, jika beruntung dapat melihat kanguru Pohon Grizzled, (dendrolagus inustus)."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Perjalanan dari basecamp 1 menuju basecamp 2. Selama perjalanan wisatawan dapat mengamati berbagai jenis burung, kupu-kupu, serangga, tumbuhan hutan dan satwa liar lainnya baik jenis dataran rendah maupun dataran tinggi."
                ),
                TourRute(
                    id = "Day 3",
                    location = "Melakukan kegiatan pengamatan burung di sekitar lokasi basecamp 2 yang berada pada ketinggian 1250 meter diatas permukaan laut. Di lokasi basecamp 2 wisatawan dapat melihat berbagai jenis burung dataran tinggi, wisatawan dapat menjumpai kuskus ekor kait, kuskus, kanguru tanah kecil atau walabi hutan sejenis kanguru pohon vogelkop (dendrolagus ursinus). Selanjutnya melakukan trekking ke basecamp 3 yang berada di ketinggian 1.500 mdpl."
                ),
                TourRute(
                    id = "Day 4",
                    location = "Melakukan observasi sepanjang perjalanan menuju basecamp 3 yang berada pada ketinggian 1500 meter diatas permukaan laut. Wisatawan bisa melihat Burung Bowerbird, dan berbagai jenis burung endemik lainnya, jika beruntung bisa menjumpai kanguru pohon wondiwoi (dendrolagus mayri), melihat pohon pisang raksasa yang tingginya sekitar 15-20 meter."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Melihat burung bowerbird dan sarang burung bower yang dihias dengan bahan-bahan alami berwarna-warni. Melakukan observasi melihat kanguru pohon wondiwoi (dendrolagus mayri), melihat burung black sicklebill, western parotia, superb bird of paradise, dan berbagai burung endemic wondiwoi lainnya."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Lakukan perjalanan kembali ke kota."
                ),
                TourRute(
                    id = "Day 7",
                    location = "Wisatawan Berangkat kembali ke kota Manokwari, Papua Barat."
                )
            )
        ),
        TourPackages(
            id = 5,
            name = "Paket Rumberpon 7D5N",
            nameDesc = "Jelajahi Pulau Rumberpon di Wondama Papua Barat",
            description = "Mengamati burung dan satwa liar merupakan kegiatan yang disukai banyak wisatawan. Salah satu tempat yang terkenal di dunia adalah Pegunungan Wondiboi, namun atraksi pengamatan burung dan satwa liar lainnya belum dikenal di dunia.\n" +
                    "\n" +
                    "Pegunungan Wondiboi bisa menjadi tempat pendakian favorit bagi wisatawan pecinta alam dari seluruh dunia yang ingin melihat tumbuhan dan satwa endemik Papua.\n" +
                    "\n" +
                    "Terletak di Teluk Wundama atau Semenanjung Wandammen, Pegunungan Womdiboi dapat dicapai dengan mudah dengan berjalan kaki dari tempat tinggal wisatawan. Di pinggiran pegunungan dan lereng Pegunungan Wondiboi, wisatawan bisa melihat berbagai jenis burung seperti burung cendrawasih, kakatua putih, taun taun/rangkong, kakatua raja, kakatua, dan lain-lain\n",
            rating = 5.0,
            totalReview = 39,
            price = 28000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-2.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-3.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-4.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-5.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-6.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Rumberpon-7.jpg"),
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan tiba di Pelabuhan wasior, dijemput dan diantar ke penginapan dan makan malam."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Perjalanan dari wasior menuju pulau rumberpon kampung yembekiri. Melakukan lapor tiba dan pertemuan singkat dengan Masyarakat. Wisatawan akan snorkeling keliling pulau nusorowi."
                ),
                TourRute(
                    id = "Day 3",
                    location = "berjalan keliling kampung dan melihat aktivitas kehidupan Masyarakat, menikmati sarapan pagi dan dihibur dengan tari tradisional dan music tradisional suling tambur. Wisatawan disilahkan untuk belajar Meniup Suling dan memainkan  Tambur. Melakukan snorkeling di terumbu karang. Selanjutnya melakukan perjalanan ke kampung yomakan."
                ),
                TourRute(
                    id = "Day 4",
                    location = "berjalan keliling kampung dan melihat aktivitas kehidupan Masyarakat, Mengunjungi Pulau Kelapa satu, pulau apimasum, laguna maniondawi, gambar prasejarah dan snorkeling di terumbu karang di pulau purup."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Snorkeling keliling terumbu karang di pulau purup. Kembali ke kota wasior."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Wisatawan Kembali ke kota manokwari, papua barat."
                )
            )
        ),
        TourPackages(
            id = 6,
            name = "Paket Roon 7D6N",
            nameDesc = "Jelajahi Pulau Roon di Wondama Papua Barat",
            description = "Mulailah dengan menjelajahi keindahan alam Pulau Roon, pulau terluar di semenanjung pegunungan wondiboy yang 100% wilayahnya masuk dalam Kawasan Taman Nasional Teluk Cendrawasi, menikmati keindahan dunia bawah air yang menakjubkan, mengunjungi pulau pulau eksotik dan situs bersejarah hingga melihat tengkorak manusia purba dan gambar prasejarah.\n" +
                    "\n" +
                    "Roon adalah salah satu Distrik yang berada di wilayah Pemerintahan Kabupaten Teluk Wondama, berada di ujung semenanjung wandamen, Roon memiliki banyak keaneka ragaman hayati, flora dan fauna hingga budayanya yang khas.\n" +
                    "\n" +
                    "Roon identik dengan Sejarah Penginjilan agama kristen yang dibawakan oleh Godlief  Lodwik Bink misionaris asal belanda pada tahun 1884, dari sinilah agama kristen mulai disebarkan hampir ke seluruh pelosok tanah papua. Di Yende Roon terdapat peninggalan bangunan Gereja Tertua, Makam Misionaris, Batu Doa, hingga Alkitab tua berbahasa melayu terbitan belanda tahun 1898.\n",
            rating = 5.0,
            totalReview = 39,
            price = 35000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Roon-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Roon-2.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Roon-3.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Roon-4.jpg"),
            ),
            activity = listOf(
                TourRute(
                    id = "Day 1",
                    location = "Wisatawan tiba di Pelabuhan kota wasior, dijemput dan diantar ke penginapan."
                ),
                TourRute(
                    id = "Day 2",
                    location = "Melakukan perjalanan dari wasior menuju pulau roon. Melakukan lapor tiba. berjalan keliling kampung dan melihat aktivitas kehidupan masyarakat. Diiringi dengan musik suling bambu (taditional music). Menyaksikan tarian tradisional dan mengunjungi gereja tua, makam misionaris, alkitab tua, dan batu doa misionaris asal eropa."
                ),
                TourRute(
                    id = "Day 3",
                    location = "Mengunjungi pulau Lubang, pulau kelelawar, rariei (Trekking to bukit teletubies), melakukan snorkeling di terumbu karang di pulau raryau."
                ),
                TourRute(
                    id = "Day 4",
                    location = "Jelajahi kepulauan Auri, melihat pulau-pulau eksotik, melihat bangkai Pesawat Perang Dunia ke 2, snorkeling di trumbu karang."
                ),
                TourRute(
                    id = "Day 5",
                    location = "Snorkeling di terumbu karang kampung menarbu, memberi makan ikan, snorkeling di terumbu karang kampung saryai, melihat gambar prasejarah dan tengkorak manusia purba. menyaksikan tarian tardisional swanggini."
                ),
                TourRute(
                    id = "Day 6",
                    location = "Snorkeling di terumbu karang di kampung saryai, selanjutnya wisatawan Kembali ke kota wasior."
                ),
                TourRute(
                    id = "Day 7",
                    location = "Wisatawan Kembali ke kota manokwari papua barat."
                )
            )
        ),
        TourPackages(
            id = 7,
            name = "Paket Kapal Pesiar",
            nameDesc = "Mengunjungi Kampung Jende Pulau Roon",
            description = "Pulau Roon adalah rumah bagi sekitar 1.100 anggota suku Roon. Pulau ini menawarkan petualangan yang indah, dan perumahan unik bagi penduduk lokal yang tinggal di tepi laut, ciri budaya yang unik, pecinta sejarah dapat mengunjungi Gereja Tua ikonik yang Alkitabnya diterbitkan pada tahun 1898.\n" +
                    "\n" +
                    "Wisatawan akan disambut dengan atraksi perang Bemamun Soren, tarian perang laut yang megah, menggentarkan jiwa, menemani para tamu dari kapal hingga mendarat, akan menciptakan pengalaman yang tak terlupakan bagi wisatawan.\n" +
                    "\n" +
                    "Mulailah dengan turun di dermaga desa Jende, di mana Anda akan disambut, kemudian bergabung dengan rombongan tari dan musik tradisional untuk berjalan menuju Gereja Tua tempat berlangsungnya pertunjukan budaya lokal. Di akhir pertunjukan budaya, wisatawan dapat ikut menari bersama masyarakat setempat.\n" +
                    "\n" +
                    "Jelajahi sejarah Gereja Lama dan lihat Alkitab yang diterbitkan di Belanda pada tahun 1898, lihat batu doa tempat para misionaris Eropa berdoa, dan makam misionaris. Dari sini tur berlanjut ke dusun desa di mana wisatawan akan mengamati bagaimana penduduk setempat mengolah sagu, membuat kerajinan tangan lokal, dan sistem budidaya ikan tradisional.\n" +
                    "\n" +
                    "Sebelum kembali ke kapal, nikmati coffee break yang disediakan warga sekitar.\n",
            rating = 5.0,
            totalReview = 10,
            price = 45000000,
            imageList = listOf(
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Yende-1.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Yende-2.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Yende-3.jpg"),
                ImageTourism("https://raw.githubusercontent.com/elfan03/AssetsWondama/main/assets/Yende-4.jpg x")
            ),
            activity = listOf(
                TourRute(
                    id = "13.00",
                    location = "Tiba di Desa Jende-Pulau Roon",
                ),
                TourRute(
                    id = "14.00 - 14.30",
                    location = "Mulai turun di dermaga desa jende, disambut hangat oleh penduduk desa",
                ),
                TourRute(
                    id = "14.30 - 15.00",
                    location = "Berjalanlah ke Gereja Tua, diiringi musik tradisional",
                ),
                TourRute(
                    id = "15.00 - 15.20",
                    location = "Pertunjukan budaya   di depan Gereja Lama",
                ),
                TourRute(
                    id = "15.20 - 15.45",
                    location = "Jelajahi Gereja Lama",
                ),
                TourRute(
                    id = "15.45 - 17.15",
                    location = "Kelilingi desa untuk melihat pengolahan sagu, kerajinan tangan lokal, sistem budidaya perikanan lokal, dan aktivitas lokal.",
                ),
                TourRute(
                    id = "17.15 - 17.45",
                    location = "Coffee break, lalu kembali ke kapal",
                ),
                TourRute(
                    id = "17.35 - 18.00",
                    location = "Kembali ke Pelabuhan"
                )
            )
        )
    )
}