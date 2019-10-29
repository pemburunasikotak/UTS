package tj.belajar.asu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import tj.belajar.wisataJogja.R
import tj.belajar.wisataJogja.R.*


class MainActivity : AppCompatActivity() {

    //mengisi RecyleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val testData = createPhoneDate()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = WisataAdapter(testData, { wisataItem : WisataData->phoneItemClicked(wisataItem)})
    }



    //membari fungsi klik disembarang tombol
    private fun phoneItemClicked (wisataItem : WisataData){
        val  showDetailActivityIntent = Intent(this, WisataDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, wisataItem.tempat.toString())
        showDetailActivityIntent.putExtra("data",wisataItem)
        startActivity(showDetailActivityIntent)
    }


    //untuk mengisi data aray
    private fun createPhoneDate() : List<WisataData>{
        val partList = ArrayList<WisataData>()
            partList.add(WisataData(
                    "PANTAI PARANGTRITIS",
                    "Pantai Krakal Gunung Kidul merupakan salah satu pantai favorit yang ada di daerah istimewa Yogyakarta. Pantai Krakal sebenarnya pantai yang paling lama dikenal oleh masyarakat setempat di bandingkan pantai pantai yang ada di Gunung Kidul lainnya.",
                    "https://cdn2.tstatic.net/jogja/foto/bank/images/suasana-pantai-parangtritis-2.jpg"
                )
            )
            partList.add(WisataData(
                    "PANTAI KRAKAL",
                    "Pantai Krakal Gunung Kidul merupakan salah satu pantai favorit yang ada di daerah istimewa Yogyakarta. Pantai Krakal sebenarnya pantai yang paling lama dikenal oleh masyarakat setempat di bandingkan pantai pantai yang ada di Gunung Kidul lainnya.",
                    "https://www.pegipegi.com/travel/wp-content/uploads/2018/09/pantai-krakal.jpg"
                )
            )
            partList.add(WisataData(
                    "PANTAI DRINI",
                    "Pantai Drini adalah salah satu objek wisata yang terletak di Desa Banjarejo, Kecamatan Tanjungsari,Gunungkidul, Yogyakarta. Letaknya di sebelah timur pantai Baron dan berjarak sekitar 1 km ke arah timur Pantai Sepanjang. Namun jarak sebenarnya yang harus ditempuh untuk sampai ke pantai ini sejauh 60 km atau sekitar 2-3 jam dari kota Yogyakarta. Infrastruktur menuju ke Pantai Drini cukup mulus, walaupun jalan masuk untuk sampai ke pantai ini cukup terjal dan berkelok-kelok. Pantai drini merupakan pantai yang langsung berhadapan dengan Samudra Hindia.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/52/Pantai_Drini_Top_View.jpg"
                )
            )
            partList.add(WisataData(
                    "PANTAI INDRAYANTI",
                    "Pantai Indrayanti adalah salah satu tempat wisata pantai di Jogja yang sering direkomendasikan pada wisatawan. Nama pantai Indrayanti sendiri sudah cukup dikenal di kalangan wisatawan baik lokal ataupun manca negara.",
                    "https://www.nativeindonesia.com/wp-content/uploads/2017/07/pantai-indrayanti-jogja-1.jpg"
                )
            )
            partList.add(WisataData(
                    "ALUN ALUN KIDUL",
                    "Alun-alun Kidul Yogyakarta dikenal dengan nama Alkid diyakini sebagai tempat istirahat ( palereman ) bagi para Dewa. Oleh karena itu alun-alun tersebut sekarang ini banyak digunakan orang sebagai tempat ngleremke ati atau menentramkan hati banyak orang.",
                    "https://paketwisatajogja75.com/wp-content/uploads/2018/10/alun2kidul.jpg"
                )
            )
            partList.add(WisataData(
                    "CANDI PRAMBANAN",
                    "Candi ini adalah termasuk Situs Warisan Dunia UNESCO, candi Hindu terbesar di Indonesia, sekaligus salah satu candi terindah di Asia Tenggara. Arsitektur bangunan ini berbentuk tinggi dan ramping sesuai dengan arsitektur Hindu pada umumnya dengan candi Siwa sebagai candi utama memiliki ketinggian mencapai 47 meter menjulang di tengah kompleks gugusan candi-candi yang lebih kecil",
                    "https://visitingjogja.com/wp-content/uploads/2017/01/candi-prambanan.jpg "
                )
            )
            partList.add(WisataData(
                    "TEBING BRAKSI",
                    "Tebing Breksi merupakan tempat wisata yang berada di wilayah Kabupaten Sleman. Lokasinya berada di sebelah kidul Candi Prambanan dan berdekatan dengan Candi Ijo serta Kompleks Keraton Boko. ",
                    "https://cdn2.tstatic.net/jogja/foto/bank/images/tebing-breksi-wisata-murah-jogja.jpg"
                )
            )
            partList.add(WisataData(
                    "CANDI IJO",
                    "Candi Ijo adalah sebuah kompleks percandian bercorak Hindu, berada 4 kilometer arah tenggara dari Candi Ratu Boko atau kira-kira 18 kilometer di sebelah timur kota Yogyakarta. Candi ini diperkirakan dibangun antara kurun abad ke-10 sampai dengan ke-11 Masehi pada saat zaman Kerajaan Medang periode Mataram",
                    "https://piknikasik.com/wp-content/uploads/2018/08/sunset-candi-ijo-jogja.jpg"
                )
            )
            partList.add(WisataData(
                    "TAMAN PELANGI",
                    "Taman Pelangi Yogyakarta merupakan tempat wisata malam yang menampilkan warna-warni lampu lampion, sehingga terlihat seperti pelangi. Taman wisata ini terletak di Jalan Padjajaran, dan berada di lokasi Museum Monumen Yogya Kembali Yogyakarta",
                    "https://cdn2.tstatic.net/tribunnewswiki/foto/bank/images/taman-pelangi-jogja.jpg"
                )
            )
            partList.add(WisataData(
                    "HUTAN PINUS MANGGUNAN",
                    "Hutan Pinus Mangunan. Hutan pinus mangunan secara administrasi terletak di desa sudimoro, kelurahan muntuk, kecamatan dlingo, kabupaten bantul, provinsi daerah istimewa Yogyakarta. Adapun tanaman yang ditanam ada berbagai macam jenis antara lain pinus, akasia, kayu putih, kemiri dan mahoni",
                    "https://www.alodiatour.com/wp-content/uploads/2018/11/lokasi-hutan-pinus-mangunan.jpg "
                )
            )
            partList.add(WisataData(
                    "JURANG TAMBELAN",
                    "Jurang Tembelan kini menjadi salah satu tempat wisata di Yogyakarta yang sedang populer. Jika kamu tahu lokasi Taman Buah Mangunan, lokasi Jurang Tembelan tidak jauh dari gardu pandang Mangunan",
                    "https://www.datawisata.com/wp-content/uploads/2018/08/Jurang-Tembelan-1024x683.jpg"
                )
            )

        return partList
    }
}
