package com.kong.to_docompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val LowPriorityColor = Color(0xFF00c080)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFFF4646)
val NonePriorityColor = Color(0xFFFFFFFF)

val LightGray = Color(0xFFCFCFCF)
val MediumGray = Color(0xFF818181)
val DarkGray = Color(0xFF494949)

//다크테마 라이트테마별 색상 변경
val Colors.topAppBarContentColor:Color
@Composable
get() = if(isLight) Color.White else Color.LightGray

val Colors.topAppBarBackgroundColor:Color
    @Composable
    get() = if(isLight) Purple80 else Color.Black

val Colors.fabBackgroundColor:Color
    @Composable
    get() = if(isLight) Pink40 else Purple40
