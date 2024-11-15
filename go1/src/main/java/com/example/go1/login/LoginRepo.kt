package com.example.go1.login

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.UserElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class LoginRepo :BaseRepo() {

    fun login(username :String,password:String,cg:MutableLiveData<UserElity>,sb:MutableLiveData<String>){
        api3().login(username, password)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<UserElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    sb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: UserElity) {
                    cg.value=t
                }

            })

    }

}