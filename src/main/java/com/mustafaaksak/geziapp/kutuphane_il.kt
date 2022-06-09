package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_kutuphane_il.*
import kotlinx.android.synthetic.main.activity_park_seksen.*

class kutuphane_il : AppCompatActivity() {

    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kutuphane_il)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetil.setOnClickListener{
            var tvil = tvil.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingil = ratingil.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvil,ratingil))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
        }

    }

}