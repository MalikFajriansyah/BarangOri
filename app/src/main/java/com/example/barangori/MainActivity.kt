package com.example.barangori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splashTime: Long = 3000 // Lama splashscreen

        Handler().postDelayed({
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent) // Pindah ke Halaman Utama setelah 3 detik
            finish()
        }, splashTime)
    }
}