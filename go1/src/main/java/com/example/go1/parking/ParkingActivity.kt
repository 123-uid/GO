package com.example.go1.parking

import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.ParkingAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityParkingBinding

class ParkingActivity : BaseMVVMActvity<ActivityParkingBinding,ParkingViewModel>() {

    lateinit var parkingAdaptert: ParkingAdaptert

    override fun getLyout(): Int =R.layout.activity_parking

    override fun getBaset(): Class<ParkingViewModel> = ParkingViewModel::class.java
    override fun initView() {

        vie.fh.setOnClickListener {
            finish()
        }
        vie.tj.setOnClickListener {
            startActivity(Intent(this,ParkingVRActivity::class.java))
        }
          mode.parking()
        parkingAdaptert= ParkingAdaptert()
        vie.rv.layoutManager= LinearLayoutManager(this)
        vie.rv.adapter= parkingAdaptert
    }

    override fun initData() {
        mode.cg.observe(this){
           if (it.code==200){
                Log.i("TAG", "initData: 333" )
                parkingAdaptert.data.clear()
                parkingAdaptert.data.addAll(it.data)
                parkingAdaptert.notifyDataSetChanged()
           }
        }
        mode.sb.observe(this){
             Log.i("TAG", "initData: 222" )
        }
    }

}