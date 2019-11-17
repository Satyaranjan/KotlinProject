package com.satyasoft.kotlin_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var name : TextView
    private lateinit var password : TextView
    private lateinit var save : Button
    private lateinit var message:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_activity)
        name = findViewById(R.id.name)
        password = findViewById(R.id.password)
        message = name.text.toString()
        save = findViewById(R.id.saveButton)
        save.setOnClickListener { sendMessage()}

    }
    /** Called when the user taps the Send button  */
    private fun sendMessage() {

        val intent = Intent(this, ForgotPasswordActivity::class.java)
        startActivity(intent)
    }

}


// future used

/* override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
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
    }*/