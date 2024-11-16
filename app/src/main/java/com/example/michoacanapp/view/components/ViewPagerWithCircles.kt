package com.example.michoacanapp.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.michoacanapp.data_source.getDataPlaces
import com.example.michoacanapp.view.theme.borderLight
import com.example.michoacanapp.view.theme.grayLight
import com.example.michoacanapp.view.theme.primary
import kotlinx.coroutines.launch

@Composable
fun ViewPagerWithCircles(items: List<Int>, modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { items.size }
    )
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(0.98f)
        ) { page ->
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                RoundedImage(
                    items[page],
                    Modifier.border(6.dp, borderLight, RoundedCornerShape(16.dp))
                )
            }
        }

        Row(modifier = Modifier.weight(0.02f)) {
            repeat(items.size) { index ->
                val color = if (pagerState.currentPage == index) primary else grayLight
                Box(
                    modifier = Modifier
                        .size(16.dp)
                        .padding(2.dp)
                        .background(color, CircleShape)
                        .clickable {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewViewPagerWithCircles() {
    ViewPagerWithCircles(getDataPlaces()[0].photos)
}