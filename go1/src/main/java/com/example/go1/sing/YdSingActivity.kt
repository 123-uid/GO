package com.example.go1.sing



import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.SingAdaptert
import com.example.go1.base.BaseActvity
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityYdSingBinding

class YdSingActivity : BaseMVVMActvity<ActivityYdSingBinding,SingViewModel>() {


    protected lateinit var singAdaptert: SingAdaptert

    override fun getLyout(): Int =R.layout.activity_yd_sing

    override fun getBaset(): Class<SingViewModel> = SingViewModel::class.java

    override fun initView() {
        vie.fh.setOnClickListener { finish() }
         mode.getSing()
         singAdaptert= SingAdaptert()
        vie.rv.layoutManager= LinearLayoutManager(this)
         vie.rv.adapter=singAdaptert


    }

    override fun initData() {
         mode.cg.observe(this){
             if (it.code==200){
                 singAdaptert.data.clear()
                 singAdaptert.data.addAll(it.data)
                 singAdaptert.notifyDataSetChanged()
             }
         }
    }

}