package com.example.projectsisteminformasimanajementokogrosir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonlogin: Button
    private lateinit var buttonSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin = findViewById(R.id.btn1)
        buttonSignUp = findViewById(R.id.btn2)

        //intent untuk memindahkan halaman ketika button di klik
        buttonlogin.setOnClickListener {
            val intentDirection = Intent(this@MainActivity, login::class.java)
            startActivity(intentDirection) }

        buttonSignUp.setOnClickListener {
            val intentDirection = Intent(this@MainActivity, Register::class.java)
            startActivity(intentDirection) }


    }
}

