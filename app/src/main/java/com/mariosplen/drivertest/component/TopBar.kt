package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TopBar(
	title: String
) {
	TopAppBar(
		modifier = Modifier
			.fillMaxWidth(),
		backgroundColor = Color(0xFF073B49),
		elevation = 0.dp,
		contentColor = Color.White,
		title = {
			Text(title)
		},
		navigationIcon = {
			IconButton(
				onClick = { },
			) {
				Icon(
					Icons.Default.Menu,
					contentDescription = "Menu",
				)
			}
		},
		actions = {
			IconButton(
				onClick = { },
			) {
				Icon(
					Icons.Default.Home,
					contentDescription = "Home",
				)
			}
		},


		)
}


