/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nirviklabs.aiquills

import android.graphics.drawable.Drawable
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class MenuItem(
    val routeId: String,
    val titleResId: Int,
    val descriptionResId: Int,
    val color: Color,
    val icon: Int
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    onItemClicked: (String) -> Unit = { }
) {
    val menuItems = listOf(
        MenuItem("summarize", R.string.menu_summarize_title, R.string.menu_summarize_description,Color.Blue,R.drawable.programming),
        MenuItem("photo_reasoning", R.string.menu_reason_title, R.string.menu_reason_description,Color.Red,R.drawable.gallery),
        MenuItem("chat", R.string.menu_chat_title, R.string.menu_chat_description,Color.DarkGray,R.drawable.chat)
    )
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("AI Quills") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onSecondary
                ),
                actions = {
                    IconButton(onClick = {
                        onItemClicked("profile")
                    }) {
                        Icon(
                            Icons.Filled.Person,
                            contentDescription = "Settings"
                        )
                    }
                }
            )
        }
    ) {
        LazyRow(
            Modifier
                .padding(it)
                .fillMaxWidth()
        ) {
            items(menuItems) { menuItem ->
                Menu(menuItem, onItemClicked)
            }
        }
    }
}

@Composable
fun Menu(
    menuItem: MenuItem,
    onItemClicked: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(130.dp)
            .height(125.dp)
            .padding(8.dp)
            .clickable {
                onItemClicked(menuItem.routeId)
            }
    ) {

        Column(
            modifier = Modifier
                .background(Brush.horizontalGradient(listOf(menuItem.color, Color.Blue)))
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter =  painterResource(menuItem.icon),
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                        .height(30.dp)
                        .width(30.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(menuItem.titleResId),
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    maxLines = 1,
                    fontSize = 15.sp
                )

            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    MenuScreen()
}
