package com.myosetpaing.cleanmvp_kotlin.data.model

import com.myosetpaing.cleanmvp_kotlin.data.vos.NetworkResponse
import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import com.myosetpaing.cleanmvp_kotlin.mvp.presenter.HomePresenter
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class UserModel private constructor() : BaseModel() {


    fun loadData(
        homePresenter: HomePresenter
    ) {

        mApiService.fetchDataFromNetwork()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<UsersVO>> {
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(t: List<UsersVO>) {
                    homePresenter.displayData(t)
                }

                override fun onError(e: Throwable) {
                    homePresenter.displayError(e.localizedMessage)
                }

            })
    }

    companion object {
        private var INSTANCE: UserModel? = null
        val instance: UserModel?
            get() {
                if (INSTANCE == null) {
                    INSTANCE = UserModel()
                }
                return INSTANCE
            }
    }
}
