package com.example.go1.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseMVVMActvity<V:ViewDataBinding,M:ViewModel>:AppCompatActivity() {



    protected lateinit var mode:M
    protected lateinit var vie:V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vie = DataBindingUtil.setContentView(this,getLyout())
        mode= ViewModelProvider(this)[getBaset()]
        initView()
        initData()
    }
    abstract fun getLyout(): Int

    abstract fun getBaset(): Class<M>

    abstract fun initView()

    abstract fun initData()
}