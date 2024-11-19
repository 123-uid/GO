package com.example.go1.video

import androidx.lifecycle.MutableLiveData
import com.example.go1.base.BaseViewModel
import com.example.go1.elity.CommentElity
import com.example.go1.elity.GiftElity
import com.example.go1.elity.VideoElity

class VideoViewModel :BaseViewModel<VideoRepo>() {

    val cg= MutableLiveData<VideoElity>()
    val sb=MutableLiveData<String>()
    fun video(){
        repo.video(cg,sb)
    }

    val ccg=MutableLiveData<CommentElity>()
    val csb=MutableLiveData<String>()
    fun comment(){
        repo.comment(ccg,csb)
    }

    val gcg=MutableLiveData<GiftElity>()
    val gsb=MutableLiveData<String>()
    fun gift(){
        repo.gift(gcg,gsb)
    }



    override fun createRepo(): VideoRepo {
       return VideoRepo()
    }

}