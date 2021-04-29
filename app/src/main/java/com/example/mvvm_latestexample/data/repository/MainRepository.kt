package com.example.mvvm_latestexample.data.repository

import com.example.mvvm_latestexample.data.api.ApiHelper
import com.example.mvvm_latestexample.data.model.MyUser
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<MyUser>> {
        return apiHelper.getUsers()
    }

}