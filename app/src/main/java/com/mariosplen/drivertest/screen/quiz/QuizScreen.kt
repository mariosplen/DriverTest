package com.mariosplen.drivertest.screen.quiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mariosplen.drivertest.component.*


@Composable
fun QuizScreen(
	language: String,
	category: String,
	navController: NavController,
	viewModel: QuizViewModel = hiltViewModel(),
) {
	val questions by viewModel.questions
	val answers by viewModel.answers
	var questionIndex by viewModel.questionIndex
	var countC by viewModel.countC
	var countW by viewModel.countW
	var selected by viewModel.selected

	LaunchedEffect(Unit) {
		if (viewModel.questions.value.isEmpty()) {
			viewModel.getTestDriveQuestions(language, category)
		}
	}


	if (questions.isEmpty()) {
		CircularProgressIndicator()
	} else {
		val question = questions[questionIndex]
		LaunchedEffect(questionIndex) {
			if (answers.isEmpty()) {
				viewModel.getAnswersFromId(question.id)
			} else {
				if (answers[0].q_id != question.id) {
					viewModel.getAnswersFromId(question.id)
				}
			}
		}
		Scaffold(
			modifier = Modifier
				.fillMaxSize(),
			topBar = {
				TopBar("Title")
			},
			backgroundColor = Color(0xFFF5F5F5)
		) {
			Column(
				modifier = Modifier
					.fillMaxSize()
					.verticalScroll(rememberScrollState()),
				verticalArrangement = Arrangement.SpaceBetween

			) {
				Column(
					horizontalAlignment = Alignment.CenterHorizontally,
				) {
					InfoRow(questionIndex, countC, countW, questions.size)
					QuestionTextBox(question.quest)
					QuestionImage(question.image)

					RadioOptions(answers, selected) {
						selected = it

					}
				}
				NextButton {
					questionIndex++
					if (answers[selected].corr) {
						countC++
					} else {
						countW++
					}
					selected = -1
				}

			}
		}

	}
}
