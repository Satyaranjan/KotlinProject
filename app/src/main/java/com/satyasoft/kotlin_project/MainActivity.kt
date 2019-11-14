package com.satyasoft.kotlin_project

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() ,View.OnTouchListener {
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
        save.setOnClickListener { sendMessage()
            hideKeyboard(name)}
        name.setOnTouchListener(this)
      //  name.performClick()

    }
    /** Called when the user taps the Send button  */
    private fun sendMessage() {

        val intent = Intent(this,SecondActivity::class.java) //not application context
        intent.putExtra("input",name.text.toString())
        startActivity(intent)
    }
    override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
        when (view) {
            name -> {
                Log.d("next", "yeyy")
                when (motionEvent.action){
                    MotionEvent.ACTION_DOWN -> {
                       // name.isFocusableInTouchMode
                        //name.requestFocus()
                    }
                    MotionEvent.ACTION_UP -> {
                        name.performClick()
                        name.showKeyboard()
                    }
                }
            }

        }
        return true
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun View.showKeyboard() {
        this.requestFocus()
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    }

    fun View.hideKeyboard() {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }
}