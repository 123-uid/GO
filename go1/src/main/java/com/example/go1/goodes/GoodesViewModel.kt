package com.example.go1.goodes

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.BannerElity
import com.example.go1.elity.CategoryElity
import com.example.go1.elity.DetailElity
import com.example.go1.elity.GoodesElity

class GoodesViewModel:BaseViewModel<GoodesRepo>() {


    val bcg=MutableLiveData<BannerElity>()
     val bsb= MutableLiveData<String>()
    fun banner(){
        repo.banner(bcg,bsb)
    }

    val gcg=MutableLiveData<GoodesElity>()
    val gsb=MutableLiveData<String>()
    fun goodes(){
        repo.goodes(gcg,gsb)
    }

    val xcg=MutableLiveData<DetailElity>()
    val xsb=MutableLiveData<String>()
    fun xq(){
        repo.xq(xcg,xsb)
    }

    val scg=MutableLiveData<GoodesElity>()
    val ssb=MutableLiveData<String>()
    fun ss(){
        repo.ss(scg,ssb)
    }

    val ycg=MutableLiveData<CategoryElity>()
    val ysb=MutableLiveData<String>()
    fun yj(){
        repo.ys(ycg,ysb)
    }

    val rcg=MutableLiveData<GoodesElity>()
    val rsb=MutableLiveData<String>()
    fun rj(){
        repo.rj(rcg,rsb)
    }

    val jcg=MutableLiveData<GoodesElity>()
    val jsb=MutableLiveData<String>()
    fun sj(){
        repo.sj(jcg,jsb)
    }

    val ccg=MutableLiveData<DetailElity>()
    val csb=MutableLiveData<String>()
    fun gwc(){
        repo.gwc(ccg,csb)
    }


    override fun createRepo(): GoodesRepo {
        return GoodesRepo()
    }
}