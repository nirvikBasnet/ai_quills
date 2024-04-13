package com.nirviklabs.aiquills.feature.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.auth
import com.nirviklabs.aiquills.R
import com.nirviklabs.aiquills.ui.theme.CardBackgroundColor
import com.nirviklabs.aiquills.ui.theme.Green
import com.nirviklabs.aiquills.ui.theme.Orange
import com.nirviklabs.aiquills.ui.theme.PrimaryTextColor
import com.nirviklabs.aiquills.ui.theme.Rubik
import com.nirviklabs.aiquills.ui.theme.SecondaryTextColor

@Composable
fun ProfileScreen(
    onItemClicked : (String) -> Unit = {}
){

    val user = FirebaseAuth.getInstance().currentUser


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Profile", "Subscription & Token coming soon...")

        Box(modifier = Modifier
            .padding(20.dp)
            .clip(CircleShape)
            .border(4.dp, Color.LightGray, CircleShape)) {

            ProfileImage(user?.photoUrl.toString(),"profile image")

        }

        Box(){
            if (user != null) {
                ProfileContent(user)
            }
        }


        Button(onClick = {
            Firebase.auth.signOut()
            onItemClicked("signin")
        }){
            Text(text = "Sign Out")
        }

    }





}

@Composable
fun ProfileImage(url: String?, contentDescription: String) {
    val painter: Painter = if (url.isNullOrEmpty()) {
        // Load default profile icon
        painterResource(id = R.drawable.photo)
    } else {
        // Load image from URL
        rememberImagePainter(
            data = url,
//            builder = {
//                transformations(CircleCropTransformation())
//                // You can add more options here if needed
//            }
        )
    }
    ProfileAvatar(
        painter = painter,
        size = 128
    )
}
@Composable
fun ProfileContent(user : FirebaseUser) {
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
       // ProfileImage(image = ImageVector.vectorResource(id = R.drawable.photo))
        InformationCard(title = "Display Name", information = user.displayName.toString())
        InformationCard(title = "Email", information = user.email.toString())

        InformationCard(title = "Tokens", information = "Unlimited")
        InformationCard(title = "Account Type", information = "Free")

    }
}

@Composable
fun Header(
    title: String,
    subtitle: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp
        )
        Text(
            text = subtitle,
            color = SecondaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )
    }
}

@Composable
fun ProfileAvatar(
    painter: Painter,
    size: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painter,
        contentDescription = "Profile Picture",
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .size(size.dp),
    )
}

@Composable
fun InformationCard(
    title: String,
    information: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(CardBackgroundColor),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            Text(
                text = title,
                color = SecondaryTextColor,
                fontFamily = Rubik,
                fontWeight = FontWeight.Normal,
                fontSize = 9.sp
            )
            BasicTextField(
                value = information,
                onValueChange = {  }
            )
        }
    }
}

@Composable
fun DefaultButton(
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = { onClick },
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Green),
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Text(
            text = buttonText,
            color = Color.White,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
    }
}

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit
) {
    Text(
        text = text,
        color = Orange,
        fontFamily = Rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        modifier = Modifier.clickable { onClick }
    )
}

