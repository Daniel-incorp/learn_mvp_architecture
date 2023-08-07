package com.example.learnarchitecture.presenter

import com.example.learnarchitecture.view.LoginView

class UserLoginPresenter(private var mainActivity: LoginView) {
     fun userLogin(login: String, password: String) {
        if (login.isEmpty() || password.isEmpty()) {
            mainActivity.onErrorMessage("Please fill both fields")
        } else {
            mainActivity.onSuccessMessage("Welcome $login")
        }
    }
}