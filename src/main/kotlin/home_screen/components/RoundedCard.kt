package home_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import theme.ScreenColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RoundedCard(
    modifier: Modifier = Modifier,
    elevation: Int = 2,
    radius: Int = 7,
    bgColor: Color=ScreenColor,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Card(
        elevation = elevation.dp,
        shape = RoundedCornerShape(radius.dp),
        backgroundColor = bgColor,
        onClick = { onClick() },
        modifier = modifier.fillMaxWidth().padding(5.dp).height(40.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.CenterStart
        ) {
            content()
        }
    }
}
