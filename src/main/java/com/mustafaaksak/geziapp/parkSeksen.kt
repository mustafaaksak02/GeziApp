package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_park_seksen.*

class parkSeksen : AppCompatActivity() {

    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_seksen)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetSeksen.setOnClickListener{
            var tvSeksen = tvSeksen.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingSeksen = ratingSeksen.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvSeksen,ratingSeksen))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi",Toast.LENGTH_LONG).show()
        }

    }

}


