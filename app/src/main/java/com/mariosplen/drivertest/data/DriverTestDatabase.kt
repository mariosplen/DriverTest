package com.mariosplen.drivertest.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mariosplen.drivertest.model.Answer
import com.mariosplen.drivertest.model.Question

@Database(entities = [Question::class, Answer::class], version = 1, exportSchema = false)
abstract class DriverTestDatabase : RoomDatabase() {
	abstract fun driverTestDao(): DriverTestDao
}