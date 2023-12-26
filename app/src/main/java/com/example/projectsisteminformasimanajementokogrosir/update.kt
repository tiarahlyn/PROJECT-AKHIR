package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class update : AppCompatActivity() {

    private lateinit var buttondaftar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        buttondaftar = findViewById(R.id.bttn2)

        buttondaftar.setOnClickListener {
            val intentDirection = Intent(this@update, barangmasuk ::class.java)
            startActivity(intentDirection) }

    }
}