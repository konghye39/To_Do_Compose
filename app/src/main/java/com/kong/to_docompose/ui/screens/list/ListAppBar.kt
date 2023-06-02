package com.kong.to_docompose.ui.screens.list

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kong.to_docompose.ui.theme.topAppBarBackgroundColor
import com.kong.to_docompose.ui.theme.topAppBarContentColor
import com.kong.to_docompose.R
import com.kong.to_docompose.data.models.Priority

@Composable
fun ListAppBar() {
    DefaultListAppBar(
       onSearchClicked = {}
    )
}


@Composable
fun DefaultListAppBar(onSearchClicked:()->Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            ListAppBarActions(onSearchClicked = onSearchClicked)
        }
    )
}

@Composable
fun ListAppBarActions(onSearchClicked:()->Unit){
    SearchAction(onSearchClicked = onSearchClicked)
}

@Composable
fun SearchAction(onSearchClicked:()->Unit){
    IconButton(onClick = onSearchClicked) {
        Icon(imageVector = Icons.Filled.Search,
            contentDescription = "Search Tasks",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Composable
fun SortAction(onSortClicked:(Priority) -> Unit){

}

@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = {}
    )
}

@Composable
fun SearchListAppBar() {

}