package com.app.systemtask.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.systemtask.R
import com.app.systemtask.adapter.UserAdapter
import com.app.systemtask.data.local.entity.User
import com.app.systemtask.databinding.ActivityRecyclerViewBinding

class RoomDBActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRecyclerViewBinding
    private lateinit var viewModel: RoomDBViewModel
    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        mBinding = ActivityRecyclerViewBinding.inflate(layoutInflater)

        setupUI()
        setupViewModel()
        setupObserver()
    }

    private fun setupUI()  {
        mBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter =
            UserAdapter(
                arrayListOf()
            )
        mBinding.recyclerView.addItemDecoration(
            DividerItemDecoration(
                mBinding.recyclerView.context,
                (mBinding.recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        mBinding.recyclerView.adapter = adapter
    }

    private fun setupObserver() {
        viewModel.getUsers().observe(this, {
            /*when (it.status) {
                Status.SUCCESS -> {
                    mBinding.progressBar.visibility = View.GONE
                    it.data?.let { users -> renderList(users) }
                    mBinding.recyclerView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    mBinding.progressBar.visibility = View.VISIBLE
                    mBinding.recyclerView.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    mBinding.progressBar.visibility = View.GONE
                    Toast.makeText(this, "Okay", Toast.LENGTH_LONG).show()
                }
            }*/
        })
    }

    private fun renderList(users: List<User>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }

    private fun setupViewModel() {
       /* viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(
                ApiHelperImpl(RetrofitBuilder.apiService),
                DatabaseHelperImpl(DatabaseBuilder.getInstance(applicationContext))
            )
        ).get(RoomDBViewModel::class.java)*/
    }
}
