package com.example.bedenkitleindeksi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        var boy = findViewById<EditText>(R.id.boy)
        var kilo = findViewById<EditText>(R.id.kilo)
        var hesapla = findViewById<Button>(R.id.hesapla)
        var sonuc = findViewById<TextView>(R.id.sonuc)
        var temizle = findViewById<Button>(R.id.temizle)

        hesapla.setOnClickListener {
            if (boy.text.isNotEmpty() && kilo.text.isNotEmpty()) {
                var boybilgi = boy.text.toString().toFloat() / 100
                var kilobilgi = kilo.text.toString().toFloat()
                var bki = kilobilgi / (boybilgi * boybilgi)
                sonuc.text = bki.toString()
                }
            }
            temizle.setOnLongClickListener {
                boy.setText("")
                kilo.setText("")
                Toast.makeText(applicationContext, "Hafıza Temizlendi", Toast.LENGTH_SHORT).show()
                sonuc.text = ""
                true
            }
        }
    }

