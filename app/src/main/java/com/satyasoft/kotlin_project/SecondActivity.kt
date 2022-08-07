package com.satyasoft.kotlin_project

import android.content.Intent
import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_class)
        textView = findViewById(R.id.textView)
        val data:String = intent.getStringExtra("input")
        textView.text = data
    }
}