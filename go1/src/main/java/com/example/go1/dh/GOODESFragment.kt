package com.example.go1.dh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.go1.R
import com.example.go1.base.BaseFraent
import com.example.go1.databinding.FragmentGOODESBinding

class GOODESFragment : BaseFraent<FragmentGOODESBinding>() {
    override fun getLyout(): Int =R.layout.fragment_g_o_o_d_e_s

    override fun initView() {
        val  al = childFragmentManager.findFragmentById(R.id.fl) as NavHostFragment
        val  at = al.navController
        vie.bnv.setupWithNavController(at)
    }

    override fun initData() {

    }
}