package com.mariosplen.drivertest.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariosplen.drivertest.component.CustomScrollableTabRow

@Preview
@Composable
fun HomeScreen(
//	navController: NavController
) {
	Scaffold(
		modifier = Modifier
			.fillMaxSize(),
	) {

		Column(
			modifier = Modifier
				.verticalScroll(rememberScrollState())
		) {
			Text(
				modifier = Modifier
					.padding(start = 20.dp, top = 40.dp),
				text = "Προσομοίωση Επίσημου Τέστ ΚΟΚ",
//				fontFamily = roboto_bold, todo
				fontSize = 33.sp,
				color = Color(0xFF120216)
			)

			var selectedTabIndex by remember { mutableStateOf(0) }
			val tabs = listOf("Test Drive", "Εξάσκηση")
			CustomScrollableTabRow(
				tabs = tabs,
				selectedTabIndex = selectedTabIndex,
			) { tabIndex ->
				selectedTabIndex = tabIndex
			}
			if (selectedTabIndex == 1) {
//				QuizTests(navController)

			} else {
				Text("Second Selected")
			}
		}

	}
}

