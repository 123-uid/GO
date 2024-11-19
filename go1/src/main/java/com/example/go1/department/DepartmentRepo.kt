package com.example.go1.department

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.DepartmentElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class DepartmentRepo :BaseRepo() {

      fun department(cg: MutableLiveData<DepartmentElity>, sb:MutableLiveData<String>){
        api2().department()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object: Observer<DepartmentElity> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    sb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: DepartmentElity) {
                    cg.value=t
                }

            })

    }

}