package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class stokbarang : AppCompatActivity() {
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stokbarang)

        imageView1 = findViewById(R.id.imageview5)
        imageView2 = findViewById(R.id.tambahh)

        imageView1.setOnClickListener {
            val intentDirection = Intent(this@stokbarang, home::class.java)
            startActivity(intentDirection) }

            imageView2.setOnClickListener {
                val intentDirection = Intent(this@stokbarang, create::class.java)
                startActivity(intentDirection) }

        }
        }