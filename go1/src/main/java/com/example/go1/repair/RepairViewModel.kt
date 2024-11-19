package com.example.go1.repair
import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.RepairElity

class RepairViewModel :BaseViewModel<RepairRepo>() {

    var cg=MutableLiveData<RepairElity>()
    var sb= MutableLiveData<String>()
    fun repair() {
        repo.repair(cg,sb)
    }


    override fun createRepo(): RepairRepo {
        return RepairRepo()
    }
}