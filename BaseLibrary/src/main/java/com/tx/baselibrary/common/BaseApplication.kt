package com.tx.baselibrary.common

import android.app.Application
import android.content.Context
import com.tx.baselibrary.injection.component.AppComponent
import com.tx.baselibrary.injection.component.DaggerAppComponent
import com.tx.baselibrary.injection.module.AppModule

/*
    Application 基类
 */
open class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppInjection()

        context = this

    }

    /*
     * Application Component初始化
     */
    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    /*
     * 全局伴生对象
     */
    companion object {
        lateinit var context: Context
    }
}
