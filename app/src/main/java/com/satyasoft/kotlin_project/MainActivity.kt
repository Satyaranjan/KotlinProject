package com.satyasoft.kotlin_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    private lateinit var name :TextView
    private lateinit var password : TextView
    private lateinit var save : Button
    private lateinit var message:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        password = findViewById(R.id.password)
        message = name.text.toString()
        save = findViewById(R.id.saveButton)
        save.setOnClickListener { sendMessage() }

    }
    /** Called when the user taps the Send button  */
    private fun sendMessage() {

        val intent = Intent(this,SecondActivity::class.java) //not application context
        intent.putExtra("input",name.text.toString())
        startActivity(intent)
    }
}