package com.tx.usercenter.injection.module

import com.tx.usercenter.service.UserService
import com.tx.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/*
 *  用户模块Module
 */
@Module
class UserModule {

    @Provides
    fun provideUserService(userServiceImpl: UserServiceImpl): UserService {
        return userServiceImpl
    }

}

