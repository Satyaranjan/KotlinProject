package com.satyasoft.kotlin_project

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity(){
    private lateinit var  forgotPassword: EditText
    private lateinit var  mForgotPassword: String
    private lateinit var forgotPasswordButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password_activity)

        forgotPassword = findViewById(R.id.forgotPassword)

        mForgotPassword = forgotPassword.text.toString()

        forgotPasswordButton = findViewById(R.id.forgotPasswordBtn)

        forgotPasswordButton.setOnClickListener {  }

    }
}