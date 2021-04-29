package com.example.mvvm_latestexample.data.model

import com.google.gson.annotations.SerializedName

//create the data class with regard to the API JSON response
data class MyUser(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("email")
    val email: String = "",
    @SerializedName("avatar")
    val avatar: String = ""
)