package com.myosetpaing.cleanmvp_kotlin.activities

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.myosetpaing.cleanmvp_kotlin.R
import com.myosetpaing.cleanmvp_kotlin.adapters.NewsRecyclerViewAdapter
import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import com.myosetpaing.cleanmvp_kotlin.mvp.presenter.HomePresenter
import com.myosetpaing.cleanmvp_kotlin.mvp.presenter.HomePresenterImpl
import com.myosetpaing.cleanmvp_kotlin.mvp.view.HomeView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), HomeView {

    lateinit var mAdapter: NewsRecyclerViewAdapter
    lateinit var mPresenter: HomePresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = NewsRecyclerViewAdapter(this)

        rvNewsList.adapter = mAdapter
        rvNewsList.layoutManager = LinearLayoutManager(this)

        mPresenter = HomePresenterImpl(this)
        mPresenter.loadData()

    }

    override fun displayDataList(data: List<UsersVO>) {
        mAdapter.setNewData(data as MutableList<UsersVO>)
    }

    override fun displayError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
