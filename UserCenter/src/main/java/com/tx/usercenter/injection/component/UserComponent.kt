package com.tx.usercenter.injection.component

import com.tx.baselibrary.injection.PerComponentScope
import com.tx.baselibrary.injection.component.ActivityComponent
import com.tx.usercenter.injection.module.UserModule
import com.tx.usercenter.ui.activity.RegisterActivity
import dagger.Component

/*
 * 用户模块Component
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}
