package com.example.nexusdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zerocomm.LOGI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LOGI("Nexus私服的库测试")
    }
}
