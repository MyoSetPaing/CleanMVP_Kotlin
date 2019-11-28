package com.myosetpaing.cleanmvp_kotlin.network

import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    fun fetchDataFromNetwork(): Observable<List<UsersVO>>

}