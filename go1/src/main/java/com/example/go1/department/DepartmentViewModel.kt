package com.example.go1.department

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.DepartmentElity

class DepartmentViewModel :BaseViewModel<DepartmentRepo>() {

    var cg= MutableLiveData<DepartmentElity>()
    var sb=MutableLiveData<String>()
    fun department() {
        repo.department(cg,sb)
    }



    override fun createRepo(): DepartmentRepo {
        return DepartmentRepo()
    }
}