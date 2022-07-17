package com.satyasoft.kotlin_project


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SignUpActivity : AppCompatActivity(){
    private lateinit var textView: TextView
    private lateinit var name: EditText
    private lateinit var password: EditText
    private lateinit var email: EditText
    private lateinit var locality: EditText
    private lateinit var post: EditText
    private lateinit var ps: EditText
    private lateinit var dist: EditText
    private lateinit var state: EditText
    private lateinit var country: EditText
    private lateinit var pin: EditText
    private lateinit var phone: EditText
    private lateinit var save: Button

    private lateinit var mName :String
    private lateinit var mPassword :String
    private lateinit var mEmail :String
    private lateinit var mLocality :String
    private lateinit var mPost :String
    private lateinit var mPs :String
    private lateinit var mDist :String
    private lateinit var mState :String
    private lateinit var mCountry :String
    private lateinit var mPin :String
    private lateinit var mPhone :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)
       // window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE or WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        textView = findViewById(R.id.textView)
        name = findViewById(R.id.name)
        password = findViewById(R.id.password)
        locality = findViewById(R.id.locality)
        post = findViewById(R.id.post)
        ps = findViewById(R.id.ps)
        dist = findViewById(R.id.dist)
        state = findViewById(R.id.state)
        country = findViewById(R.id.country)
        pin = findViewById(R.id.pincode)
        phone = findViewById(R.id.phoneNo)
        save = findViewById(R.id.save)


        save.setOnClickListener {
            mName = name.text.toString()
            mPassword = password.text.toString()
            mEmail = email.text.toString()
            mLocality = locality.text.toString()
            mPost = post.text.toString()
            mPs = ps.text.toString()
            mDist = dist.text.toString()
            mState = state.text.toString()
            mCountry = country.text.toString()
            mPin = pin.text.toString()
            mPhone = phone.text.toString()
        }
    }
}