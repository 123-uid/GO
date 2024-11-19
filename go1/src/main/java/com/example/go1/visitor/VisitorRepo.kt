package com.example.go1.visitor

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.VisitorElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class VisitorRepo :BaseRepo(){

    fun visitor(cg:MutableLiveData<VisitorElity>, sb: MutableLiveData<String>){
            api2().visitor()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<VisitorElity> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onError(e: Throwable) {
                        sb.value=e.message
                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: VisitorElity) {
                        cg.value=t
                    }

                })

    }

}