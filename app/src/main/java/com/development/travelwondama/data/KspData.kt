package com.development.travelwondama.data

import com.development.travelwondama.domain.model.ImageTourism
import com.development.travelwondama.domain.model.Ksp
import com.development.travelwondama.domain.model.Tourism

object KspData {
    val dummyKsp = listOf(
        Ksp(
            id = 1,
            title = "Kawasan Strategis Provinsi 1",
            place = "Wasior Dan Sekitarnya",
            imageUrl = "https://cdns.klimg.com/merdeka.com/i/w/photonews/2016/04/05/689257/540x270/20160405130624-melihat-lebih-dekat-pelabuhan-wasior-di-teluk-wondama-001-isn.jpg",
            category = listOf(
                "Wisata Budaya",
                "Wisata Bahari",
                "Wisata Sejarah"
            ),
            tourismBahari = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Parap",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                ),
                Tourism(
                    id = 2,
                    name = "Pulau Nusrowi",
                    rating = 4.5,
                    totalReview = 120,
                    address = "Jalan Raya Rasie Kompleks Perkantoran, Rasiei Teluk Wondama, Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202205190104206285352467db0.jpg",
                    description = "Sebuah pulau kecil cantik  di laut rumberpon, secara administrasi pulau ini berada dalam wilayah Distrik Rumberpon. Kabupaten Teluk Wondama Papua Barar. Pulau yang menawarkan sensasi yang begitu indah dengan pemandangan panorama alam yang indah dan sejuk dengan  hamparan pasir putih yang berkilau ini juga memiliki terumbu karang dan berbagai spesies biota laut, juga ada pasir timbul dekat pulau ini namun pasir timbul ini bisa muncul ke permukaan dan terlihat saat air surut.\n" +
                            "Ada Group tari dan musik tradisional suling bambu, yang juga turut memberi warna pertunjukan dan atraksi bagi tamu/wisatawan yang hendak ke pulau nusorowi diatrik rumberpon.\n" +
                            "Tak salah jika Pulau nusorowi menjadi icon wisata bagi distrik rumberpon dan beberapa kampung yang dekat pulau ini.\n" +
                            "\n" +
                            "Pulau ini dihuni kurang lebih 3 keluarga yang bekerja sebagai nelayan juga turut menjaga pulau ini.\n" +
                            "Ada sebuah dermaga jety dan bangunan rumah yang sudah dibangun oleh pemerintah di pulau ini.",
                    imageList = listOf(
                        ImageTourism("https://live.staticflickr.com/7088/7059258233_edccfe9cc0_b.jpg"),
                        ImageTourism("https://superlive.id/storage/superadventure/2018/08/16/58313dca287e.jpg"),
                        ImageTourism("https://asset-2.tstatic.net/papuabarat/foto/bank/images/Pulau-Nusrowi-Kampung-Yembekiri-Distrik-Kecamatan-Rumberpoon.jpg"),
                        ImageTourism("https://2.bp.blogspot.com/_D5TxtsY69D0/TPXR35WHLuI/AAAAAAAAHMQ/51WyIa6UK4o/s1600/nusrowi01.jpg")
                    )
                )
            ),
            tourismCulture = listOf(
                Tourism(
                    id = 2,
                    name = "Pemrosesan Sagu",
                    rating = 4.0,
                    totalReview = 25,
                    description = "Secara tradisional, tepung sagu diekstraksi dari batang pohon sagu dewasa yang telah siap dipanen. Keluarga yang akan memanen sagu biasanya melakukan persiapan peralatan seperti parang, alat tokok, ember dan lain sebagainya. Sebelum pohon sagu ditebang, ada doa-doa yang diucapkan kepada Sang Pencipta berisikan ucapan syukur atas berkat yang sudah diberikan dengan permohonan agar selalu dilindungi supaya terhindar dari kecelakaan atau kesialan ketika mereka sedang bekerja. \n" +
                            "\n" +
                            "Proses tokok, pemerasan serat sagu yang berisi tepung serta pengendapannya di kontainer-kontainer yang terbuat dari daun bisa berlangsung hingga beberapa hari lamanya. Sagu yang dihasilkan kemudian dipikul ke kampung. Sebagian dijual di pasar, dibagikan ke sanak keluarga serta disimpan untuk dikonsumsi sendiri oleh pihak keluarga. \n" +
                            "\n" +
                            "Sagu umumnya dihidangkan di meja makan dalam bentuk papeda. Biasanya papeda dimakan dengan sup ikan kuah kuning serta sayur-sayur lainnya. Ada juga sagu yang dibakar di cetakan berbentuk persegi dengan ketebalan sekitar 1 - 1,5 centimeter. Sagu bakar ini bisa dicampur dengan kelapa dan gula merah. Rasanya enak sekali ketika dihidangkan di pagi maupun sore hari dengan kopi susu atau teh manis.\n" +
                            "\n" +
                            "Tanaman sagu memiliki banyak sekali manfaat bagi masyarakat setempat di Kabupaten Teluk Wondama. Daun sagu digunakan untuk atap rumah atau pondok tempat berteduh baik di kebun maupun di pinggir pantai. \n" +
                            "\n" +
                            "Wisatawan yang berkunjung ke Wondama bisa melihat bagaimana sagu diproses mulai dari penokokan di dusun sagu hingga pemasakan serta penyajiannya di meja makan. \n" +
                            "\n" +
                            "Untuk berkunjung ke Wondama, wisatawan perlu terbang ke Manokwari (ibu kota Provinsi Papua Barat). Lion Air, Batik, Wings, dan Sriwijaya adalah maskapai yang menyediakan layanan terbang dari sejumlah kota besar dan kecil di Indonesia ke Manokwari. Setelah tiba di Manokwari, wisatawan bisa melanjutkan perjalanan ke Wondama dengan naik kapal atau naik pesawat penumpang kecil yang dioperasikan oleh Susi Air. \n" +
                            "\n" +
                            "Di Wondama ada hotel/ penginapan, restoran, bank, apotik, rumah sakit, serta toko-toko yang menyediakan berbagai barang kebutuhan sehari-hari. \n" +
                            "\n" +
                            "Selain wisata budaya pemrosesan sagu, wisatawan bisa menikmati keindahan alam di Teluk Wondama baik yang di laut maupun di darat. Ada pantai-pantai indah dengab terumbu karang yang berwarna-warni. Wisatawan bisa mandi di pantai sambil menikmati aktivitas snorkeling untuk melihat tumbuhan dan hewan laut yang unik. Ada juga kampung-kampung di pinggir hutan yang bisa dikunjungi oleh wisatawan. Wisatawan bisa tinggal selama beberapa hari dan melihat dari dekat kehidupan masyarakat sehari-hari yang kebanyakan hidup sebagai nelayan atau petani. Hutan di pinggir kampung adalah habitat alami bagi burung kakaktua putih, kakaktua raja, taun-taun, serta Cendrawasih. Ada juga soa-soa, kuskus dan kupu-kupu sayap burung. \n" +
                            "\n" +
                            "Wisatawan perlu membawa peralatan seperti masker snorkeling, pipa naps (snorkel), dan kaki bebek jika ingin menikmati wisata snorkeling di pantai dan pulau-pulau di Kabupaten Teluk Wondama. Bagi wisatawan yang lebih tertarik dengab ekosistem hutan, tentu saja teropong (binocular), spotting scope, laser pointer hijau serta kamera dengan telelens.",
                    imageUrl = "https://cdn.antaranews.com/cache/1200x800/2022/11/30/TOKOK-SAGU-1.jpg",
                    imageList = listOf(
                        ImageTourism("https://kabartimur.com/wp-content/uploads/2022/11/Compress_20221130_150533_3549.jpg"),
                        ImageTourism("https://1.bp.blogspot.com/-uG4eIlZ8N1s/XdGq1EYXa7I/AAAAAAAAAMo/_ir8vfMNOkgHFAYx7UqU5ZTSj3JbKkMaACLcBGAsYHQ/s1600/cutting-sago-pith.jpg"),
                        ImageTourism("https://img.antaranews.com/cache/730x487/2022/11/30/TOKOK-SAGU-2.jpg")
                    )
                ),
                Tourism(
                    id = 2,
                    name = "Distrik Windensi",
                    rating = 4.0,
                    totalReview = 15,
                    description = "Destinasi Wisata Religi di Distrik Windesi :\n" +
                            "\n" +
                            "• Bukit Kamadiri Windesi\n" +
                            "Bukit Kamadiri merupakan salah satu tempat bersejarah dalam pekabaran Injil di Teluk Wondama. Kita dapat menjangkau tempat ini sekitar 2 jam dengan menggunakan Speedboat.\n" +
                            "\n" +
                            "Di bukit ini tersimpan seribu satu catatan sejarah pekabaran Injil yang belum terungkap. Jika berwisata ke Windesi sempatkan kunjungi bukit Kamadiri. Dari atas bukit ini kita dapat menikmati panorama kepulauan yang indah hingga ke pulau Roon.\n" +
                            "\n" +
                            "• Situs Batu Anitui\n" +
                            "Situs batu Anitui atau yg dikenal dengan batu jodoh ini berada di pulau Yoop, kampung Yoop distrik Windesi. Terdapat tiga buah batu, yang cukup berat adalah yang paling besar. Menurut tokoh adat di pulau Yoop, barang siapa yang hatinya bersih/niat baik dapat mengangkat batu ini, niscaya niatnya akan terwujud.",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430213450608c158a46529.jpg",
                    imageList = listOf(
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg"),
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg"),
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg")
                    ),
                ),
            ),
            tourismHistory = listOf(
                Tourism(
                    id = 1,
                    name = "Distrik Windensi",
                    rating = 4.0,
                    totalReview = 15,
                    description = "Destinasi Wisata Religi di Distrik Windesi :\n" +
                            "\n" +
                            "• Bukit Kamadiri Windesi\n" +
                            "Bukit Kamadiri merupakan salah satu tempat bersejarah dalam pekabaran Injil di Teluk Wondama. Kita dapat menjangkau tempat ini sekitar 2 jam dengan menggunakan Speedboat.\n" +
                            "\n" +
                            "Di bukit ini tersimpan seribu satu catatan sejarah pekabaran Injil yang belum terungkap. Jika berwisata ke Windesi sempatkan kunjungi bukit Kamadiri. Dari atas bukit ini kita dapat menikmati panorama kepulauan yang indah hingga ke pulau Roon.\n" +
                            "\n" +
                            "• Situs Batu Anitui\n" +
                            "Situs batu Anitui atau yg dikenal dengan batu jodoh ini berada di pulau Yoop, kampung Yoop distrik Windesi. Terdapat tiga buah batu, yang cukup berat adalah yang paling besar. Menurut tokoh adat di pulau Yoop, barang siapa yang hatinya bersih/niat baik dapat mengangkat batu ini, niscaya niatnya akan terwujud.",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430213450608c158a46529.jpg",
                    imageList = listOf(
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg"),
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg"),
                        ImageTourism("https://cdn.antaranews.com/cache/1200x800/2018/02/IMG-20180226-WA0000.jpg")
                    ),
                ),
                Tourism(
                    id = 2,
                    name = "Swef Winori",
                    rating = 4.5,
                    totalReview = 20,
                    description = "Destinasi wisata Religi Di Distrik Roswar :\n" +
                            "Ibu kota distrik Roswar adalah kapung waprak. disini terdapat bebrapa objek wisata unggulan yang dijadikan destinasi wisata sjarah/religi, yaitu :\n" +
                            "\n" +
                            "• Goa Tengkorak Manusia Purba\n" +
                            "Goa ini terletak di sebelah utara pulau Roswar\n" +
                            "\n" +
                            "• Situs Makam Zendeling\n" +
                            "Situs makam Zendeling Pdt. Frans Mosche dan juga bekas puing rumah tinggsal serta sumur yang terletak di kampung Yomber di bagian utara Pulau Roswar.\n" +
                            "\n" +
                            "Frans Mosche adalah Zendeling pertama yang membawa masuk Agama Kristen di Jomber Roswar pada tanggal 4 Mei 1866.\n" +
                            "\n" +
                            "Untuk mencapai objek wisata ini dapat ditempuh dengan speeadboad sekitar 3 jam dari wasior atau dengan menggunakan kapal Bahari Expres selama 2 jam dari wasior maupun 5 jam dari manokwari.",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430142535608bb0ef96ba2.jpg",
                    imageList = listOf(
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430142535608bb0ef96ba2.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430142535608bb0ef96ba2.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_20210430142535608bb0ef96ba2.jpg"),
                    )
                )
            )
        ),
        Ksp(
            id = 2,
            title = "Kawasan Strategis Provinsi 2",
            place = "Roon dan Sekitarnya",
            imageUrl = "https://www.indonesia.travel/content/dam/indtravelrevamp/IMGL4775.JPG",
            category = listOf(
                "Wisata Budaya",
                "Wisata Bahari",
                "Wisata Sejarah"
            ),
            tourismBahari = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Parap",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                ),
            ),
            tourismCulture = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            ),
            tourismHistory = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            )
        ),
        Ksp(
            id = 3,
            title = "Kawasan Strategis Provinsi 3",
            place = "Rumberpon dan Sekitarnya",
            imageUrl = "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/04/02/IMG_20230402_135500-3733925383.jpg",
            category = listOf(
                "Wisata Budaya",
                "Wisata Bahari",
                "Wisata Sejarah"
            ),
            tourismBahari = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Parap",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                ),
            ),
            tourismCulture = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            ),
            tourismHistory = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            )
        ),
        Ksp(
            id = 4,
            title = "Kawasan Strategis Provinsi 4",
            place = "Naikere dan Sekitarnya",
            imageUrl = "https://neewslive.com/wp-content/uploads/2020/03/5-Tempat-Wisata-di-Nabire-Papua.jpg",
            category = listOf(
                "Wisata Budaya",
                "Wisata Bahari",
                "Wisata Sejarah"
            ),
            tourismBahari = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Parap",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                ),
            ),
            tourismCulture = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            ),
            tourismHistory = listOf(
                Tourism(
                    id = 1,
                    name = "Pulau Purup",
                    rating = 4.2,
                    totalReview = 18,
                    address = "Kecamatan Rumberpon Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia",
                    imageUrl = "http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg",
                    description = "Pulau Purup adalah sebuah pulau di Kecamatan Rumberpon  Kabupaten Teluk Wondama Provinsi Papua Barat Indonesia, Dalam system koordinat geografis Kecamatan Rumberpon berada pada koordinat 1o 50' 1.665\" Lintang Selatan dan 1340 10\" 44.938\" Bujur Timur. Posisi Pulau Rumberpon berada di bagian utara dari Kabupaten Teluk Wondama. Letaknya berbatasan langsung dengan Kabupaten Manokwari Selatan. Pulau Purup rumberpon ini berada di Kawasan taman nasional teluk cendrawasih. Taman Nasional Teluk Cenderawasih merupakan taman nasional perairan laut terluas di Indonesia, terdiri dari daratan dan pesisir pantai (0,9%), daratan pulau-pulau (3,8%), terumbu karang (5,5%), dan perairan lautan (89,8%). Teluk Cenderawasih memiliki struktur geologi yang unik dan sejarah oceanographic yang sangat penting. Taman nasional laut ini memiliki terumbu karang yang luas dengan kualitas terbaik di dunia. Tercatat lebih dari 500 jenis spesies terumbu karang dengan 14 spesies baru. Pulau Purup termasuk salah satu tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia. Tercatat kurang lebih 209 jenis ikan penghuni kawasan ini di antaranya butterflyfish, angelfish, damselfish, parrotfish, rabbitfish, dan anemonefish.\n" +
                            "\n" +
                            "Jenis moluska antara lain keong cowries (Cypraea spp.), keong strombidae (Lambis spp.), keong kerucut (Conus spp.), triton terompet (Charonia tritonis), dan kima raksasa (Tridacna gigas).\n" +
                            "\n" +
                            "Terdapat empat jenis penyu yang sering mendarat di taman nasional ini yaitu penyu sisik (Eretmochelys imbricata), penyu hijau (Chelonia mydas), penyu lekang (Lepidochelys olivaceae), dan penyu belimbing (Dermochelys coriacea). Duyung (Dugong dugon), paus biru (Balaenoptera musculus), ketam kelapa (Birgus latro), lumba-lumba, dan hiu sering terlihat di perairan Taman Nasional Teluk Cendrawasih termasuk di pulau purup. Beberapa jenis satwa liar seperti kuskus, elang laut, kakatua raja dan lainnya pun berada di pulau purup.\n" +
                            "\n" +
                            "Selain itu terdapat beberapa laguna yang jernih kebiruan, pulau pulau kecil eksotis, situ peninggalan prasejarah berupa gambar cadas atau lukisan prasejarah ambesibui, sanepa, inuri kyari dan tengkorak manusia purba yang berada di situs ceruk imande, dan situs batu karam yang berada di sekitar pulau purup dan rumberpon.\n" +
                            "\n" +
                            "Kondisi Geografi unik pulau ini memikat pengunjung. Terumbu karang yang indah menawarkan berbagai sensasi warna, pulau-pulau kecil yang sebagiannya dikelilingi batu cadas dan pasir putih lembut yang dikelilingi oleh perairan dangkal paling jernih. Pulau ini tak berpenghuni, hanya menjadi tempat persinggahan bagi masyarakat lokal jika melakukaan perjalanan laut ke kota wasior kabupaten teluk wondama atau sebaliknya, juga sebagai tempat parkir para nelayan lokal. Masyarakat lokal hanya mendiami Pulau besar Rumberpon. Terdapat tujuh kampung yang mengelilingi Pulau Rumberpon diantaranya Kampung Yomakan, Yembekiri I, Yembekiri II, Watitindau, Iseren, Yariyari dan Isenebuay.\n" +
                            "\n" +
                            "Keindahan Pulau Purup Rumberpon tidak hanya di atas air. Purup adalah rumah bagi sekian persen terumbu karang di planet ini yang hadir dengan ledakan warna yang disumbangkan oleh karang lunak dan keras yang membentuknya. Terumbu karang adalah rumah bagi ratusan spesies ikan. Terpikat oleh nutrisi kaya yang mengalir bersama arus, ikan besar seperti lumba lumba dan hiu paus juga menjadikan Purup sebagai rumah mereka. Pulau Purup merupakan tempat terbanyak ditemukannya keanekaragaman hayati yang pernah dicatat di seluruh dunia.",
                    imageList = listOf(
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pulau-Purup.jpg"),
                        ImageTourism("http://wisata.wondamakab.go.id/uploads/destinasi_wisata_202305091336336459e9f155c23.jpeg"),
                        ImageTourism("https://t-2.tstatic.net/papua/foto/bank/images/Pemandangan-alam-bawah-laut-di-Pulau-Purup.jpg"),
                    )
                )
            )
        )
    )
}