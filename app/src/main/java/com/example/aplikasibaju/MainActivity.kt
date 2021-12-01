package com.example.aplikasibaju

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "TOKO PAKAIAN MARYATUL"

        val btnpria: Button = findViewById(R.id.btn_pria)
        btnpria.setOnClickListener(this)

        val btnwanita: Button = findViewById(R.id.btn_wanita)
        btnwanita.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when (v?.id){
            R.id.btn_pria->{
                val priaIntent = Intent(this@MainActivity, pria::class.java)
                startActivity(priaIntent)
            }
            R.id.btn_wanita->{
                val wanitaIntent = Intent(this@MainActivity, wanita::class.java)
                startActivity(wanitaIntent)
            }
        }
    }
    }