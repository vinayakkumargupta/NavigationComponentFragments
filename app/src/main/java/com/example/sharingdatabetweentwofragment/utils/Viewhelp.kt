package com.example.sharingdatabetweentwofragment.utils

import android.content.Context
import android.widget.Toast

class viewhelp {
    fun Context.toast(message: String){
        Toast.makeText(this,message,Toast.LENGTH_LONG)
    }
}