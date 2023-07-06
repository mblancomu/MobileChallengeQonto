package com.manuelblanco.mobilechallenge.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.manuelblanco.mobilechallenge.core.data.util.NetworkMonitor
import com.manuelblanco.mobilechallenge.feature.detail.DetailScreen
import com.manuelblanco.mobilechallenge.ui.MainScreenApp
import com.manuelblanco.mobilechallenge.ui.SplashScreen

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */

@SuppressLint("VisibleForTests")
@Composable
fun SetUpNavGraph(navController: NavHostController, networkMonitor: NetworkMonitor) {

    NavHost(navController = navController, startDestination = Routes.Splash.route) {

        composable(route = Routes.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(Routes.Profiles.route) {
            MainScreenApp(
                navController = navController,
                networkMonitor = networkMonitor
            )
        }

        composable(
            route = "${Routes.Detail.route}/{profileId}",
            arguments = listOf(
                navArgument("profileId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val profileId = backStackEntry.arguments?.getString("profileId")
            DetailScreen(
                profileId = profileId ?: "",
                navController = navController
            )
        }
    }
}