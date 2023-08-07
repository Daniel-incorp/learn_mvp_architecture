package com.example.learnarchitecture.view

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learnarchitecture.R

class LoginActivity: AppCompatActivity(), LoginView {

    private lateinit var welcomeMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_for_user)
        initSignIn()
    }

    private fun initSignIn() {
        welcomeMessage = findViewById(R.id.textWelcome)
    }

    override fun onSuccessMessage(successMessage: String) {
        welcomeMessage.text = successMessage
    }

    override fun onErrorMessage(errorMessage: String) {
        welcomeMessage.text = errorMessage
    }

}