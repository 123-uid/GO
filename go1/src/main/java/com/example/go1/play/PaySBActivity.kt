package com.example.go1.play

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityPaySbactivityBinding

class PaySBActivity : BaseActvity<ActivityPaySbactivityBinding>() {
    override fun getLyout(): Int =R.layout.activity_pay_sbactivity

    override fun initView() {
         vie.fh.setOnClickListener {
             finish()
         }
    }

    override fun initData() {

    }

}