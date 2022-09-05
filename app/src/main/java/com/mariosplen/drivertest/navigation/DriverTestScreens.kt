package com.mariosplen.drivertest.navigation

enum class DriverTestScreens {
	HomeScreen,
	QuizScreen;

	companion object {
		fun fromRoute(route: String?): DriverTestScreens = when (route?.substringBefore("/")) {
			HomeScreen.name -> HomeScreen
			QuizScreen.name -> QuizScreen
			null -> HomeScreen
			else -> throw IllegalArgumentException("Route $route is not recognized")
		}
	}

}