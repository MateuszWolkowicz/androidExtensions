package com.wolkowiczmateusz.androidextensions

import androidx.lifecycle.LiveData
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.Single
import androidx.lifecycle.LiveDataReactiveStreams

fun <T> Observable<T>.toLiveData(backPressureStrategy: BackpressureStrategy = BackpressureStrategy.BUFFER): LiveData<T> {
    return LiveDataReactiveStreams.fromPublisher(this.toFlowable(backPressureStrategy))
}

fun <T> Single<T>.toLiveData(): LiveData<T> {
    return LiveDataReactiveStreams.fromPublisher(this.toFlowable()) // toFlowable 230ms
}