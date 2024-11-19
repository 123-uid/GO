package com.example.go1.patroles

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.PatrolesElity

class PatrolesViewModel :BaseViewModel<PatrolesRepo>() {

    val cg= MutableLiveData<PatrolesElity>()
    val sb= MutableLiveData<String>()
    fun patroles(){
        repo.patroles(cg,sb)
    }


    override fun createRepo(): PatrolesRepo {
        return PatrolesRepo()
    }
}