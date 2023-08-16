package com.example.googleplaymarket.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaymarket.R
import com.example.googleplaymarket.model.VerModel

class PlayAdapter(val context:Context,val list:ArrayList<VerModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val ITEM_VER=0
    val ITEM_HOZ=1

    class VerViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivAppIcon:ImageView=view.findViewById(R.id.iv_AppIcon)
        val tvAppName:TextView=view.findViewById(R.id.tv_AppName)
        val tvAppCorp:TextView=view.findViewById(R.id.tv_AppCorp)

    }

    class HozMainViewHolder(view: View):RecyclerView.ViewHolder(view){

        val rvHoz:RecyclerView=view.findViewById(R.id.rv_Horizontal)

    }

    override fun getItemViewType(position: Int): Int {

        return if (list[position].hoz.isNullOrEmpty()) ITEM_VER else ITEM_HOZ

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View
        if (viewType==ITEM_VER){

            view=LayoutInflater.from(parent.context).inflate(R.layout.item_ver,parent,false)
            return VerViewHolder(view)

        }else{

            view=LayoutInflater.from(parent.context).inflate(R.layout.item_hoz_main,parent,false)
            return HozMainViewHolder(view)

        }

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val playList=list[position]

        if (holder is VerViewHolder){

            holder.apply {

                ivAppIcon.setImageResource(playList.appIcon)
                tvAppName.text=playList.appName
                tvAppCorp.text=playList.appCorp

            }

        }

        if (holder is HozMainViewHolder){

            holder.apply {

                rvHoz.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                rvHoz.adapter=HozAdapter(playList.hoz!!)

            }

        }

    }

}