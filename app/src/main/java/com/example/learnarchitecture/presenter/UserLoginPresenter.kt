package com.example.learnarchitecture.presenter

import com.example.learnarchitecture.view.LoginActivity


class UserLoginPresenter {

    private val loginActivity = LoginActivity()
     fun userLogin(login: String, password: String) {
        if (login.isEmpty() || password.isEmpty()) {
            loginActivity.onErrorMessage("Please fill both fields")
        } else {
            loginActivity.onSuccessMessage("Welcome $login")
        }
    }
}