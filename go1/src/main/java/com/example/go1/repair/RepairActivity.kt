package com.example.go1.repair

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.RepairAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityRepairBinding

 class RepairActivity : BaseMVVMActvity<ActivityRepairBinding,RepairViewModel>() {


     lateinit var repairAdaptert: RepairAdaptert

    override fun getLyout(): Int =R.layout.activity_repair

    override fun getBaset(): Class<RepairViewModel> = RepairViewModel::class.java

    override fun initView() {
        mode.repair()
        repairAdaptert = RepairAdaptert()
        vie.rv.layoutManager = LinearLayoutManager(this)
        vie.rv.adapter = repairAdaptert

        vie.fh.setOnClickListener { finish() }
        vie.tj.setOnClickListener {
            startActivity(Intent(this,RepairADDActivity::class.java))
        }
    }

    override fun initData() {
        mode.cg.observe(this){
            if (it.code==200){
                repairAdaptert.data.clear()
                repairAdaptert.data.addAll(it.data)
                repairAdaptert.notifyDataSetChanged()
            }

        }
    }

}