package com.example.mvvm_latestexample.data.api

import com.example.mvvm_latestexample.data.model.MyUser
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

//class implementing the interface ApiService
class ApiServiceImpl : ApiService {

    override fun getUsers(): Single<List<MyUser>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(MyUser::class.java)
    }

}