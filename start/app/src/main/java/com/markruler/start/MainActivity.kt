package com.markruler.start

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val mainTextView = findViewById<TextView>(R.id.textView)

        var timesClicked = 0

        btnClickMe.setOnClickListener {
            mainTextView.text = "you clicked me, ${++timesClicked} times!"
//            mainTextView.setTextColor(Color.rgb(0, 255, 0))
            mainTextView.setTextColor(Color.parseColor("#00FFFF"))

            Toast.makeText(this, "you clicked me, $timesClicked times!", Toast.LENGTH_LONG).show()
        }
    }
}
