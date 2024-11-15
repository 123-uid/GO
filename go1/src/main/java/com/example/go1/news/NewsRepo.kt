package com.example.go1.news

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.NewsElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class NewsRepo :BaseRepo() {


    fun news(ncg:MutableLiveData<NewsElity>,nsb:MutableLiveData<String>){
        api2().news()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<NewsElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     nsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: NewsElity) {
                    ncg.value=t
                }

            })
    }

}