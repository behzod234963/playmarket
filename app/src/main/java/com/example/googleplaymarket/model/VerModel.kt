package com.example.googleplaymarket.model

data class VerModel(val appIcon:Int,
                    val appName:String,
                    val appCorp:String,
                    val hoz:ArrayList<HozModel>?=null) {
}
