package com.jeovani.apprepositorieslist.data.model

import com.google.gson.annotations.SerializedName

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName(value = "stargazers_count")
    val stargazersCount: Long,
    val language: String,
    @SerializedName(value = "html_url")
    val htmlUrl: String,
    val description: String
)
