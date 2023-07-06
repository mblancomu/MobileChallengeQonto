package com.manuelblanco.mobilechallenge.feature.profiles.navigation

import android.net.Uri
import androidx.navigation.NavHostController

/**
 * Created by Manuel Blanco Murillo on 6/7/23.
 */

fun NavHostController.navigateToProfile(profileId: String) {
    val encodedId = Uri.encode(profileId)
    this.navigate("detail/$encodedId") {
        launchSingleTop = true
    }
}