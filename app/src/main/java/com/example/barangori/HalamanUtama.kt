package com.example.barangori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalamanUtama : AppCompatActivity(), View.OnClickListener {

    companion object {
        val INTENT_PARCALABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        val btnProfil: Button = findViewById(R.id.btn_profil)
        btnProfil.setOnClickListener(this)

        val imageList = listOf<Barang>(
            Barang(
                R.drawable.jersey_acmilan,
                "Jersey AC MILAN AUTHENTIC",
                "Ini merupakan jerseY AC MILAN yang akan digunakan pada Seria 2021/2022.Dalam paket pembeliannya terdapat sebuah sertifikat yang menandakan kalau ini merupakan jersey ORIGINAL"
            ),
            Barang(
                R.drawable.jersey_manutd,
                "Jersey Manchester United Supporter Version",
                "Jersey yang akan digunakan oleh pasukan SETAN MERAH ini pada English Premier League 2021/2022.Jersey ini merupakan jersey suporter yang berbeda dengan Authentic."
            ),
            Barang(
                R.drawable.kaos_eccennem,
                "H&M Special Edition",
                "Desain dari kaos ini merupakan hasil karya kerjasama dengan Mimi Peri serta mendapatkan tanda tangan eksklusif dari Mimi Peri.Kaos ini menciptakan rekor muri yaitu kebal api karena bahannya sendiri terdapat air liur dari Unicorn."
            ),
            Barang(
                R.drawable.kaos_ecenem,
                "H&M Limited Edition",
                "Bahan dari kaos ini itu menggunakan bahan alami yang sangat sulit ditemukan di pelosok Bumi dan kaos ini hanya tersedia 10 saja di seluruh negara."
            ),
            Barang(
                R.drawable.kaos_eceneemmmmm,
                "H&M Luxury Edition",
                "Desain dan Bahan yang digunakan disini sangat bervariasi seperti batu bara serta napas dari seorang titan makanya ini yang menyebabkan menjadi mahal."
            ),
            Barang(
                R.drawable.patu_adidas,
                "Adidas Ultra Hype",
                "Sepatu ini sangat hype dikalangan para anak muda bukan hanya dari model nya yang kekinian sepatu ini juga dapat membuat lari kita semakin kencang."
            ),
            Barang(
                R.drawable.patu_nike,
                "Nike Hyper Dunk",
                "Sepatu ini diproduksi untuk merayakan anniversary dari Ketua Himpunan Kelurahan Cikretek."
            ),
            Barang(
                R.drawable.patu_puma,
                "Puma Wireless",
                "Sepatu ini kita buat dengan bahan dari Puma asli yang ada di Afrika agar saat memakainya kita dapat berlari sekencang Puma yang asli."
            ),
            Barang(
                R.drawable.sendal_hijack1,
                "HIJACK VOL 1",
                "Vol 1 adalah produk pertama yang kita keluarkan saat ada kejadian banjir,Sandal ini memiliki fitur seperti bisa berjalan di atas air."
            ),
            Barang(
                R.drawable.sendal_hijack2,
                "HIJACK VOL 2",
                "Vol 2 ini merupakan kakak dari yang Vol 1 namun ditambahkan sedikit fitur-fitur seperti memanjat pohon dan dapat membuat orang benjol apabila kita sambit sandal ini ke kepala orang lain."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BarangAdapter(this, imageList) {
            val intent = Intent(this, BarangDetail::class.java)
            intent.putExtra(INTENT_PARCALABLE, it)
            startActivity(intent)
        }
    }

    override fun onClick (v: View) {
        when (v.id) {
            R.id.btn_profil -> {
                val moveIntent = Intent (this, HalamanProfil::class.java)
                startActivity(moveIntent)
            }
        }
    }
}