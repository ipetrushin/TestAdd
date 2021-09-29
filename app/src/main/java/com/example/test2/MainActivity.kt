package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAddClick(view: View) {
        val tvA: EditText = findViewById(R.id.numA)
        val tvB: EditText = findViewById(R.id.numB)
        val tvSum: TextView = findViewById(R.id.sum)
        val a = Integer.parseInt(tvA.text.toString())
        val b = Integer.parseInt(tvB.text.toString())
        val c = a + b
        tvSum.text = c.toString()


    }
}