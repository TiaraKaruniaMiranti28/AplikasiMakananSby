package com.example.aplikasimakanansby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createMak()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterMakanan (data, { onItem: DataMakanan -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataMakanan) {
        val showDetailActivityIntent = Intent(this, DetailMakanan::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gbrMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.hrgMak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.deskMak)
        startActivity(showDetailActivityIntent)
    }

    private fun createMak(): List<DataMakanan> {
        val rvList = ArrayList<DataMakanan> ()
        rvList.add(
            DataMakanan(
                R.drawable.rujak_cingur,
                "RUJAK CINGUR",
                "Alamat : Jl. Genteng Durasim Nomor 29, Genteng, Surabaya\n" +
                        "IDR : Rp. 15.000,-",
                "Salah satu makanan khas Surabaya yang terkenal adalah rujak cingur. Sebenarnya rujak cingur sekarang sudah tersebar di luar Surabaya.\n" +
                        "\n" +
                        "Tapi jangan sampai kompilasi ke Surabaya tidak membeli rujak cingurnya. Rujak cingur ini merupakan perpaduan antara buah-buahan, sayur, dan daging. Seperti buah belimbing, bengkuang, nanas.\n" +
                        "\n" +
                        "Kemudian ditambah sayur kangkung, tauge, irisan tempe, dan tahu. Tak lupa harus menambahkan cingur sapi. Meski terdengar aneh, namun rujak cingur ini menghadirkan rasa yang nano-nano."
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.tahu_campur,
                "TAHU CAMPUR",
                "Alamat : Jalan Kalasan Nomor 22, Pacar Keling, Kecamatan Tambaksari\n" +
                        "IDR : Rp. 15.000,-",
                "Yang ini sedikit berbeda, Tahu Campur khas Surabaya ini ada kuahnya. Kuah ini dibuat dari aneka bumbu yang dicampur dengan petis. Kuahnya bening kecoklatan.\n" +
                        "\n" +
                        "Tahu Campur Khas Surabaya disajikan dengan potongan daging, tahu, tauge, selada, mie kuning, dan kerupuk. Rasanya lebih segar karena kuah petis yang sedikit asam. Perbedaan lain dari Tahu Tek yaitu Tahu campur menggunakan perkedel. Uniknya perkedel ini dibuat dari singkong. Wah, bikin makin penasaran sama si perkedel singkong ini.\n" +
                        "\n" +
                        "Harganya pun relatif terjangkau, yakni 10 ribu hingga 20 ribu rupiah saja. Karena itu, makanan ini menjadi makanan khas Surabaya yang terkenal.\n"
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.nasi_cumi,
                "NASI CUMI",
                "Alamat : Jalan Waspada Nomor 2-4, Bongkaran, Pabean Cantian, Bongkaran, Kecamatan Pabean Cantian\n" +
                        "IDR : Rp. 25.000,-",
                "Makanan khas bikin ketagihan dan enggan untuk berhenti. Nasi cumi ini berisi nasi, empal, telur, cumi, dan peyek udang. Cuminya pun dimasak bersamaan dengan tintanya. Hm, penasaran ya?\n" +
                        "\n" +
                        "Jika dirasa porsi tersebut belum cukup. Nasi cumi khas Surabaya ini juga enak, lho! Terdiri dari nasi, telur, babat, empal, usus, paru, peyek udang, dan tentu saja saja cumi hitam. Semuanya tersedia dalam satu piring.\n" +
                        "\n" +
                        "Nasi cumi khas Surabaya ini bisa dinikmati malam hari. Dan menjadi salah satu makanan khas Surabaya malam hari . Jadi gak perlu bingung lagi, kalau malam mau makan apa di Surabaya. Nasi cumi ini menjawab."
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.tahu_tek,
                "TAHU TEK",
                "Alamat : Jl. Kutisari Selatan No. 40C, Tenggilis Mejoyo, Surabaya\n" +
                        "IDR : Rp.15.000,-",
                "Tahu tek ini merupakan makanan khas Surabaya yang terkenal . Kalau ke Surabaya cari tahu tek di siang hari itu sama aja misi diambil. Makanan khas Surabaya Jawa Timur ini mulai buka sekitar pk 20.00 WIB. Jadi, lebih baik nunggu sampai malam dulu baru bisa menikmati makanan ini.\n" +
                        "\n" +
                        "Tahu Tek ini terdiri dari tahu goreng setengah matang, kentang goreng potong dadu, taoge. Semuanya dihidangkan lalu disiram bumbu petis. Tak lupa diberi kerupuk. Rasanya yang sedap ini membuat tahu tek menjadi makanan khas surabaya yang enak."
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.sate_klopo,
                "SATE KLOPO",
                "Alamat: Jalan Walikota Mustajab Nomor 36, Ketabang, Kecamatan Genteng\n" +
                        "IDR : Rp. 15.000,-",
                "Beda ini bukan sate biasa. Sate klopo ini jangan sampai terlewat dari daftar menu wajib coba Anda. Biasanya, sate adalah daging yang ditusuk kemudian diberi bumbu kacang. Namun, sate bumbu ini adalah bumbu kacang yang ditaburi parutan kelapa kering.\n" +
                        "\n" +
                        "Oleh sebab itu, namanya adalah klopo yang berarti kelapa. Sate klopo pun bisa dinikmati di malam hari yang dingin. Makanan khas surabaya malam hari ini membuat malammu semakin nikmat. Gak tanggung-tanggung, daging sate klopo ini besar. Di mulut jadi mantap.\n"
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.semanggi,
                "SEMANGGI",
                "Alamat : Jl. Pagesangan, Jambangan, Surabaya\n" +
                        "IDR : Rp. 10.000,-",
                "Ke surabaya tidak lengkap jika tidak membeli pecel. Masih sekarang pecel tersebar di Jawa, tetapi tetap harus mecoba pecel di Surabaya. Pecel di Surabaya berbeda dari yang lain.\n" +
                        "\n" +
                        "Namanya Pecel Semanggi. Makanan khas Surabaya yang enak ini ditambah daun semanggi yang dikukus. Kemudian dilumuri dengan bumbu kacang yang royal dan kerupuk. Kerupuk uniknya dari pecel semanggi ini bisa dibuatkan saus.\n" +
                        "\n" +
                        "Pecel semanggi ini bisa dinikmati di pagi hingga siang hari. Jadi bisa untuk sarapan. Sehat pula, karena banyak sayurnya."
            )
        )

        rvList.add(
            DataMakanan(
                R.drawable.soto_cakhar,
                "SOTO AYAM LAMONGAN CAK HAR",
                "Alamat : Jalan Arif Rahman Hakim, Keputih, Kecamatan Sukolilo\n" +
                        "IDR : Rp. 20.000,-",
                "Soto memang gak ada matinya. Banyak soto tersebar di mana-mana, tapi tetap saja peminatnya tidak berkurang. Justru makin ditambahkan. Nah, kalau tidak mau lagi makan soto di Surabaya wajib mampir ke Soto Lamongan Cak Har.\n" +
                        "\n" +
                        "Soto ini sangat khas dengan kuah kuningnya. Kuah kuning kental dan sedikit krem ini tidak bikin ‘berat’ saat ditelan. Justru segar saat disantap tambahan ditambah jeruk nipis sedikit.\n" +
                        "\n" +
                        "Tak lupa, taburan koya yang kaya di atas soto ini bikin makin kental dan gurih. Saat ditelan dalam kesulitan karena campuran koya. Namun, tetap ramah di lidah. Koyanya pun bisa nambah, lho!\n" +
                        "\n" +
                        "Selain itu, Soto Lamongan Cak Har ini berbadan dasar ayam. Ada pula porsi yang menyediakan suwir ayam bersama tulangya. Hmm, makin kuat rasanya."
            )
        )
        return rvList
    }
}
