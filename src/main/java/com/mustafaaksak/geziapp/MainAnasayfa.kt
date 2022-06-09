package com.mustafaaksak.geziapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_anasayfa.*

class MainAnasayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_anasayfa)
        val kategoriler = listOf("Parklar", "Kütüphaneler", "Tarihi Yerler", "Oteller", "Marketler", "İbadet Yerleri", "Otoparklar")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kategoriler)

        list_view.adapter = adapter
        list_view.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenKategori = parent.getItemAtPosition(position) as String


            if (secilenKategori==kategoriler[0]){
                val intent = Intent(applicationContext, ActivityParklar::class.java)
                startActivity(intent)
            }else if (secilenKategori==kategoriler[1]){
                val intent = Intent(applicationContext, ActivityKutuphaneler::class.java)
                startActivity(intent)
            }else if (secilenKategori==kategoriler[2]){
                val intent = Intent(applicationContext, ActivityTarihi::class.java)
                startActivity(intent)
            }else if (secilenKategori==kategoriler[3]){
                val intent = Intent(applicationContext, ActivityOtel::class.java)
                startActivity(intent)
            }else if (secilenKategori==kategoriler[4]){
                val intent = Intent(applicationContext, ActivityMarket::class.java)
                startActivity(intent)
            }else if (secilenKategori==kategoriler[5]){
                val intent = Intent(applicationContext, ActivityIbadet::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, ActivityOtopark::class.java)
                startActivity(intent)
            }


        }


    }

}