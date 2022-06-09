package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_park_kelebek.*
import kotlinx.android.synthetic.main.activity_park_seksen.*

class parkKelebek : AppCompatActivity() {

    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_kelebek)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetKelebek.setOnClickListener{
            var tvKelebek = tvKelebek.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingKelebek = ratingKelebek.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvKelebek,ratingKelebek))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
        }

    }

}