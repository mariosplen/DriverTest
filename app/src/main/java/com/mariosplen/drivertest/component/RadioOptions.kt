package com.mariosplen.drivertest.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mariosplen.drivertest.model.Answer

@Composable
fun RadioOptions(
	answers: List<Answer>,
	selected: Int,
	answerClicked: (Int) -> Unit,
) {


	answers.forEachIndexed { index, answerText ->

		Card(
			modifier = Modifier
				.padding(
					start = 8.dp,
					end = 8.dp,
					top = 3.dp,
				)
				.fillMaxWidth()
				.shadow(2.dp, RoundedCornerShape(12.dp), clip = false)
				.clip(RoundedCornerShape(12.dp))
				.clickable {
					answerClicked(index)
				},
			contentColor = Color.Black,
			backgroundColor = Color.White,
		) {
			Row(
				verticalAlignment = Alignment.CenterVertically,
			) {
				RadioButton(
					colors = RadioButtonDefaults.colors(
						unselectedColor = Color.DarkGray,
						selectedColor = Color(0xFF073B49)
					),
					selected = selected == index,
					onClick = {

						answerClicked(index)

					}
				)
				Text(
					text = answerText.ans,
					color = Color.Black
				)
			}
		}

	}
}