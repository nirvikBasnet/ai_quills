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

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Database
import com.google.android.gms.ads.MobileAds
import com.google.firebase.auth.FirebaseAuth
import com.nirviklabs.aiquills.feature.chat.ChatRoute
import com.nirviklabs.aiquills.feature.multimodal.PhotoReasoningRoute
import com.nirviklabs.aiquills.feature.signin.ProfileScreen
import com.nirviklabs.aiquills.feature.signin.SignInScreen
import com.nirviklabs.aiquills.feature.text.SummarizeRoute
import com.nirviklabs.aiquills.token.AppDatabase
import com.nirviklabs.aiquills.token.TokenRepository
import com.nirviklabs.aiquills.token.TokenViewModel
import com.nirviklabs.aiquills.ui.theme.GenerativeAISample
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val viewModel: TokenViewModel by viewModels()

        @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        MobileAds.initialize(this) {}

        setContent {




            GenerativeAISample {
                // A surface container using the 'background' color from the theme

                    Surface(
                        modifier = Modifier.fillMaxSize()
                            .fillMaxWidth(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        val navController = rememberNavController()


                        NavHost(navController = navController, startDestination = "signin") {
                            composable("menu") {
                                MenuScreen(onItemClicked = { routeId ->
                                    navController.navigate(routeId)
                                })
                            }
                            composable("summarize") {
                                SummarizeRoute()
                            }
                            composable("photo_reasoning") {
                                PhotoReasoningRoute()
                            }
                            composable("chat") {
                                ChatRoute()
                            }
                            composable("signin"){
                                if(FirebaseAuth.getInstance().currentUser == null){
                                    SignInScreen(onItemClicked = { routeId ->
                                        navController.navigate(routeId)
                                    })
                                }else{
                                    MenuScreen(onItemClicked = { routeId ->
                                        navController.navigate(routeId)
                                    })
                                }

                            }
                            composable("profile"){
                                ProfileScreen(activity = this@MainActivity,onItemClicked = { routeId ->
                                    navController.navigate(routeId)
                                },viewModel)
                            }
                        }
                    }


            }
        }
    }
}


