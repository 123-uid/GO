package com.example.go1.repair

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.RepairElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class RepairRepo :BaseRepo() {


    fun repair(cg:MutableLiveData<RepairElity>,sb:MutableLiveData<String>){
        api2().repair()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object:Observer<RepairElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    sb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: RepairElity) {
                    cg.value=t
                }

            })

    }

}