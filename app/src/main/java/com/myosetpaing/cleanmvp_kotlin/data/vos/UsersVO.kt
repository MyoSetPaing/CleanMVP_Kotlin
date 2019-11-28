package com.myosetpaing.cleanmvp_kotlin.data.vos

import com.google.gson.annotations.SerializedName

data class UsersVO(

    @SerializedName("body")
    val body: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("userId")
    val userId: Int?
)



