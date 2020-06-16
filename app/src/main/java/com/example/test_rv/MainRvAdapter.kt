package com.example.test_rv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainRvAdapter(val context: Context, val countryList: ArrayList<Country>) :
    RecyclerView.Adapter<MainRvAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_rv_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(countryList[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val countryList = itemView?.findViewById<TextView>(R.id.countryTv)
        fun bind(country: Country, context: Context) {
            countryList?.text = country.countryName
        }
    }
}