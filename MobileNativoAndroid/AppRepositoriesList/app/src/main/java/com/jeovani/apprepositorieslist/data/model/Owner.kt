package com.jeovani.apprepositorieslist.data.model

import com.google.gson.annotations.SerializedName

data class Owner(
    val login: String,
    @SerializedName(value = "avatar_url")
    val avatarUrl: String
)
