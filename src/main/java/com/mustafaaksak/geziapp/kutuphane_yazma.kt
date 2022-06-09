package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_kutuphane_yazma.*
import kotlinx.android.synthetic.main.activity_park_seksen.*

class kutuphane_yazma : AppCompatActivity() {

    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kutuphane_yazma)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetYazma.setOnClickListener{
            var tvYazma = tvYazma.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingYazma = ratingYazma.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvYazma,ratingYazma))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
        }

    }
}