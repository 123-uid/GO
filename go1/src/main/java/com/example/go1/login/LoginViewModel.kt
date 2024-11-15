package com.example.go1.login

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.UserElity

class LoginViewModel :BaseViewModel<LoginRepo>() {

    val  cg= MutableLiveData<UserElity>()
    val sb=MutableLiveData<String>()
    fun login(username:String,password:String){
        repo.login(username,password,cg,sb)
    }


    override fun createRepo(): LoginRepo {
         return LoginRepo()
    }
}