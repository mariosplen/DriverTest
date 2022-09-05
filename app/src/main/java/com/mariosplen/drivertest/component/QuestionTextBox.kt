package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuestionTextBox(
	questionText: String
) {
	Surface(
		modifier = Modifier
			.fillMaxWidth()
			.padding(
				start = 8.dp,
				end = 8.dp,
				top = 6.dp,
			),
		elevation = 4.dp,
		color = Color.White,
		contentColor = Color.Black,
		shape = RoundedCornerShape(8.dp)

	) {
		Text(
			modifier = Modifier
				.padding(
					top = 15.dp,
					bottom = 15.dp,
					start = 15.dp,
					end = 15.dp,
				),
			text = questionText,
			fontSize = 20.sp,
		)
	}
}