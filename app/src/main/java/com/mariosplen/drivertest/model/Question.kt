package com.mariosplen.drivertest.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
	@PrimaryKey
	val id: Int,
	val cat: Int,
	val page: Int,
	val lang: Int,
	val quest: String,
	val title: String,
	val num: String,
	val image: String?,
)