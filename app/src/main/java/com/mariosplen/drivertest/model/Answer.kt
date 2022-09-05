package com.mariosplen.drivertest.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answers")
data class Answer(
	@PrimaryKey(autoGenerate = true)
	val id: Int,
	val q_id: Int,
	val corr: Boolean,
	val ans: String,
)