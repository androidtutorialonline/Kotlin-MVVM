package com.app.systemtask.adapter

import android.app.Activity
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.app.systemtask.MainActivity
import com.app.systemtask.R
import com.app.systemtask.data.model.GithubReposItem
import com.app.systemtask.databinding.ItemGithubReposBinding
import javax.inject.Inject

class GithubReposAdapter @Inject constructor(private val mActivity: Activity) :
    BaseRecyclerViewAdapter<GithubReposItem, ItemGithubReposBinding>() {

    override fun getLayout() = R.layout.item_github_repos

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ItemGithubReposBinding>, position: Int
    ) {
        holder.binding.mGithubReposItem = items[position]
        holder.binding.root.tag = position

        holder.binding.root.setOnClickListener {

            val mPos = holder.binding.root.tag as Int
            val bundle = bundleOf("getObj" to items[mPos])

            (mActivity as MainActivity).refreshCurrentFragment()

            mActivity.findNavController(R.id.nav_host_fragment_activity_main)
                .navigate(R.id.navigation_details, bundle)

            (mActivity as MainActivity).refreshCurrentFragment()
        }

    }

}

