package com.metehanbolat.nestedlazyverticalgridcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.nestedlazyverticalgridcompose.ui.theme.NestedLazyVerticalGridComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedLazyVerticalGridComposeTheme {

            }
        }
    }
}
