package com.example.go1.dh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.JavascriptInterface
import com.example.go1.R
import com.example.go1.base.BaseFraent
import com.example.go1.databinding.FragmentZHYQBinding
import com.example.go1.news.NewsActivity

class ZHYQFragment : BaseFraent<FragmentZHYQBinding>() {

    private var  url ="http://10.161.9.80:7035"

    override fun getLyout(): Int =R.layout.fragment_z_h_y_q

    override fun initView() {
        vie.we.loadUrl(url)
        vie.we.settings.javaScriptEnabled=true
        vie.we.addJavascriptInterface(MainWebViewJavaScriptFun(),"androidinfo")

    }

    override fun initData() {

    }

    inner class MainWebViewJavaScriptFun{
        fun androidsign(id: String) {
            //打开签到activity


        }
        @JavascriptInterface
        fun androidaddculture(id: String) {
            //打开新闻activity
            startActivity(Intent(context,NewsActivity::class.java))
        }

        fun androidparking(id: String?) {
            //车位申请
        }

        fun androidapply(id: String?) {
            //我的申请
        }

        fun androidvisit(id: String?) {
            //来访预约
        }

        fun androidpatrol(id: String?) {
            //巡更管理
        }

        fun androidnews(id: String?) {
        }

        fun androidnoticelist(id: String?) {
        }
        fun androidrepair(id: String?) {
            //维修管理
        }

        fun androidaddrepair(id: String?) {
            //添加维修
        }

        fun androidaddnotice(id: String?) {
            //公告管理
        }

        @JavascriptInterface
        fun androidculture(id: String?) {
            //文化管理

        }

        fun androidnotice(id: String?) {
            //公告管理
        }

        fun androidattendance(id: String?) {
            //考勤管理
        }

        fun androidproperty(id: String?) {
            //物业审核
        }

        fun androidcheckculture(id: String?) {
            //文化审核
        }

        fun androidpeople(id: String?) {
            //人资管理
        }
    }

}