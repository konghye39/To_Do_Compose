package com.kong.to_docompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.kong.to_docompose.navigation.destinations.listComposable
import com.kong.to_docompose.navigation.destinations.taskComposable
import com.kong.to_docompose.util.Constants.LIST_SCREEN

@Composable
//강의 19강 다시보기
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    //2개의 compose screen
    NavHost(navController = navController, startDestination = LIST_SCREEN) {

        listComposable(
            navigateToTaskScreen = screen.task
        )

        taskComposable(
            navigateToListScreen = screen.list
        )

    }
}