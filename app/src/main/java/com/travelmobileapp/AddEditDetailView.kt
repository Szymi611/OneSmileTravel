package com.travelmobileapp


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.travelmobileapp.data.Travel
import kotlinx.coroutines.launch

@Composable
fun AddEditDetailView(
    id: Long,
    viewModel: TravelViewModel,
    navController: NavController
){

    val snackMessage = remember{
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    if (id != 0L){
        val travel = viewModel.getATravelById(id).collectAsState(initial = Travel(0L, "", ""))
        viewModel.travelTitleState = travel.value.title
        viewModel.travelDescriptionState = travel.value.description
    }else{
        viewModel.travelTitleState = ""
        viewModel.travelDescriptionState = ""
    }

    Scaffold(
        topBar = {AppBarView(title =
        if(id != 0L) stringResource(id = R.string.update_travel)
        else stringResource(id = R.string.add_travel)
        ) {navController.navigateUp()}
        },
        scaffoldState = scaffoldState
    ) {
        Column(modifier = Modifier
            .padding(it)
            .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.height(10.dp))

            WishTextField(label = "Title",
                value = viewModel.travelTitleState,
                onValueChanged = {
                    viewModel.onTravelTitleChanged(it)
                } )

            Spacer(modifier = Modifier.height(10.dp))

            WishTextField(label = "Description",
                value = viewModel.travelDescriptionState,
                onValueChanged = {
                    viewModel.onTravelDescriptionChanged(it)
                } )

            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick={
                if(viewModel.travelTitleState.isNotEmpty() &&
                    viewModel.travelDescriptionState.isNotEmpty()){
                    if(id != 0L){
                        viewModel.updateTravel(
                            Travel(
                                id = id,
                                title = viewModel.travelTitleState.trim(),
                                description = viewModel.travelDescriptionState.trim()
                            )
                        )
                    }else{
                        //  AddWish
                        viewModel.addTravel(
                            Travel(
                                title = viewModel.travelTitleState.trim(),
                                description = viewModel.travelDescriptionState.trim())
                        )
                    }
                }
                scope.launch {
                    navController.navigateUp()
                }

            }, colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.app_bar_color))){
                Text(
                    text = if (id != 0L) stringResource(id = R.string.update_travel)
                    else stringResource(
                        id = R.string.add_travel
                    ),
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.White
                    )
                )
            }
        }
    }

}


@Composable
fun WishTextField(
    label: String,
    value: String,
    onValueChanged: (String) -> Unit
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(text = label, color = Color.Black) },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            // using predefined Color
            textColor = Color.Black,
            // using our own colors in Res.Values.Color
            focusedBorderColor = colorResource(id = R.color.black),
            unfocusedBorderColor = colorResource(id = R.color.black),
            cursorColor = colorResource(id = R.color.black),
            focusedLabelColor = colorResource(id = R.color.black),
            unfocusedLabelColor = colorResource(id = R.color.black),
        )


    )
}

