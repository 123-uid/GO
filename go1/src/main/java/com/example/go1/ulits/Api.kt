package com.example.go1.ulits

import com.example.go1.elity.NewsElity
import com.example.go1.elity.UserElity
import com.example.go1.elity.VideoElity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    @POST(Conts.DL)
    fun login(@Query("username") username:String,@Query("password") password:String):Observable<UserElity>

    @POST(Conts.ZC)
    fun register(@Query("username") username:String,@Query("password") password:String,@Query("repassword") repassword:String):Observable<UserElity>

    @GET(Conts.BASE_VIDEO)
    fun video():Observable<VideoElity>

    @GET(Conts.BASE_NEWS)
    fun news():Observable<NewsElity>

}