package com.mustafaaksak.geziapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_ibadet_iplikci.*
import kotlinx.android.synthetic.main.activity_park_seksen.*

class ibadet_iplikci : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibadet_iplikci)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var database = FirebaseDatabase.getInstance().reference

        buttonKaydetiplikci.setOnClickListener{
            var tviplikci = tviplikci.text.toString()
            var kayitliKullaniciAdi = preferences.getString("kullanici","").toString()
            var ratingiplikci = ratingiplikci.numStars.toString().toInt()

            database.child(kayitliKullaniciAdi.toString()).setValue(Puan(tviplikci,ratingiplikci))
            Toast.makeText(applicationContext,"Oyunuz Kaydedildi", Toast.LENGTH_LONG).show()
        }

    }
}