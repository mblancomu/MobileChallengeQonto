package com.manuelblanco.mobilechallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.manuelblanco.mobilechallenge.core.data.util.NetworkMonitor
import com.manuelblanco.mobilechallenge.ui.MainScreenApp
import com.manuelblanco.mobilechallenge.ui.SplashScreen

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */

@Composable
fun SetUpNavGraph(navController: NavHostController, networkMonitor: NetworkMonitor) {

    NavHost(navController = navController, startDestination = Routes.Splash.route) {

        composable(route = Routes.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(Routes.Profiles.route) {
            MainScreenApp(
                networkMonitor = networkMonitor
            )
        }
    }
}