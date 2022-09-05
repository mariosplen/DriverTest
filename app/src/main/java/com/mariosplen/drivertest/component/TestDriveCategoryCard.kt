package com.mariosplen.drivertest.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestDriveCategoryCard(
	title: String,
	drawableId: Int,
	onClick: () -> Unit,
) {
	Card(
		modifier = Modifier
			.height(170.dp)
			.padding(
				top = 20.dp,
				start = 20.dp,
				end = 20.dp,
			)
			.clickable {
				onClick()
			},
		elevation = 3.dp,
		shape = RoundedCornerShape(25.dp),
		backgroundColor = Color(0xFFF5F5F5),
	) {
		Row(
			modifier = Modifier
				.fillMaxSize(),
			horizontalArrangement = Arrangement.SpaceBetween
		) {
			Column(
				modifier = Modifier
					.fillMaxHeight()
					.padding(
						start = 20.dp,
						top = 20.dp,
						bottom = 20.dp
					),
				verticalArrangement = Arrangement.SpaceBetween
			) {
				Row {
					Text(
						text = title,
//						fontFamily = roboto_bold, todo
						fontSize = 22.sp,
						color = Color(0xFF120216)
					)
				}
				Row {
					Icon(
						imageVector = Icons.Default.ArrowForward,
						contentDescription = "null",
						tint = Color(0xFF073B49),
						modifier = Modifier.size(40.dp)
					)
				}

			}

			Image(
				painterResource(drawableId),
				contentDescription = "car",
				Modifier
					.fillMaxHeight()
					.padding(top = 20.dp, bottom = 20.dp),
			)
		}
	}
}