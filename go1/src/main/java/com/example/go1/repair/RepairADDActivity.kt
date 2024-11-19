package com.example.go1.repair

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityRepairAddactivityBinding

class RepairADDActivity : BaseActvity<ActivityRepairAddactivityBinding>() {
    override fun getLyout(): Int =R.layout.activity_repair_addactivity

    override fun initView() {
        vie.fh.setOnClickListener { finish() }
        vie.bt.setOnClickListener {
            Toast.makeText(this,"提交成功",Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    override fun initData() {

    }

}