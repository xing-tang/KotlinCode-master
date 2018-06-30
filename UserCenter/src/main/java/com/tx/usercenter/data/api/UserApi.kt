package com.tx.usercenter.data.api

import com.tx.baselibrary.data.protocol.BaseResp
import com.tx.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface UserApi {

    @POST("UserCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>
}