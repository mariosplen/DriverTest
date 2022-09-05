package com.mariosplen.drivertest.screen.quiz

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariosplen.drivertest.model.Answer
import com.mariosplen.drivertest.model.Question
import com.mariosplen.drivertest.repository.DriverTestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
	private val driverTestRepository: DriverTestRepository,
) : ViewModel() {

	val questions = mutableStateOf(emptyList<Question>())
	val answers = mutableStateOf(emptyList<Answer>())

	val countC = mutableStateOf(0)
	val countW = mutableStateOf(0)
	var selected = mutableStateOf(-1)
	val questionIndex = mutableStateOf(0)


	fun getTestDriveQuestions(language: String, category: String) =
		driverTestRepository.getTestDriveQuestions(language, category).onEach {
			questions.value = it
		}.launchIn(viewModelScope)

	fun getAnswersFromId(id: Int) =
		driverTestRepository.getAnswersFromId(id).onEach {
			answers.value = it
		}.launchIn(viewModelScope)
}