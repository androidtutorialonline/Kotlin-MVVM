package com.app.systemtask.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.systemtask.data.model.GithubReposItem
import com.app.systemtask.data.network.Resource
import com.app.systemtask.data.repository.GithubRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val repository: GithubRepository
) : ViewModel() {

    val _gitHubRepos: MutableLiveData<Resource<List<GithubReposItem>>> = MutableLiveData()
    val gitHubRepos: LiveData<Resource<List<GithubReposItem>>>
        get() = _gitHubRepos
    var mData = mutableListOf<GithubReposItem>()

    fun getGitHubRepos() = viewModelScope.launch {
        _gitHubRepos.value = Resource.Loading
        _gitHubRepos.value = repository.getGitHubRepos()
    }


}