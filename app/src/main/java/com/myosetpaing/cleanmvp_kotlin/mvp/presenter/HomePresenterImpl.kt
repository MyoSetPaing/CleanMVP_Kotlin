package com.myosetpaing.cleanmvp_kotlin.mvp.presenter

import com.myosetpaing.cleanmvp_kotlin.data.model.UserModel
import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import com.myosetpaing.cleanmvp_kotlin.mvp.view.HomeView

class HomePresenterImpl(mView: HomeView) : BasePresenter<HomeView>(mView), HomePresenter {

    override fun loadData() {
        UserModel.instance?.loadData(this)
    }

    override fun displayData(userList: List<UsersVO>) {
        mView.displayDataList(userList)
    }

    override fun displayError(message: String) {
        mView.displayError(message)
    }

}