package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class barangmasuk : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barangmasuk)

        imageView = findViewById(R.id.btntitik)
        imageView1 = findViewById(R.id.btntitik1)
        imageView2 = findViewById(R.id.btntitik2)
        imageView3 = findViewById(R.id.btntitik3)
        imageView4 = findViewById(R.id.btntitik4)

        imageView.setOnClickListener {
            val intentDirection = Intent(this@barangmasuk, update::class.java)
            startActivity(intentDirection) }

        imageView1.setOnClickListener {
            val intentDirection = Intent(this@barangmasuk, update::class.java)
            startActivity(intentDirection) }

        imageView2.setOnClickListener {
            val intentDirection = Intent(this@barangmasuk, update::class.java)
            startActivity(intentDirection) }

        imageView3.setOnClickListener {
            val intentDirection = Intent(this@barangmasuk, update::class.java)
            startActivity(intentDirection) }

        imageView4.setOnClickListener {
            val intentDirection = Intent(this@barangmasuk, update::class.java)
            startActivity(intentDirection) }


    }
}