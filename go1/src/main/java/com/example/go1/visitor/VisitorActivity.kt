package com.example.go1.visitor

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.VisitorAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityVisitorBinding

class VisitorActivity : BaseMVVMActvity<ActivityVisitorBinding,VisitorViewModel>() {


    lateinit var visitorAdaptert: VisitorAdaptert

    override fun getLyout(): Int =R.layout.activity_visitor

    override fun getBaset(): Class<VisitorViewModel> = VisitorViewModel::class.java

    override fun initView() {
        vie.fh.setOnClickListener { finish() }
        vie.tj.setOnClickListener {
             startActivity(Intent(this,VisitorADDActivity::class.java))
        }
        mode.visitor()
        visitorAdaptert= VisitorAdaptert()
        vie.rv.layoutManager= LinearLayoutManager(this)
        vie.rv.adapter= visitorAdaptert

    }

    override fun initData() {
        mode.cg.observe(this){
            if (it.code==200){
                visitorAdaptert.data.clear()
                visitorAdaptert.data.addAll(it.data)
                visitorAdaptert.notifyDataSetChanged()
            }
        }


    }

}