package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoRow(
	questionIndex: Int,
	countC: Int,
	countW: Int,
	totalQ: Int,
) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(
				start = 8.dp,
				top = 6.dp,
				end = 8.dp,
			),
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Surface(

			elevation = 2.dp,
			color = Color.White,
			contentColor = Color.DarkGray,
			shape = RoundedCornerShape(6.dp)

		) {
			Text(
				modifier = Modifier
					.padding(
						top = 3.dp,
						bottom = 3.dp,
						start = 8.dp,
						end = 8.dp,
					),
				text = "${questionIndex + 1}/$totalQ",
				fontSize = 18.sp
			)
		}
		Row {
			Surface(
				elevation = 2.dp,
				color = Color(0xFF9CCC65),
				contentColor = Color.White,
				shape = RoundedCornerShape(
					topStart = 8.dp,
					topEnd = 0.dp,
					bottomStart = 8.dp,
					bottomEnd = 0.dp,
				)
			) {
				Row(
					modifier = Modifier
						.padding(
							top = 3.dp,
							bottom = 3.dp,
							start = 8.dp,
							end = 8.dp,
						),
				) {
					Icon(Icons.Default.Check, contentDescription = "Correct")
					Text(
						text = "${countC}",
						fontSize = 18.sp
					)
				}
			}
			Spacer(modifier = Modifier.size(2.dp))
			Surface(
				modifier = Modifier,
				elevation = 2.dp,
				color = Color(0xFFEF5350),
				contentColor = Color.White,
				shape = RoundedCornerShape(
					topStart = 0.dp,
					topEnd = 8.dp,
					bottomStart = 0.dp,
					bottomEnd = 8.dp,
				)
			) {
				Row(
					modifier = Modifier
						.padding(
							top = 3.dp,
							bottom = 3.dp,
							start = 8.dp,
							end = 8.dp,
						),
				) {
					Icon(Icons.Default.Close, contentDescription = "Wrong")
					Text(
						text = "$countW",
						fontSize = 18.sp,
					)
				}
			}
		}
	}
}