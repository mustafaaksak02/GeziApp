package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_otel.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityOtel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otel)
        val otel = listOf(
            "Grand Millennium Konya Hotel",
            "ibis Konya",
            "Ramada Plaza Konya",
            "Gherdan Gold",
            "Mevlana Otel",
            "Anemon Konya",
            "Dedeman Konya Hotel"
        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, otel)

        list_view6.adapter = adapter
        list_view6.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenOtel = parent.getItemAtPosition(position) as String

            if (secilenOtel==otel[0]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else if (secilenOtel==otel[1]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else if (secilenOtel==otel[2]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else if (secilenOtel==otel[3]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else if (secilenOtel==otel[4]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else if (secilenOtel==otel[5]){
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, otel_ibis::class.java)
                startActivity(intent)
            }

        }
    }
}