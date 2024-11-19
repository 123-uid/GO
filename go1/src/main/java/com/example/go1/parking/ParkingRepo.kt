package com.example.go1.parking

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.ParkingElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class ParkingRepo :BaseRepo() {


      fun prking(cg: MutableLiveData<ParkingElity>, sb:MutableLiveData<String>){
            api2().parking()
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<ParkingElity> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onError(e: Throwable) {
                        sb.value=e.message
                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: ParkingElity) {
                        cg.value=t
                    }

                })


        }

}