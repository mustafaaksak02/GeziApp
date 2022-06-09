package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ibadet.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityIbadet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibadet)
        val ibadet = listOf(
            "Aziziye Camii",
            "Kapı Camii",
            "Selimiye Camii",
            "Hacıveyiszade Camii",
            "Aziz Pavlus Kilisesi",
            "Saint Paul Kilisesi",
            "İplikçi Camii"
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ibadet)

        list_view8.adapter = adapter
        list_view8.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenİbadet = parent.getItemAtPosition(position) as String

            if (secilenİbadet==ibadet[0]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else if (secilenİbadet==ibadet[1]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else if (secilenİbadet==ibadet[2]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else if (secilenİbadet==ibadet[3]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else if (secilenİbadet==ibadet[4]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else if (secilenİbadet==ibadet[5]){
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, ibadet_iplikci::class.java)
                startActivity(intent)
            }

        }
    }
}