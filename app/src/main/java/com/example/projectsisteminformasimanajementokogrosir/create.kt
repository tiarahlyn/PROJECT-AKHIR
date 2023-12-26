package com.example.projectsisteminformasimanajementokogrosir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class create : AppCompatActivity() {

    private lateinit var buttonsimpan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        buttonsimpan = findViewById(R.id.btn2)

        buttonsimpan.setOnClickListener {
            val intentDirection = Intent(this@create, stokbarang::class.java)
            startActivity(intentDirection) }

    }
}