package com.example.barangori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class BarangDetail : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barang_detail)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val btnBalik: Button = findViewById(R.id.btn_detail)
        btnBalik.setOnClickListener(this)

        //event listener
        val button = findViewById<Button>(R.id.btn_paporit)
        as Button
        button.setOnClickListener {
            //menampilkan toast denganpesan
            Toast.makeText(this ,"Anda Telah Menambahkan Item Paporit",Toast.LENGTH_SHORT).show()
        }

        val image = intent.getParcelableExtra<Barang>(HalamanUtama.INTENT_PARCALABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        if (image != null) {
            imgSrc.setImageResource(image.imageSrc)
            imgTitle.text = image.imageTitle
            imgDesc.text = image.imageDesc
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_detail -> {
                val moveIntent = Intent(this@BarangDetail, HalamanUtama::class.java)
                startActivity(moveIntent)
            }
        }
    }
}