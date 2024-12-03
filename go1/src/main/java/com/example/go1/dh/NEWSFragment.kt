package com.example.go1.dh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.go1.R
import com.example.go1.adaptert.NewsTayAdaptert
import com.example.go1.adaptert.NewsTypeAdaptert
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.base.BaseRepo
import com.example.go1.databinding.FragmentNEWSBinding
import com.example.go1.newstay.NewsTayViewModel


class NEWSFragment : BaseMVVMFraent<FragmentNEWSBinding,NewsTayViewModel>() {

    lateinit var newsTayAdaptert: NewsTayAdaptert

    lateinit var newsTypeAdaptert: NewsTypeAdaptert


    override fun getLyout(): Int =R.layout.fragment_n_e_w_s

    override fun getBaset(): Class<NewsTayViewModel> = NewsTayViewModel::class.java

    override fun initView() {

    }

    override fun initData() {

    }

}