package com.campingcar.itineraire

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.campingcar.itineraire.ui.screens.HomeScreen
import com.campingcar.itineraire.ui.theme.NeutralLightBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = NeutralLightBackground) {
                    HomeScreen(
                        recentSearches = emptyList(),
                        onStartNewTrip = {},
                        onSelectRecentSearch = {}
                    )
                }
            }
        }
    }
}
