package com.myosetpaing.cleanmvp_kotlin.mvp.presenter

import com.myosetpaing.cleanmvp_kotlin.mvp.view.BaseView

abstract class BasePresenter<V : BaseView>(mView: V) {
    protected  var mView: V = mView
}