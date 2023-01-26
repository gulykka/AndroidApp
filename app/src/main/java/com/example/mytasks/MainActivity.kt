package com.example.mytasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_page)
        Log.e("AAA", "start")

    }

    override fun onStart() {
        super.onStart()
        Log.e("AAA","create")
    }

    override fun onPause() {
        super.onPause()
        Log.e("AAA", "dead")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("AAA", "dead444")
    }
}
