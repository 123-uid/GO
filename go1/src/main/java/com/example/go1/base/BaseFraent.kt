package com.example.go1.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFraent<V:ViewDataBinding>:Fragment() {


    protected lateinit var vie:V


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        vie = DataBindingUtil.inflate(inflater,getLyout(), container, false)
        initView()
        initData()
        return vie.root
    }

    abstract fun getLyout(): Int

    abstract fun initView()

    abstract fun initData()
}