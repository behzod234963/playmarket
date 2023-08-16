package com.example.googleplaymarket.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.googleplaymarket.R
import com.example.googleplaymarket.model.HozModel

class HozAdapter(val list:ArrayList<HozModel>):RecyclerView.Adapter<HozAdapter.HozViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HozViewHolder {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_hoz,parent,false)
        return HozViewHolder(view)

    }

    override fun onBindViewHolder(holder: HozViewHolder, position: Int) {

        val hozList=list[position]

        holder.ivAppIcon.setImageResource(hozList.appIconHoz)
        holder.tvAppName.text=hozList.AppNameHoz


    }

    override fun getItemCount(): Int {

        return list.size

    }

    class HozViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivAppIcon:ImageView=view.findViewById(R.id.iv_AppIconHoz)
        val tvAppName:TextView=view.findViewById(R.id.tv_AppName_Hoz)

    }

}