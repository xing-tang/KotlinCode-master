package com.tx.baselibrary.presenter.view

interface BaseView {

    fun showLoading()

    fun hideLoading()

    fun onError(text: String)

}