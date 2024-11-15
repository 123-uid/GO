package com.example.go1.ulits

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitUlits {


    companion object{


        fun retrofit1():Retrofit{
            val okHttpClient1 = OkHttpClient.Builder().build()

            val retrofit1 = Retrofit.Builder()
                .client(okHttpClient1)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Conts.BASE_URL)
                .build()

            return  retrofit1
        }


        fun retrofit2():Retrofit{
            val okHttpClient2 = OkHttpClient.Builder().build()

            val retrofit2 = Retrofit.Builder()
                .client(okHttpClient2)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Conts.BASE_URL2)
                .build()

            return  retrofit2
        }


        fun retrofit3():Retrofit{
            val okHttpClient3 = OkHttpClient.Builder().build()

            val retrofit3 = Retrofit.Builder()
                .client(okHttpClient3)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Conts.BASE_URL3)
                .build()

            return  retrofit3
        }


    }


}