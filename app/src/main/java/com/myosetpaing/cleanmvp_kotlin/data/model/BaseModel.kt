package com.myosetpaing.cleanmvp_kotlin.data.model

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.myosetpaing.cleanmvp_kotlin.AppConstant
import com.myosetpaing.cleanmvp_kotlin.network.ApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BaseModel internal constructor() {
     lateinit var mApiService: ApiService
     fun initItemListAPI() {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(AppConstant.base_url)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
        mApiService = retrofit.create(ApiService::class.java)
    }

    init {
        initItemListAPI()
    }
}
