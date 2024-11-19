package com.example.go1.patroles

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.PatrolesElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class PatrolesRepo :BaseRepo() {


    fun patroles(cg:MutableLiveData<PatrolesElity>, sb: MutableLiveData<String>){
           api2().patroles()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<PatrolesElity> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onError(e: Throwable) {
                        sb.value=e.message
                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: PatrolesElity) {
                        cg.value=t
                    }

                })
    }

}