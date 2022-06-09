package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_kutuphaneler.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityKutuphaneler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kutuphaneler)
        val kutuphane = listOf(
            "Konya İl Halk Kütüphanesi",
            "Konya Yazma Eserler Kütüphanesi",
            "Ali Efendi Halk Kütüphanesi",
            "Yusufağa Kütüphanesi",
            "Konya Meram Gar Kütüphanesi",

        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kutuphane)

        list_view3.adapter = adapter
        list_view3.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenKutuphane = parent.getItemAtPosition(position) as String

            if (secilenKutuphane==kutuphane[0]){
                val intent = Intent(applicationContext, kutuphane_il::class.java)
                startActivity(intent)
            }else if (secilenKutuphane==kutuphane[1]){
                val intent = Intent(applicationContext, kutuphane_yazma::class.java)
                startActivity(intent)
            }else if (secilenKutuphane==kutuphane[2]){
                val intent = Intent(applicationContext, kutuphane_il::class.java)
                startActivity(intent)
            }else if (secilenKutuphane==kutuphane[3]){
                val intent = Intent(applicationContext, kutuphane_il::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, kutuphane_il::class.java)
                startActivity(intent)
            }

        }
    }
}