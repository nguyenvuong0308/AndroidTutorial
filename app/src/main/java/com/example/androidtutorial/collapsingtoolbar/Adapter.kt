package com.example.androidtutorial.collapsingtoolbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtutorial.R
import kotlinx.android.synthetic.main.collap_item.view.*

class Adapter(var context: Context, var listItems: ArrayList<String>) : RecyclerView.Adapter<Adapter.CollapHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollapHolder {
        return CollapHolder(LayoutInflater.from(context).inflate(R.layout.collap_item, parent, false))
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: CollapHolder, position: Int) {
        holder.bind(listItems[position])
    }

    class CollapHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(text: String) {
            itemView.tvText.text = text
        }
    }

}