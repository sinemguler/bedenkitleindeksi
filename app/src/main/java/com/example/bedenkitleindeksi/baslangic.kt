package com.example.bedenkitleindeksi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class baslangic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        Handler().postDelayed({
            val gecis = Intent(applicationContext, MainActivity::class.java)
            startActivity(gecis)
            finish()
        },5000)
    }
}
