package com.mustafaaksak.geziapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_market.*
import kotlinx.android.synthetic.main.activity_parklar.*

class ActivityMarket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market)
        val market = listOf(
            "Kulesite AVM Konya",
            "M1 Konya Alışveriş Merkezi",
            "Konya Kentplaza AVM",
            "Novaland Outlet Alışveriş Merkezi",
            "Konya Park Avm"

        )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, market)

        list_view7.adapter = adapter
        list_view7.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenMarket = parent.getItemAtPosition(position) as String

            if (secilenMarket==market[0]){
                val intent = Intent(applicationContext, marketKule::class.java)
                startActivity(intent)
            }else if (secilenMarket==market[1]){
                val intent = Intent(applicationContext, marketKule::class.java)
                startActivity(intent)
            }else if (secilenMarket==market[2]){
                val intent = Intent(applicationContext, marketKule::class.java)
                startActivity(intent)
            }else if (secilenMarket==market[3]){
                val intent = Intent(applicationContext, marketKule::class.java)
                startActivity(intent)
            }else {
                val intent = Intent(applicationContext, marketKule::class.java)
                startActivity(intent)
            }

        }
    }
}