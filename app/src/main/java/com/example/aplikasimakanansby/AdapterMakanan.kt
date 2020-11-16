package com.example.aplikasimakanansby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_makanan.view.*

class AdapterMakanan (val itemMakanan: List<DataMakanan>, val clickListener: (DataMakanan) -> Unit) :
RecyclerView.Adapter<RecyclerView.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_makanan,parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemMakanan[position],clickListener)
    }

    override fun getItemCount() = itemMakanan.size

    class PartViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(data : DataMakanan, clickListener: (DataMakanan) -> Unit) {
            itemView.list_gambar.setImageResource(data.gbrMak)
            itemView.list_makanan.text = data.namaMak
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}