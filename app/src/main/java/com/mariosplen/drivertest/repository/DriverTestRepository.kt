package com.mariosplen.drivertest.repository

import com.mariosplen.drivertest.data.DriverTestDao
import com.mariosplen.drivertest.util.stringToCategory
import com.mariosplen.drivertest.util.stringToLanguage
import javax.inject.Inject

class DriverTestRepository @Inject constructor(
	private val driverTestDao: DriverTestDao
) {


	fun getTestDriveQuestions(
		language: String,
		category: String,
	) = driverTestDao.getTestDriveQuestions(stringToLanguage(language), stringToCategory(category))


	fun getAnswersFromId(
		id: Int
	) = driverTestDao.getAnswersFromId(id)


}