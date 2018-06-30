package com.tx.usercenter.presenter

import android.util.Log
import com.tx.baselibrary.ext.execute
import com.tx.baselibrary.presenter.BasePresenter
import com.tx.baselibrary.rx.BaseSubscriber
import com.tx.usercenter.presenter.view.RegisterView
import com.tx.usercenter.service.UserService
import javax.inject.Inject
import kotlin.math.log

open class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    fun registerMobile(mobile: String, verifyCode: String, pwd: String) {
        userService.register(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onStart() {
                        super.onStart()
                        Log.e("tag", "onStart")
                        mView.showLoading()
                    }

                    override fun onError(e: Throwable?) {
                        super.onCompleted()
                        Log.e("tag", "onError")
                        mView.hideLoading()
                    }

                    override fun onNext(t: Boolean) {
                        Log.e("tag", "onNext")
                        if (t)
                            mView.onRegisterResult("注册成功")
                    }

                    override fun onCompleted() {
                        Log.e("tag", "onCompleted")
                        super.onCompleted()
                        mView.hideLoading()
                    }

                }, lifecycleProvider)
    }


}