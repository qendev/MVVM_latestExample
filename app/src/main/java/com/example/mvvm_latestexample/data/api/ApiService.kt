package com.example.mvvm_latestexample.data.api

import com.example.mvvm_latestexample.data.model.MyUser
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<MyUser>>

}