package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main_anasayfa.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityParklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parklar)
        val park = listOf(
            "80 Binde Devri Alem Parkı",
            "Tropikal Kelebek Bahçesi",
            "Kyoto Japon Parkı",
            "Ecdad Parkı",
            "Sille Baraj Parkı",
            "Türk Yıldızları Parkı",
            "Akyokuş Tabiat Parkı"
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, park)

        list_view2.adapter = adapter
        list_view2.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

                val secilenPark = parent.getItemAtPosition(position) as String

            if (secilenPark==park[0]){
                val intent = Intent(applicationContext, parkSeksen::class.java)
                startActivity(intent)
            }else if (secilenPark==park[1]){
                val intent = Intent(applicationContext, parkKelebek::class.java)
                startActivity(intent)
            }else if (secilenPark==park[2]){
                val intent = Intent(applicationContext, parkJapon::class.java)
                startActivity(intent)
            }else if (secilenPark==park[3]){
                val intent = Intent(applicationContext, parkEcdad::class.java)
                startActivity(intent)
            }else if (secilenPark==park[4]){
                val intent = Intent(applicationContext, parkBaraj::class.java)
                startActivity(intent)
            }else if (secilenPark==park[5]){
                val intent = Intent(applicationContext, parkYildiz::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, parkAkyokus::class.java)
                startActivity(intent)
            }

            }
    }
}