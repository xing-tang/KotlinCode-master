package com.tx.usercenter.data.repository

import com.tx.baselibrary.data.net.RetrofitFactory
import com.tx.baselibrary.data.protocol.BaseResp
import com.tx.usercenter.data.api.UserApi
import com.tx.usercenter.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

/*
 * 用户相关数据层
 */
class UserRepository @Inject constructor(){

    /*
     * 用户注册
     */
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile, pwd, verifyCode))
    }
}