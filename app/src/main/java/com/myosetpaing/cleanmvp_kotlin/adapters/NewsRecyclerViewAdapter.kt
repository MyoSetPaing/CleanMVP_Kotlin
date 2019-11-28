package com.myosetpaing.cleanmvp_kotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myosetpaing.cleanmvp_kotlin.R
import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import com.myosetpaing.cleanmvp_kotlin.view.holders.NewsViewHolder

class NewsRecyclerViewAdapter(private val context: Context) : BaseRecyclerAdapter<NewsViewHolder, UsersVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.news_item_view, parent, false)
        return NewsViewHolder(view)
    }



}