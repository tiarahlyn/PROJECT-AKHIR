package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Register : AppCompatActivity() {

    private lateinit var buttondaftar: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        buttondaftar = findViewById(R.id.btn3)
        buttondaftar.setOnClickListener {
            val intentDirection = Intent(this@Register, login ::class.java)
            startActivity(intentDirection)



        }
    }
}


