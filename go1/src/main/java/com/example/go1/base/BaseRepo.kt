package com.example.go1.base

import com.example.go1.ulits.Api
import com.example.go1.ulits.RetrofitUlits

abstract class BaseRepo {
    //公司
    fun api1():Api =RetrofitUlits.retrofit1().create(Api::class.java)
    //外网个人
    fun api2():Api =RetrofitUlits.retrofit2().create(Api::class.java)
    //测试登录注册
    fun api3():Api =RetrofitUlits.retrofit3().create(Api::class.java)

}