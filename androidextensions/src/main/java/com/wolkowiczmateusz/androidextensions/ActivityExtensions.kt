package com.wolkowiczmateusz.androidextensions

import android.app.Activity
import android.content.Intent

private fun Activity.startActivity(cls: Class<*>, finishCallingActivity: Boolean = true) {
    val intent = Intent(this, cls)
    startActivity(intent)
    if (finishCallingActivity){
        finish()
    }
}