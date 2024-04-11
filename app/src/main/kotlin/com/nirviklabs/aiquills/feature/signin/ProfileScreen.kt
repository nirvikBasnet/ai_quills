package com.nirviklabs.aiquills.feature.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

@Composable
fun ProfileScreen(
    onItemClicked : (String) -> Unit = {}
){

    val user = FirebaseAuth.getInstance().currentUser

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
           text = user?.displayName.toString()
        )
        Button(onClick = {
            Firebase.auth.signOut()
            onItemClicked("signin")
        }) {
            Text("Sign out")
        }
    }



}