package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.mariosplen.drivertest.R
import com.mariosplen.drivertest.navigation.DriverTestScreens

@Composable
fun QuizTests(navController: NavController) {
	Column(
		modifier = Modifier

	) {
		TestDriveCategoryCard("Αυτοκίνητα", R.drawable.car) {
			navController.navigate(route = DriverTestScreens.QuizScreen.name + "?category=CAR")
		}
		TestDriveCategoryCard("Μοτοσυκλέτες", R.drawable.motorcycle) {
			navController.navigate(route = DriverTestScreens.QuizScreen.name + "?category=BIKE")
		}
		TestDriveCategoryCard("Φορτηγά", R.drawable.truck) {
			navController.navigate(route = DriverTestScreens.QuizScreen.name + "?category=TRUCK")
		}
		TestDriveCategoryCard("Λεωφορεία", R.drawable.bus) {
			navController.navigate(route = DriverTestScreens.QuizScreen.name + "?category=BUS")
		}
	}
}