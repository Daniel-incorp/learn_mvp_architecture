package com.example.room_in_compose

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData

// Model

class MVVMStudentsDbDao { // Для работы с БД

}

class MVVMStudentsRestApi { // Для работы с сетью

}

class MVVMStudentsRepository { // Для логики работы с данными

    fun simpleDataLogic(): List<String> {
        // Получаем данные из БД
        return listOf()
    }

    fun hardDataLogic(): List<String> {
        // Получаем данные из БД
        // Логика обработки ошибки
        // Отправить данные на отображение в UI
        // Логика обработки ошибки
        // Получить данные с сервера
        // Логика обработки ошибки
        // Обновляют данные БД на данные сервера
        // Логика обработки ошибки
        // Отправить данные на отобржаение в UI
        // Логика обработки ошибки
        return listOf()
    }
}

// Presenter

class StudentsViewModel {

    private val students = listOf<String>()

    val resultState = MutableLiveData<List<String>>()

    // Бизнес-логика
    fun getNewStudents(): List<String> {
        // Отфильтровать и вернуть всех первокурсников
        return listOf()
    }

    // Логика отображения данных
    fun prepareDataForUI() {
        //
        resultState.value = listOf("Student1", "Student2")
    }

    fun logic() {
        // ...
    }

}

// С О С Т О Я Н И Е

// View (Activity, Fragment, [Android View]*)

class MVVMStudentsActivity: Activity() {

    private var viewModel: StudentsViewModel? = null

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        viewModel = StudentsViewModel()

        viewModel?.resultState?.observeForever { newState ->
            updateStudents(newState)
        }
    }

    private fun updateStudents(students: List<String>) {

    }
}




////////////////////////////////////
// Android View -> Android View
// Compose -> Compose
// Compose -> Android View
// Android View -> Compose
// Android View -> Compose -> Android View -> Compose
