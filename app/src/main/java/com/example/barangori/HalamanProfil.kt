package com.example.barangori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HalamanProfil : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_profil)

        val btnBalik: Button = findViewById(R.id.btn_balik)
        btnBalik.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_balik -> {
                val moveIntent = Intent(this@HalamanProfil, HalamanUtama::class.java)
                startActivity(moveIntent)
            }
        }
    }
}