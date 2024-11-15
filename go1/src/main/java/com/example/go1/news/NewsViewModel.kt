package com.example.go1.news

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.NewsElity

class NewsViewModel  :BaseViewModel<NewsRepo>() {

    val ncg= MutableLiveData<NewsElity>()
    val nsb=MutableLiveData<String>()

    fun news(){
        repo.news(ncg,nsb)
    }

    override fun createRepo(): NewsRepo {
        return  NewsRepo()
    }
}