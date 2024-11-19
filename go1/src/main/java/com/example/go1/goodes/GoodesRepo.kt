package com.example.go1.goodes

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseRepo
import com.example.go1.elity.BannerElity
import com.example.go1.elity.CategoryElity
import com.example.go1.elity.DetailElity
import com.example.go1.elity.GoodesElity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class GoodesRepo  :BaseRepo() {

    //轮播图
    fun banner(bcg:MutableLiveData<BannerElity>, bsb:MutableLiveData<String>){
        api2().splbt()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<BannerElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     bsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: BannerElity) {
                    bcg.value=t
                }

            })

    }
    //商品
    fun goodes(gcg:MutableLiveData<GoodesElity>,gsb:MutableLiveData<String>){
        api2().goodes()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<GoodesElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     gsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GoodesElity) {
                    gcg.value=t
                }

            })

    }
      //详情
     fun xq(xcg:MutableLiveData<DetailElity>, xsb:MutableLiveData<String>){
        api2().xq()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<DetailElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     xsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: DetailElity) {
                    xcg.value=t
                }

            })

    }
     //搜索
     fun ss(scg:MutableLiveData<GoodesElity>,ssb:MutableLiveData<String>){
        api2().ss()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<GoodesElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     ssb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GoodesElity) {
                    scg.value=t
                }

            })

    }
    //一级分类
    fun ys(ycg:MutableLiveData<CategoryElity>, ysb:MutableLiveData<String>){
        api2().yj()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<CategoryElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     ysb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: CategoryElity) {
                    ycg.value=t
                }

            })

    }
    //二级分类
    fun rj(rcg:MutableLiveData<GoodesElity>, rsb:MutableLiveData<String>){
        api2().rj()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<GoodesElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     rsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GoodesElity) {
                    rcg.value=t
                }

            })

    }
    //三级分类
    fun sj(jcg:MutableLiveData<GoodesElity>,jsb:MutableLiveData<String>){
        api2().sj()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<GoodesElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     jsb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GoodesElity) {
                    jcg.value=t
                }

            })

    }
    //购物车
    fun gwc(ccg:MutableLiveData<DetailElity>, csb:MutableLiveData<String>){
        api2().gwc()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object :Observer<DetailElity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                     csb.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: DetailElity) {
                    ccg.value=t
                }

            })

    }
}