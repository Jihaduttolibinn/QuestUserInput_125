package com.example.praktikum4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable

fun FormDataDiri(Modifier: Modifier
){
    //variable-variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }


}