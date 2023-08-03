package com.example.learnarchitecture.view

interface LoginView {
    fun onSuccessMessage(successMessage: String)
    fun onErrorMessage(errorMessage: String)
}