package com.example.learnarchitecture.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.learnarchitecture.R
import com.example.learnarchitecture.model.MainModel

class MainActivity : AppCompatActivity(), LoginView {

    private lateinit var  welcomeMessage: TextView
    private lateinit var userLogin: EditText
    private lateinit var userPassword: EditText
    private lateinit var btnSingIn: Button
    private lateinit var btnSingUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {

        welcomeMessage = findViewById(R.id.textWelcome) //NullPointerException!!!
        userLogin = findViewById(R.id.loginView)
        userPassword = findViewById(R.id.passwordView)
        btnSingIn = findViewById(R.id.btnSignIn)
        btnSingUp = findViewById(R.id.btnSignUp) //не реализовано!

        btnSingIn.setOnClickListener {
            val presenter = MainModel(this) //???
            val intent = Intent(this, LoginActivity::class.java)
            presenter.userLogin(userLogin.text.toString(), userPassword.text.toString())
            startActivity(intent)
        }
    }

    override fun onSuccessMessage(successMessage: String) {
        welcomeMessage.text = successMessage
    }

    override fun onErrorMessage(errorMessage: String) {
        welcomeMessage.text = errorMessage
    }

}

