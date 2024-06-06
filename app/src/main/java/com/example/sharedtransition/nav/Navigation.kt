package com.example.sharedtransition.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.sharedtransition.DetailScreen
import com.example.sharedtransition.ListScreen

@Composable
fun Navigationcontrol() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListScreen") {

        composable(route = "ListScreen") {
            ListScreen(onItemClick = { reqId, text, desp ->
                navController.navigate("Detail/$reqId/$text/$desp")
            })
        }
        composable(route = "Detail/{reqId}/{text}/{desp}",
            arguments = listOf(
                navArgument("reqId") { type = NavType.IntType },
                navArgument("text") { type = NavType.StringType },
                navArgument("desp") { type = NavType.StringType }
            )) {

            val reqId = it.arguments?.getInt("reqId") ?: 0
            val text = it.arguments?.getString("text")?: ""
            val desp = it.arguments?.getString("desp")?: ""

                DetailScreen(resId = reqId, text = text, desp =  desp)

        }
    }
}