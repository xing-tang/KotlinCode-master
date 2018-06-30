package com.tx.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import com.tx.baselibrary.injection.ActivityScope
import com.tx.baselibrary.injection.module.ActivityModule
import com.tx.baselibrary.injection.module.LifecycleProviderModule
import dagger.Component

/*
 * Activity级别Component
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class)
        , modules = arrayOf(ActivityModule::class, LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}
