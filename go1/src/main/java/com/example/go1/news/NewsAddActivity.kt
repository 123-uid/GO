package com.example.go1.news

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityNewsAddBinding
import com.example.go1.databinding.ActivityNewsBinding

class NewsAddActivity : BaseActvity<ActivityNewsAddBinding>() {
    override fun getLyout(): Int = R.layout.activity_news_add

    override fun initView() {
       vie.fh.setOnClickListener { finish() }

       vie.btTj.setOnClickListener {
           finish()
           Toast.makeText(this,"添加成功",Toast.LENGTH_SHORT).show()
       }

    }

    override fun initData() {

    }

}