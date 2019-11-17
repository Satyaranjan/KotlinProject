package com.satyasoft.kotlin_project

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var imageView : ImageView
    private lateinit var signIn : TextView
    private lateinit var signUp : TextView
    private lateinit var forgotPassword : TextView
    private lateinit var context : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        signIn = findViewById(R.id.signIn)
        signUp = findViewById(R.id.signUp)
        forgotPassword = findViewById(R.id.forgotPassword)

        imageView.setImageDrawable(resources.getDrawable(R.drawable.movies))

        signIn.setOnClickListener{val intent = Intent(this, SignInActivity::class.java)
                                                         startActivity(intent)}
        signUp.setOnClickListener{val intent = Intent(this, SignUpActivity::class.java)
                                                            startActivity(intent)}
        forgotPassword.setOnClickListener{val intent = Intent(this, ForgotPasswordActivity::class.java)
                                                                    startActivity(intent)}

    }

}