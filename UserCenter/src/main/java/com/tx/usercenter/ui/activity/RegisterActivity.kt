package com.tx.usercenter.ui.activity

import android.os.Bundle
import com.tx.baselibrary.ui.activity.BaseMvpActivity
import com.tx.usercenter.R
import com.tx.usercenter.injection.component.DaggerUserComponent
import com.tx.usercenter.injection.module.UserModule
import com.tx.usercenter.presenter.RegisterPresenter
import com.tx.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        registerBtn.setOnClickListener {
            mPresenter.registerMobile(registerPhoneNumberEt.text.toString()
                    , registerVerfiycodeCodeEt.text.toString()
                    , registerPasswordEt.text.toString())
        }
    }

    /*
        Dagger注册
     */
    override fun injectComponent() {
        DaggerUserComponent.builder()
                .activityComponent(mActivityComponent)
                .userModule(UserModule())
                .build().inject(this)
        mPresenter.mView = this
    }


    override fun onRegisterResult(result: String) {
        toast(result)
    }
}
