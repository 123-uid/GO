package com.example.go1.sing

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.SingEllity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class SingRepo :BaseRepo() {


        fun sing(cg:MutableLiveData<SingEllity>,sb:MutableLiveData<String>){
            api2().sing()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object :Observer<SingEllity>{
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onError(e: Throwable) {
                        sb.value=e.message
                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: SingEllity) {
                        cg.value=t
                    }

                })


        }

}