package com.example.go1.sing

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivitySingBinding
import java.text.SimpleDateFormat

class SingActivity : BaseActvity<ActivitySingBinding>() {



    override fun getLyout(): Int =R.layout.activity_sing

    override fun initView() {

        val name = "123"
        val age = "18"
        val sex = "男"
        val phone = "123456789"
         val  address = "天津市"
        val idcard = "123456789"
        val email = "123456789@qq.com"
        val qq = "123456789"
        val work = "学生"

        //时间格式化
        val sdf = SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
        val date = sdf.format(System.currentTimeMillis())



        vie.fh.setOnClickListener { finish() }
        vie.btQd.setOnClickListener {
            Toast.makeText(this, "签到成功", Toast.LENGTH_SHORT).show()
        }
        vie.btQd.setOnClickListener {
            Toast.makeText(this, "签到成功", Toast.LENGTH_SHORT).show()
        }
        vie.btQdxx.setOnClickListener {
            Toast.makeText(this, "姓名${name}地址${address}签到时间${date}", Toast.LENGTH_SHORT).show()
        }


    }

    override fun initData() {

    }

}