package com.example.projectsisteminformasimanajementokogrosir

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class barangkeluar : AppCompatActivity() {

    private fun generateItemData(): List<com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item> {
        // Ganti dengan data item yang sebenarnya
        val itemList = mutableListOf<com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item>()

        // Contoh item pertama
        val item1 = com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item("Sunlight", "100", "Harga 1", R.drawable.ic_launcher_background)
        itemList.add(item1)

        // Contoh item kedua
        val item2 = com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item("Nama Barang 2", "QTY 2", "Harga 2", R.drawable.ic_launcher_background)
        itemList.add(item2)

        // Contoh item ketiga
        val item3 = com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item("Nama Barang 3", "QTY 3", "Harga 3", R.drawable.ic_launcher_background)
        itemList.add(item3)

        // Contoh item keempat
        val item4 = com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item("Nama Barang 4", "QTY 3", "Harga 3", R.drawable.ic_launcher_background)
        itemList.add(item4)

        // Contoh item kelima
        val item5 = com.example.projectsisteminformasimanajementokogrosir.barangkeluar.Item("Nama Barang 5", "QTY 3", "Harga 3", R.drawable.ic_launcher_background)
        itemList.add(item5)
        return itemList
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barangkeluar)
        val recyclerView: RecyclerView = findViewById(R.id.rv_item)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val itemList = generateItemData() // Ganti dengan data item yang sebenarnya
        val adapter = ItemAdapter(itemList)
        recyclerView.adapter = adapter



    }

    data class Item(val namaBarang: String, val qty: String, val harga: String, val imageResId: Int)

    inner class ItemAdapter(private val itemList: List<Item>) :
        RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

        inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imgCard: ImageView = itemView.findViewById(R.id.img_card)
            val nmbrg: TextView = itemView.findViewById(R.id.nmbrg)
            val qty: TextView = itemView.findViewById(R.id.qty)
            val harga: TextView = itemView.findViewById(R.id.harga)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_barang, parent, false)
            return ItemViewHolder(view)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val currentItem = itemList[position]
            holder.imgCard.setImageResource(currentItem.imageResId)
            holder.nmbrg.text = currentItem.namaBarang
            holder.qty.text = currentItem.qty
            holder.harga.text = currentItem.harga
        }

        override fun getItemCount(): Int {
            return itemList.size
        }
    }
}

