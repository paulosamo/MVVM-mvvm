package net.ezra.ui.evening


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME

@Composable
fun EveningScreen(navController: NavHostController) {
//
//    Box(modifier = Modifier
//        .fillMaxHeight()
//    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
        


    ) {

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_EVENING) { inclusive = true }
                    }
                },
            text = "this is the evening screen",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

//        Button(onClick = {
//            navController.navigate(ROUTE_HOME) {
//                popUpTo(ROUTE_EVENING) { inclusive = true }
//            }
//        }) {
//            Text(text = "this is the home screen")


//        }

    }























}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

