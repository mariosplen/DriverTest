package com.mariosplen.drivertest.util


fun stringToLanguage(language: String): Int =
	when (language) {
		"GR" -> 1
		"EN" -> 2
		"AL" -> 3
		"RU" -> 4
		else -> -1
	}