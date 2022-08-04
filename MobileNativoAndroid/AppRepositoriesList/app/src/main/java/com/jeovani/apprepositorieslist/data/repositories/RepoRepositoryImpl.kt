package com.jeovani.apprepositorieslist.data.repositories

import com.jeovani.apprepositorieslist.core.RemoteException
import com.jeovani.apprepositorieslist.data.service.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService): RepoRepositories {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException("Usuario não encontrado")
        }


    }

}