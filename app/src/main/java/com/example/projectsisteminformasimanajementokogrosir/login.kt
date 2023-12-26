package com.example.projectsisteminformasimanajementokogrosir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    private lateinit var buttonlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonlogin = findViewById(R.id.btn2)

        buttonlogin.setOnClickListener {
            val intentDirection = Intent(this@login, home::class.java)
            startActivity(intentDirection) }

    }
}