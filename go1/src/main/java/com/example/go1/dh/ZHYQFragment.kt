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
import com.example.go1.department.DepartmentActivity
import com.example.go1.news.NewsActivity
import com.example.go1.parking.ParkingActivity
import com.example.go1.patroles.PatrplesActivity
import com.example.go1.repair.RepairADDActivity
import com.example.go1.repair.RepairActivity
import com.example.go1.sing.SingActivity
import com.example.go1.sing.YdSingActivity
import com.example.go1.visitor.VisitorActivity

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
        @JavascriptInterface
        fun androidsign(id: String) {
            //打开签到activity
           startActivity(Intent(context,SingActivity::class.java))
        }
        @JavascriptInterface
        fun androidaddculture(id: String) {
            //打开新闻activity
            startActivity(Intent(context,NewsActivity::class.java))
        }
        @JavascriptInterface
        fun androidparking(id: String?) {
            //车位申请
             startActivity(Intent(context,ParkingActivity::class.java))
        }
        @JavascriptInterface
        fun androidapply(id: String?) {
            //我的申请
        }
        @JavascriptInterface
        fun androidvisit(id: String?) {
            //来访预约
              startActivity(Intent(context,VisitorActivity::class.java))
        }
        @JavascriptInterface
        fun androidpatrol(id: String?) {
            //巡更管理
            startActivity(Intent(context,PatrplesActivity::class.java))
        }

        fun androidnews(id: String?) {
        }

        fun androidnoticelist(id: String?) {
        }
        @JavascriptInterface
        fun androidrepair(id: String?) {
            //维修管理
              startActivity(Intent(context, RepairActivity::class.java))
        }
        @JavascriptInterface
        fun androidaddrepair(id: String?) {
            //添加维修
             startActivity(Intent(context, RepairADDActivity::class.java))
        }
        @JavascriptInterface
        fun androidaddnotice(id: String?) {
            //公告管理
        }

        @JavascriptInterface
        fun androidculture(id: String?) {
            //文化管理

        }
        @JavascriptInterface
        fun androidnotice(id: String?) {
            //公告管理
        }
        @JavascriptInterface
        fun androidattendance(id: String?) {
            //考勤管理
               startActivity(Intent(context,YdSingActivity::class.java))
        }
        @JavascriptInterface
        fun androidproperty(id: String?) {
            //物业审核
        }
        @JavascriptInterface
        fun androidcheckculture(id: String?) {
            //文化审核
        }
        @JavascriptInterface
        fun androidpeople(id: String?) {
            //人资管理
            startActivity(Intent(context, DepartmentActivity::class.java))
        }
    }

}