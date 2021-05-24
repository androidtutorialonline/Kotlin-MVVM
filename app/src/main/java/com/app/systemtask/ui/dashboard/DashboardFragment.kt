package com.app.systemtask.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.systemtask.adapter.GithubReposAdapter
import com.app.systemtask.data.network.Resource
import com.app.systemtask.databinding.FragmentDashboardBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DashboardFragment : Fragment() {

    private lateinit var saveValue: String
    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    @Inject
    lateinit var mAdapter: GithubReposAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        saveValue = if (savedInstanceState == null) {
            ""
        } else {
            savedInstanceState.getString("saveInstance")!!
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        //save the values of fragment if destroy on second to back
        if (saveValue.isNotEmpty()) savedInstanceState.putString("saveInstance", saveValue)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        setAdapter()

        if (dashboardViewModel.mData.isNullOrEmpty()) {
            loadGithubRepos()
        } else {
            mAdapter.addItems(dashboardViewModel.mData)
        }

        return root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        imageView.setImageBitmap(viewModel.getImage())
    }*/


    private fun setAdapter() {
        _binding!!.githubReposId.apply {

            setHasFixedSize(true)
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun loadGithubRepos() {
        dashboardViewModel.getGitHubRepos()

        dashboardViewModel.gitHubRepos.observe(requireActivity(), {
            when (it) {
                is Resource.Success -> {
                    mAdapter.addItems(it.value)
                    dashboardViewModel.mData = it.value as MutableList
                }
                is Resource.Loading -> {

                }
                is Resource.Failure -> {
                    Toast.makeText(requireContext(), "", Toast.LENGTH_LONG).show()
                }

            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}