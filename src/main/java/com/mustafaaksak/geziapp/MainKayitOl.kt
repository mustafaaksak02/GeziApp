package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_kayit_ol.*

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kayit_ol)







    }
    fun girisdon(view: View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

    fun kaydet2(view: View) {
        var kullanicibilgisi = textKullaniciKayit.text.toString()
        var sifrebilgisi = textSifreKayit.text.toString()
        var sharedPreferences = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
        var editor = sharedPreferences.edit()
        editor.putString("kullanici","$kullanicibilgisi").apply()
        editor.putString("sifre","$sifrebilgisi").apply()
        Toast.makeText(applicationContext,"Kayıt Başarılı",Toast.LENGTH_LONG).show()
    }


}