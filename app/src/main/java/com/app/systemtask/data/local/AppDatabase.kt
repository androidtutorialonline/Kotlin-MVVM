package com.app.systemtask.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.systemtask.data.local.dao.UserDao
import com.app.systemtask.data.local.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}