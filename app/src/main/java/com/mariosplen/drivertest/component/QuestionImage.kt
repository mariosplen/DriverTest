package com.mariosplen.drivertest.component

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun QuestionImage(
	img: String?
) {
	if (img != null) {
		val bitmap =
			BitmapFactory.decodeStream(LocalContext.current.assets.open("images/$img.jpg"))
		Image(
			contentScale = ContentScale.Fit,
			modifier = Modifier
				.padding(top = 3.dp, start = 8.dp, end = 8.dp)
				.heightIn(min = 20.dp, max = 230.dp)
				.widthIn(min = 20.dp, max = 230.dp)
				.fillMaxWidth()
				.fillMaxHeight(),
			bitmap = bitmap.asImageBitmap(),
			contentDescription = null
		)
	} else {
		Spacer(modifier = Modifier.size(3.dp))
	}
}