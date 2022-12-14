package com.example.avitotesttask.common

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.avitotesttask.data.network.NetworkUrl.IMAGE_URL
import java.text.SimpleDateFormat

fun convertLongToDateString(systemTime: Long): String {
	return SimpleDateFormat("MM-dd-yyyy HH:mm:ss")
		.format(systemTime).toString()
}

fun View.hideKeyboard() {
	val inputManager =
		context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
	inputManager.hideSoftInputFromWindow(windowToken, 0)
}

fun getPathImage(nameImg: String): String = "$IMAGE_URL$nameImg.png"

fun getToDayTime() = convertLongToDateString(System.currentTimeMillis()).substring(11, 16)

