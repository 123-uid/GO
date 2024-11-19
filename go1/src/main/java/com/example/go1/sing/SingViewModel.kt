package com.example.go1.sing

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.SingEllity

class SingViewModel :BaseViewModel<SingRepo>() {

    val cg=MutableLiveData<SingEllity>()
    val sb= MutableLiveData<String>()

    fun getSing(){
        repo.sing(cg,sb)
    }


    override fun createRepo(): SingRepo {
        return SingRepo()
    }

}