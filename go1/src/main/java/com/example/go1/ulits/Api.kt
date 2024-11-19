package com.example.go1.ulits

import com.example.go1.elity.BannerElity
import com.example.go1.elity.CategoryElity
import com.example.go1.elity.CommentElity
import com.example.go1.elity.DepartmentElity
import com.example.go1.elity.DetailElity
import com.example.go1.elity.GiftElity
import com.example.go1.elity.GoodesElity
import com.example.go1.elity.NewsElity
import com.example.go1.elity.NewsElityTay
import com.example.go1.elity.NewsElityType
import com.example.go1.elity.ParkingElity
import com.example.go1.elity.PatrolesElity
import com.example.go1.elity.RepairElity
import com.example.go1.elity.SingEllity
import com.example.go1.elity.UserElity
import com.example.go1.elity.VideoElity
import com.example.go1.elity.VisitorElity
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

    @GET(Conts.BASE_SING)
    fun sing():Observable<SingEllity>

    @GET(Conts.BASE_PARKING)
    fun parking():Observable<ParkingElity>

    @GET(Conts.BASE_VISITOR)
    fun visitor():Observable<VisitorElity>

    @GET(Conts.BASE_PATROLES)
    fun patroles():Observable<PatrolesElity>

    @GET(Conts.BASE_REPAIR)
    fun repair():Observable<RepairElity>

    @GET(Conts.BASE_DEPARTMENT)
    fun department():Observable<DepartmentElity>

    @GET(Conts.BASE_GOODES)
    fun goodes():Observable<GoodesElity>

    @GET(Conts.BASE_GOODES)
    fun ss():Observable<GoodesElity>

    @GET(Conts.BASE_FL)
    fun yj():Observable<CategoryElity>

    @GET(Conts.BASE_GOODES)
    fun rj():Observable<GoodesElity>

    @GET(Conts.BASE_GOODES)
    fun sj():Observable<GoodesElity>

    @GET(Conts.BASE_XQ)
    fun xq():Observable<DetailElity>

     @GET(Conts.BASE_XQ)
    fun gwc():Observable<DetailElity>

    @GET(Conts.BASE_BANNER)
    fun splbt():Observable<BannerElity>

    @GET(Conts.BASE_XW)
    fun xw():Observable<NewsElityTay>

    @GET(Conts.BASE_XWFL)
    fun fl():Observable<NewsElityType>

    @GET(Conts.BASE_PL)
    fun comment():Observable<CommentElity>

    @GET(Conts.BASE_LW)
    fun gift():Observable<GiftElity>
}