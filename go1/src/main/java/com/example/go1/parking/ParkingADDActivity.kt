package com.example.go1.parking


import android.widget.Toast
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityParkingAddactivityBinding


class ParkingADDActivity : BaseActvity<ActivityParkingAddactivityBinding>() {


    override fun getLyout(): Int =R.layout.activity_parking_addactivity

    override fun initView() {
        vie.fh.setOnClickListener { finish() }
        vie.bt.setOnClickListener {
            Toast.makeText(this,"保存成功",Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    override fun initData() {

    }

}