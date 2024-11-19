package com.example.go1.patroles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.PatrolesAdapter
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityPatrplesBinding

class PatrplesActivity : BaseMVVMActvity<ActivityPatrplesBinding, PatrolesViewModel>() {

    lateinit var patadapter: PatrolesAdapter

    override fun getLyout(): Int =R.layout.activity_patrples

    override fun getBaset(): Class<PatrolesViewModel> = PatrolesViewModel::class.java

    override fun initView() {
         vie.fh.setOnClickListener { finish() }


         mode.patroles()
         patadapter= PatrolesAdapter()
         vie.rv.layoutManager= LinearLayoutManager(this)
         vie.rv.adapter= patadapter


         vie.tj.setOnClickListener {
             startActivity(Intent(this, PatrplesADDActivity::class.java))
         }

    }

    override fun initData() {
           mode.cg.observe(this){
               if (it.code==200){
                   Log.i("TAG", "initData: 666")
                   patadapter.data.clear()
                   patadapter.data.addAll(it.data)
                   patadapter.notifyDataSetChanged()
               }
           }
          mode.sb.observe(this){
               Log.i("TAG", "initData: 111")
           }
    }

}