package com.myosetpaing.cleanmvp_kotlin.mvp.presenter

import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO

interface HomePresenter {

    fun loadData()

    fun displayData(userList: List<UsersVO>)

    fun displayError(message: String)

}