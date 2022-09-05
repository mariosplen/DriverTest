package com.mariosplen.drivertest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mariosplen.drivertest.screen.quiz.QuizScreen


@Composable
fun DriverTestNavigation() {
	val navController = rememberNavController()
	val navHost = NavHost(
		navController = navController,
		startDestination = DriverTestScreens.HomeScreen.name
	) {
		composable(route = DriverTestScreens.HomeScreen.name) {
//			HomeScreen(navController = navController)
		}

		composable(
			route = DriverTestScreens.QuizScreen.name + "?category={category}",
			arguments = listOf(navArgument(name = "category") { type = NavType.StringType })
		) { backStackEntry ->


			QuizScreen(
				navController = navController,
				language = "GR",
				category = backStackEntry.arguments?.getString("category") ?: "MATH"
			)
		}
	}
}