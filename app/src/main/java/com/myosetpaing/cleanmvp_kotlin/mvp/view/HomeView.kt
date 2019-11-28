package com.myosetpaing.cleanmvp_kotlin.mvp.view

import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO

interface HomeView: BaseView{
    fun displayDataList(data: List<UsersVO>)
}