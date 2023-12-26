package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profil : AppCompatActivity() {
    private lateinit var buttonlogout: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        buttonlogout = findViewById(R.id.btn4)

        buttonlogout.setOnClickListener {
            val intentDirection = Intent(this@profil, MainActivity ::class.java)
            startActivity(intentDirection)
        }
    }
}