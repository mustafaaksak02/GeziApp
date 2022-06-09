package com.mustafaaksak.geziapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)

    }
    fun anasayfagit(view: View) {
        var kayitliKullaniciAdi = preferences.getString("kullanici","")
        var kayitliSifre = preferences.getString("sifre","")

        var girisKullanici = textKullanici.text.toString()
        var girisSifre = textSifre.text.toString()

        if ((kayitliKullaniciAdi==girisKullanici)&&(kayitliSifre==girisSifre)){
            val intent = Intent(applicationContext, MainAnasayfa::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext,"Giriş Bilgileri Hatalı",Toast.LENGTH_LONG).show()
        }










    }
    fun kayitolgit(view: View) {
        val intent = Intent(applicationContext, MainKayitOl::class.java)
        startActivity(intent)
    }

}