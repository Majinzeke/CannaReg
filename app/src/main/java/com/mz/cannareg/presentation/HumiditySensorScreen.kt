package com.mz.cannareg.presentation

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mz.cannareg.R
import com.mz.cannareg.data.HumiditySensors
import com.mz.cannareg.ui.theme.CannaRegTheme
import com.mz.cannareg.ui.theme.DarkBlue
import com.mz.cannareg.ui.theme.LightGrey
import com.mz.cannareg.ui.theme.VeryLightGrey

@Composable
fun HumiditySensorScreen(
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 64.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        HeaderImage()
        MainInfo()
        InfoTable()
    }
}

@Composable
fun HeaderImage(){
    Image(
        painter = painterResource(R.drawable.acesai),
        contentDescription = null,
        modifier = Modifier.width(200.dp)
        )
}


@Composable
fun MainInfo() {
    Column(
        modifier = Modifier.padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "11", color = Color.Green, fontSize = 48.sp, fontWeight = FontWeight.Bold)
        Text(
            text = " vista",
            color = Color.DarkGray,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(text = "Its too humid. Fix it")
    }
}

@Composable
fun InfoItem(iconRes: Int, title: String, subtitle: String, modifier: Modifier){
    Row(modifier = modifier){
        Image(
            painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 8.dp)
                .width(40.dp)
            )
        Column {
            Text(title, color = Color.Gray)
            Text(subtitle, color = DarkBlue, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun InfoTable(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(
                VeryLightGrey
            )
    ) {
        Row(Modifier.padding(16.dp)) {
            InfoItem(
                iconRes = R.drawable.acesai,
                title = "Humidity" ,
                subtitle = "add in state" ,
                modifier = Modifier.weight(
                    1f
                )
            )
            InfoItem(
                iconRes = R.drawable.acesai,
                title = "Temperature" ,
                subtitle = "add in state" ,
                modifier = Modifier.weight(
                    1f
                )
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun DefaultPreview(){
    CannaRegTheme {
        HumiditySensorScreen()
    }
}