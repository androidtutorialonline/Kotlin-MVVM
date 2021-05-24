package com.app.systemtask.data.repository

import com.app.systemtask.data.network.GithubApi
import com.app.systemtask.data.network.SafeApiCall
import javax.inject.Inject

class GithubRepository @Inject constructor (
    private val api: GithubApi
) : SafeApiCall {

    suspend fun getGitHubRepos() = safeApiCall {
        api.getGithubRepos()
    }



}