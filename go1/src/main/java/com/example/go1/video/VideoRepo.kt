package com.example.go1.video

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.CommentElity
import com.example.go1.elity.GiftElity
import com.example.go1.elity.VideoElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class VideoRepo  :BaseRepo() {

    fun video(cg:MutableLiveData<VideoElity>,sb:MutableLiveData<String>){
        api2().video()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<VideoElity>{
                override fun onSubscribe(d: Disposable) {
                                                                                                                                                                                     99
                }

                override fun onError(e: Throwable) {
                     sb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: VideoElity) {
                    cg.value=t
                }

            })


    }

    fun comment(ccg:MutableLiveData<CommentElity>,csb:MutableLiveData<String>){
        api2().comment()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<CommentElity>{
                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                    csb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: CommentElity) {
                    ccg.value=t
                }

            })


    }

    fun gift(gcg:MutableLiveData<GiftElity>,gsb:MutableLiveData<String>){
        api2().gift()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<GiftElity>{
                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                    gsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GiftElity) {
                    gcg.value=t
                }

            })


    }

}