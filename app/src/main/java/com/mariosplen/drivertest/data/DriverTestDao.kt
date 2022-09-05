package com.mariosplen.drivertest.data

import androidx.room.Dao
import androidx.room.Query
import com.mariosplen.drivertest.model.Answer
import com.mariosplen.drivertest.model.Question
import kotlinx.coroutines.flow.Flow

@Dao
interface DriverTestDao {


	@Query("SELECT * FROM answers WHERE q_id = :id ORDER BY RANDOM()")
	fun getAnswersFromId(
		id: Int
	): Flow<List<Answer>>

	@Query("SELECT * FROM ( SELECT * FROM questions WHERE lang = :lang AND cat = :cat ORDER BY RANDOM() ) GROUP BY page")
	fun getTestDriveQuestions(
		lang: Int,
		cat: Int,
	): Flow<List<Question>>


}