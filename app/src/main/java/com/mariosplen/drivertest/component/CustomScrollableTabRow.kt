package com.mariosplen.drivertest.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mariosplen.drivertest.util.customTabIndicatorOffset

@Composable
fun CustomScrollableTabRow(
	tabs: List<String>,
	selectedTabIndex: Int,
	onTabClick: (Int) -> Unit
) {
	val density = LocalDensity.current
	val tabWidths = remember {
		val tabWidthStateList = mutableStateListOf<Dp>()
		repeat(tabs.size) {
			tabWidthStateList.add(0.dp)
		}
		tabWidthStateList
	}
	ScrollableTabRow(
		modifier = Modifier
			.padding(top = 20.dp),
		backgroundColor = Color.Transparent,
		divider = {},
		selectedTabIndex = selectedTabIndex,
		contentColor = Color.Black,
		edgePadding = 0.dp,
		indicator = { tabPositions ->
			TabRowDefaults.Indicator(
				modifier = Modifier
					.customTabIndicatorOffset(
						currentTabPosition = tabPositions[selectedTabIndex],
						tabWidth = tabWidths[selectedTabIndex]
					)
			)
		}
	) {
		tabs.forEachIndexed { tabIndex, tab ->
			Tab(
				selected = selectedTabIndex == tabIndex,
				onClick = { onTabClick(tabIndex) },
				text = {
					Text(
						text = tab,
						onTextLayout = { textLayoutResult ->
							tabWidths[tabIndex] =
								with(density) { textLayoutResult.size.width.toDp() }
						}
					)
				}
			)
		}
	}
}