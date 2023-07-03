package com.manuelblanco.mobilechallenge.ui.navigation

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */


sealed class Routes(val route: String) {
    object Splash : Routes("splash_screen")
    object Profiles : Routes("profiles")
    object Detail : Routes("detail")
}