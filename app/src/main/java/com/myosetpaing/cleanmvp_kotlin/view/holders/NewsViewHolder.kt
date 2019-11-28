package com.myosetpaing.cleanmvp_kotlin.view.holders

import android.view.View
import com.myosetpaing.cleanmvp_kotlin.data.vos.UsersVO
import kotlinx.android.synthetic.main.news_item_view.view.*

class NewsViewHolder(itemView: View) : BaseViewHolder<UsersVO>(itemView) {


    lateinit var user: UsersVO

    override fun setData(data: UsersVO) {
        user = data
        itemView.tvTitle.text = user.title
        itemView.tvBody.text = user.body
    }

}