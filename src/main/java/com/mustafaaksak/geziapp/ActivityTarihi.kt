package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_parklar.*
import kotlinx.android.synthetic.main.activity_tarihi.*

class ActivityTarihi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarihi)
        val tarihi = listOf(
            "Mevlana Müzesi",
            "Konya Arkeoloji Müzesi",
            "Atatürk Evi Müzesi",
            "Çatalhöyük Antik Kenti",
            "İnce Minareli Medrese",
            "Sırçalı Medrese"

        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarihi)

        list_view4.adapter = adapter
        list_view4.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenTarihi = parent.getItemAtPosition(position) as String

            if (secilenTarihi==tarihi[0]){
                val intent = Intent(applicationContext, tarihiMevlana::class.java)
                startActivity(intent)
            }else if (secilenTarihi==tarihi[1]){
                val intent = Intent(applicationContext, tarihi_catalhoyuk::class.java)
                startActivity(intent)
            }else if (secilenTarihi==tarihi[2]){
                val intent = Intent(applicationContext, tarihiMevlana::class.java)
                startActivity(intent)
            }else if (secilenTarihi==tarihi[3]){
                val intent = Intent(applicationContext, tarihi_catalhoyuk::class.java)
                startActivity(intent)
            }else if (secilenTarihi==tarihi[4]){
                val intent = Intent(applicationContext, tarihiMevlana::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, tarihiMevlana::class.java)
                startActivity(intent)
            }

        }
    }
}