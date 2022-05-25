package com.example.projetmaterielmobile.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projetmaterielmobile.dao.StationVelibDao
import com.example.projetmaterielmobile.model.StationVelib


@Database(entities = [StationVelib::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stationvelibDao(): StationVelibDao
}