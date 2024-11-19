package com.example.go1.parking

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.ParkingElity

class ParkingViewModel :BaseViewModel<ParkingRepo>() {


    val cg= MutableLiveData<ParkingElity>()
    val sb=MutableLiveData<String>()


    fun parking(){
        repo.prking(cg,sb)
    }



    override fun createRepo(): ParkingRepo {
         return ParkingRepo()
    }
}