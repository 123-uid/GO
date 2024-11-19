package com.example.go1.visitor

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.VisitorElity

class VisitorViewModel :BaseViewModel<VisitorRepo>() {

    val cg= MutableLiveData<VisitorElity>()
    val sb= MutableLiveData<String>()
    fun visitor() {
        repo.visitor(cg,sb)
    }


    override fun createRepo(): VisitorRepo {
        return  VisitorRepo()
    }
}