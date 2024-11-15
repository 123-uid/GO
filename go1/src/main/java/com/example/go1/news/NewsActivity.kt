package com.example.go1.news


import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.NewsAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityNewsBinding

class NewsActivity : BaseMVVMActvity<ActivityNewsBinding,NewsViewModel>() {


    lateinit var newsAdaptert: NewsAdaptert


    override fun getLyout(): Int = R.layout.activity_news

    override fun getBaset(): Class<NewsViewModel> =  NewsViewModel::class.java

    override fun initView() {
        vie.fh.setOnClickListener { finish() }
        vie.tj.setOnClickListener {
            startActivity(Intent(this,NewsAddActivity::class.java))
        }
           mode.news()

           newsAdaptert = NewsAdaptert()
           vie.rv.layoutManager = LinearLayoutManager(this)
           vie.rv.adapter = newsAdaptert

    }

    override fun initData() {
           mode.ncg.observe(this){
                if (it.code==200){
                    newsAdaptert.data.clear()
                    newsAdaptert.data.addAll(it.data)
                    newsAdaptert.notifyDataSetChanged()
                }
           }
    }

}