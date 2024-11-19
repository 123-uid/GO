package com.example.go1.parking

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityParkingVractivityBinding
import com.google.vr.sdk.widgets.pano.VrPanoramaView

class ParkingVRActivity : BaseActvity<ActivityParkingVractivityBinding>() {



    override fun getLyout(): Int =R.layout.activity_parking_vractivity

    override fun initView() {
            vie.fh.setOnClickListener { finish() }
            vie.tj.setOnClickListener {
                startActivity(Intent(this,ParkingADDActivity::class.java))
            }
         val  option = VrPanoramaView.Options()
         option.inputType = VrPanoramaView.Options.TYPE_MONO
         vie.vr.loadImageFromBitmap(BitmapFactory.decodeResource(resources,R.drawable.vrc1),option)
    }

    override fun initData() {

    }

}