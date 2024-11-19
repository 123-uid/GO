package com.example.go1.newstay

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.NewsElityTay
import com.example.go1.elity.NewsElityType
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class NewsTayRepo :BaseRepo() {

    fun xw(cg:MutableLiveData<NewsElityTay>,sb:MutableLiveData<String>){
        api2().xw()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<NewsElityTay>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    sb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: NewsElityTay) {
                    cg.value=t
                }

            })

    }

    fun xwfl(fcg:MutableLiveData<NewsElityType>,fsb:MutableLiveData<String>){
        api2().fl()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<NewsElityType>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    fsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: NewsElityType) {
                    fcg.value=t
                }

            })

    }
}