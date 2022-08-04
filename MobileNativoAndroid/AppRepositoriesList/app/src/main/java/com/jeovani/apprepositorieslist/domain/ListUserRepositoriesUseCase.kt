package com.jeovani.apprepositorieslist.domain

import com.jeovani.apprepositorieslist.core.UseCase
import com.jeovani.apprepositorieslist.data.model.Repo
import com.jeovani.apprepositorieslist.data.repositories.RepoRepositories
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repositories: RepoRepositories
) : UseCase<String, List<Repo>>(){
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repositories.listRepositories(param)
    }


}