package com.example.go1.department

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.DepartmentAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityDepartmentBinding

class DepartmentActivity : BaseMVVMActvity<ActivityDepartmentBinding,DepartmentViewModel>() {

    lateinit var departmentAdaptert: DepartmentAdaptert

    override fun getLyout(): Int =R.layout.activity_department

    override fun getBaset(): Class<DepartmentViewModel> = DepartmentViewModel::class.java

    override fun initView() {
         vie.fh.setOnClickListener {
             finish()
         }
        vie.tj.setOnClickListener {
            startActivity(Intent(this,DepartmentADDActivity::class.java))
        }
        mode.department()
        departmentAdaptert= DepartmentAdaptert()
        vie.rv.layoutManager= LinearLayoutManager(this)
        vie.rv.adapter=departmentAdaptert
    }

    override fun initData() {
        mode.cg.observe(this){
            if (it.code==200){
                departmentAdaptert.data.clear()
                departmentAdaptert.data.addAll(it.data)
                departmentAdaptert.notifyDataSetChanged()
            }
        }
    }

}