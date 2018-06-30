package com.tx.baselibrary.rx

import rx.Subscriber

open class BaseSubscriber<T> : Subscriber<T>() {

    override fun onStart() {
        super.onStart()
    }

    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {

    }

    override fun onCompleted() {

    }



}