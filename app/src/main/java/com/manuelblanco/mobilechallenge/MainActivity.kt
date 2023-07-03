package com.manuelblanco.mobilechallenge

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.manuelblanco.mobilechallenge.core.data.util.NetworkMonitor
import com.manuelblanco.mobilechallenge.core.designsystem.component.ChallengeBackground
import com.manuelblanco.mobilechallenge.core.designsystem.theme.ChallengeTheme
import com.manuelblanco.mobilechallenge.ui.navigation.SetUpNavGraph
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var networkMonitor: NetworkMonitor

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val darkTheme = isSystemInDarkTheme()

            ChallengeTheme(
                darkTheme = darkTheme,
            ) {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    ChallengeBackground {
                        SetUpNavGraph(navController, networkMonitor)
                    }
                }

            }
        }
    }
}
