package com.app.systemtask.data.network

import com.app.systemtask.data.model.GithubReposItem
import retrofit2.http.GET

interface GithubApi {


    @GET("repositories")
    suspend fun getGithubRepos(): List<GithubReposItem>

}