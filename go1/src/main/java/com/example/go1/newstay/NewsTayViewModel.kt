package com.example.go1.newstay

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.NewsElityTay
import com.example.go1.elity.NewsElityType

class NewsTayViewModel :BaseViewModel<NewsTayRepo>(){

    val cg= MutableLiveData<NewsElityTay>()
    val sb=MutableLiveData<String>()
    fun xw() {
        repo.xw(cg,sb)
    }

    val fcg=MutableLiveData<NewsElityType>()
    val fsb=MutableLiveData<String>()
    fun flxw() {
        repo.xwfl(fcg,fsb)
    }


    override fun createRepo(): NewsTayRepo {
         return NewsTayRepo()
    }
}