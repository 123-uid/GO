package com.example.go1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityMainBinding

class MainActivity : BaseActvity<ActivityMainBinding>() {
    override fun getLyout(): Int =R.layout.activity_main

    override fun initView() {
        val  al = supportFragmentManager.findFragmentById(R.id.fl) as NavHostFragment
        val  at = al.navController
        vie.bnv.setupWithNavController(at)
    }

    override fun initData() {

    }

}