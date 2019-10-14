package com.murat.kotlinrecyclerview;

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murat.kotlinrecyclerview.AdapterModel.View_Holder as View_Holder1

class AdapterModel(val items: ArrayList<UserModel>, val context: Context) :
    RecyclerView.Adapter<View_Holder1>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): View_Holder1 {
        val view = View_Holder1(LayoutInflater.from(context).inflate(R.layout.item, parent, false))

        return view
    }

    override fun onBindViewHolder(holder: View_Holder1, position: Int) {
     holder?.tvName?.text = items.get(position).adi
     holder?.tvSurname?.text = items.get(position).soyadi
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class View_Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvSurname = itemView.findViewById<TextView>(R.id.tvSurName)
    }

}
