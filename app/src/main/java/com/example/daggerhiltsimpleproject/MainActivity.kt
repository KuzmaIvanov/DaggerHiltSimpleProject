package com.example.daggerhiltsimpleproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daggerhiltsimpleproject.ui.theme.DaggerHiltSimpleProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltSimpleProjectTheme {
                val viewModel = hiltViewModel<MyViewModel>()
                
            }
        }
    }
}