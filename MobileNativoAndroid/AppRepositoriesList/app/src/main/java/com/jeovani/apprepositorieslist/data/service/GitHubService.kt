package com.jeovani.apprepositorieslist.data.service

import com.jeovani.apprepositorieslist.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET(value = "users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}