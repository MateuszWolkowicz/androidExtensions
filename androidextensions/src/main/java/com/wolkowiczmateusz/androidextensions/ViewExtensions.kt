package com.wolkowiczmateusz.androidextensions

import android.view.View

fun View.makeVisible() {
    visibility = View.VISIBLE
}

fun View.makeInvisible() {
    visibility = View.INVISIBLE
}

fun View.makeGone() {
    visibility = View.GONE
}

fun View.makeEnabled() {
    isEnabled = true
}

fun View.makeDisabled() {
    isEnabled = false
}