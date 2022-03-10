package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton) as Button
        val text = findViewById<TextView>(R.id.textView) as TextView
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            text.text = timesClicked.toString()
            Toast.makeText(this, "Hey Im a toast!", Toast.LENGTH_LONG).show()
        }
    }
}