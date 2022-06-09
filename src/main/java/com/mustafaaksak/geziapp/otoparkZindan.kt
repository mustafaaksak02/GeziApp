package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_otopark_zindan.*
import kotlinx.android.synthetic.main.activity_park_seksen.*

class otoparkZindan : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otopark_zindan)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetZindan.setOnClickListener{
            var tvZindan = tvZindan.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingZindan = ratingZindan.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tvZindan,ratingZindan))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
        }

    }
}