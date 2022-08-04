package com.jeovani.apprepositorieslist.data.repositories

import com.jeovani.apprepositorieslist.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepositories {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}