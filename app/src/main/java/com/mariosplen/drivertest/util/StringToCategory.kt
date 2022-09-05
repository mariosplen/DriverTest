package com.mariosplen.drivertest.util


fun stringToCategory(category: String): Int =
	when (category) {
		"CAR" -> 1
		"BIKE" -> 2
		"TRUCK" -> 3
		"BUS" -> 4
		else -> -1
	}


