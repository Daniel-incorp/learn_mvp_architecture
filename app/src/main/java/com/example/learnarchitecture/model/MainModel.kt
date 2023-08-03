package com.example.learnarchitecture.model

import com.example.learnarchitecture.presenter.UserLoginPresenter
import com.example.learnarchitecture.view.LoginView

class MainModel(private var loginResult: LoginView): UserLoginPresenter {
    override fun userLogin(login: String, password: String) {
        if (login.isEmpty() || password.isEmpty()) {
            loginResult.onErrorMessage("Please fill both fields")
        } else {
            loginResult.onSuccessMessage("Welcome $login")
        }
    }
}