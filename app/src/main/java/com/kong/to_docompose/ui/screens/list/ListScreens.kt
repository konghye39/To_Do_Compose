package com.kong.to_docompose.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kong.to_docompose.R
import com.kong.to_docompose.ui.theme.fabBackgroundColor


@Composable
fun ListScreen(navigateToTaskScreen: (taskId:Int) -> Unit) {
    Scaffold(
        topBar = { ListAppBar() },
        content = {},
        floatingActionButton = {
            ListFab(onFabClick = navigateToTaskScreen)
        }
    )
}

@Composable
fun ListFab(onFabClick:(taskId:Int) -> Unit) {
    //선택된 task가 없어서 일단 -1로 세팅
    FloatingActionButton(
        onClick = { onFabClick(-1) },
        backgroundColor = MaterialTheme.colors.fabBackgroundColor
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_button),
            tint = Color.White
        )
    }

}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateToTaskScreen = {})
}