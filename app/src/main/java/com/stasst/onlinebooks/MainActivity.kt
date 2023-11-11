package com.stasst.onlinebooks

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.stasst.onlinebooks.ui.BooksApp
import com.stasst.onlinebooks.ui.theme.OnlineBooksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineBooksTheme {
                BooksApp(onBookClicked = {
                    ContextCompat.startActivity(
                        this,
                        Intent(Intent.ACTION_VIEW, Uri.parse(it.previewLink)),
                        null
                    )
                })
            }
        }
    }
}