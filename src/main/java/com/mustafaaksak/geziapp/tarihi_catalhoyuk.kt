package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_park_seksen.*
import kotlinx.android.synthetic.main.activity_tarihi_catalhoyuk.*

class tarihi_catalhoyuk : AppCompatActivity() {
        lateinit var preferences: SharedPreferences
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_tarihi_catalhoyuk)
            preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
            var database = FirebaseDatabase.getInstance().reference

            buttonKaydetCatalhoyuk.setOnClickListener {
                var tvCatalhoyuk = tvCatalhoyuk.text.toString()
                var kayitliKullaniciAdi = preferences.getString("kullanici", "").toString()
                var ratingCatalhoyuk = ratingCatalhoyuk.numStars.toString().toInt()

                database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvCatalhoyuk, ratingCatalhoyuk))
                Toast.makeText(applicationContext, "Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
            }

        }
    }
