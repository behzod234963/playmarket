package com.example.googleplaymarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaymarket.adapter.PlayAdapter
import com.example.googleplaymarket.model.HozModel
import com.example.googleplaymarket.model.VerModel

class MainActivity : AppCompatActivity() {
    private val verList=ArrayList<VerModel>()
    private val hozList=ArrayList<HozModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val rvVertical:RecyclerView=findViewById(R.id.rv_Vertical)

        rvVertical.layoutManager=LinearLayoutManager(this)
        rvVertical.adapter=PlayAdapter(this,verList)
        loadData()

    }

    private fun loadData() {
        hozList.add(HozModel(R.drawable.pic_instagram,"Instagram"))
        hozList.add(HozModel(R.drawable.pic_facebook,"Facebook"))
        hozList.add(HozModel(R.drawable.pic_data,"Data"))
        hozList.add(HozModel(R.drawable.pic_ilkqadam,"Ilk Qadam"))
        hozList.add(HozModel(R.drawable.pic_twitter,"Twitter"))
        hozList.add(HozModel(R.drawable.pic_appicon,"Telegram"))
        verList.add(VerModel(R.drawable.pic_appicon,"Telegram","Telegran LLC",hozList))
        verList.add(VerModel(R.drawable.pic_twitter,"Facebook","Twitter",))
        verList.add(VerModel(R.drawable.pic_instagram,"Instagram","Meta",))
        verList.add(VerModel(R.drawable.pic_data,"Data","Data Union",))
        verList.add(VerModel(R.drawable.pic_facebook,"Facebook","Facebook",))
        verList.add(VerModel(R.drawable.pic_ilkqadam,"Ilk Qadam","Behzod INC",))
        verList.add(VerModel(R.drawable.pic_twitter,"Facebook","Twitter",))
        verList.add(VerModel(R.drawable.pic_instagram,"Instagram","Meta",))
        verList.add(VerModel(R.drawable.pic_data,"Data","Data Union",))
        verList.add(VerModel(R.drawable.pic_facebook,"Facebook","Facebook",))
        verList.add(VerModel(R.drawable.pic_ilkqadam,"Ilk Qadam","Behzod INC",))
        verList.add(VerModel(R.drawable.pic_twitter,"Facebook","Twitter",))
        verList.add(VerModel(R.drawable.pic_instagram,"Instagram","Meta",))
        verList.add(VerModel(R.drawable.pic_data,"Data","Data Union",))
        verList.add(VerModel(R.drawable.pic_facebook,"Facebook","Facebook",))
        verList.add(VerModel(R.drawable.pic_ilkqadam,"Ilk Qadam","Behzod INC",))
        verList.add(VerModel(R.drawable.pic_twitter,"Facebook","Twitter",))
        verList.add(VerModel(R.drawable.pic_instagram,"Instagram","Meta",))
        verList.add(VerModel(R.drawable.pic_data,"Data","Data Union",))
        verList.add(VerModel(R.drawable.pic_facebook,"Facebook","Facebook",))
        verList.add(VerModel(R.drawable.pic_ilkqadam,"Ilk Qadam","Behzod INC",))




    }
}