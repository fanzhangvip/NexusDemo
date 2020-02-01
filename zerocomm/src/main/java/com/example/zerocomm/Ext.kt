package com.example.zerocomm

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * content: 消息
 */
fun Context.toast(content: String){
    Toast.makeText(this,content,Toast.LENGTH_LONG).show()
}

/**
 * msg: 消息
 */
fun Activity.LOGI(msg: String){
    Log.i("Zero",msg)
}