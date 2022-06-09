package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_otopark.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityOtopark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otopark)
        val otopark = listOf(
            "Konbeltaş Otopark",
            "Selçuklu Otoparkı",
            "Zindankale Katlı Otoparkı",
            "Fırat Otoparkı"
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, otopark )

        list_view9.adapter = adapter
        list_view9.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenPark = parent.getItemAtPosition(position) as String

            if (secilenPark==otopark [0]){
                val intent = Intent(applicationContext, otoparkZindan::class.java)
                startActivity(intent)
            }else if (secilenPark==otopark [1]){
                val intent = Intent(applicationContext, otoparkZindan::class.java)
                startActivity(intent)
            }else if (secilenPark==otopark [2]){
                val intent = Intent(applicationContext, otoparkZindan::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, otoparkZindan::class.java)
                startActivity(intent)
            }

        }
    }
}