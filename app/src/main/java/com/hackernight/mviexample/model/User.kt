package com.hackernight.mviexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @Expose
    @SerializedName("email")
    val email:String?=null,

    @Expose
    @SerializedName("username")
    val userName:String?=null,

    @Expose
    @SerializedName("image")
    val image:String?=null
){
    override fun toString(): String {
        return "User(email=$email, userName=$userName, image=$image)"
    }
}
