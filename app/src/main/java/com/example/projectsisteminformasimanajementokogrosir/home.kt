package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class home : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imageView = findViewById(R.id.imageview1)
        imageView2 = findViewById(R.id.imageview2)
        imageView3 = findViewById(R.id.imageview3)
        imageView1= findViewById(R.id.imageview4)

        imageView.setOnClickListener {
            val intentDirection = Intent(this@home, stokbarang::class.java)
            startActivity(intentDirection) }

                imageView2.setOnClickListener {
                    val intentDirection = Intent(this@home, barangmasuk::class.java)
                    startActivity(intentDirection) }

                    imageView3.setOnClickListener {
                        val intentDirection = Intent(this@home, barangkeluar::class.java)
                        startActivity(intentDirection) }

                        imageView1.setOnClickListener {
                            val intentDirection = Intent(this@home, profil::class.java)
                            startActivity(intentDirection) }

    }
}

