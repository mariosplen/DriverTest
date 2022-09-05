package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NextButton(
	onNextClicked: () -> Unit,
) {
	Button(
		modifier = Modifier
			.fillMaxWidth()
			.padding(
				start = 8.dp,
				end = 8.dp,
				top = 2.dp,
			),
		colors = ButtonDefaults.buttonColors(
			backgroundColor = Color(0xFF073B49),
			contentColor = Color.White,
		),
		onClick = {
			onNextClicked()
		}
	) {
		Text(
			text = "NEXT",
			fontSize = 18.sp
		)
	}
}