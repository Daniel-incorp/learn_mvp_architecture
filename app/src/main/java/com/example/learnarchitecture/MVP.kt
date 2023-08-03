package com.example.room_in_compose

import android.app.Activity
import android.os.Bundle

// Model

class StudentsDbDao { // Для работы с БД

}

class StudentsRestApi { // Для работы с сетью

}

class StudentsRepository { // Для логики работы с данными

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

class StudentsPresenter {

    private val students = listOf<String>()
    private var studentsActivity: StudentsActivity? = null

    // Бизнес-логика
    fun getNewStudents(): List<String> {
        // Отфильтровать и вернуть всех первокурсников
        return listOf()
    }

    fun onAttachView(activity: StudentsActivity) {
        studentsActivity = activity
    }

    fun onDetachView() {
        studentsActivity = null
    }

    // Логика отображения данных
    fun prepareDataForUI() {
        //
        studentsActivity?.updateStudents(listOf())
    }

    fun logic() {
        // ...
    }

}

// К О М А Н Д Ы

// View (Activity, Fragment, [Android View]*)

class StudentsActivity: Activity() {

    private var presenter: StudentsPresenter? = null

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        presenter = StudentsPresenter()
        presenter?.onAttachView(this)
        presenter?.logic()
    }

    fun updateStudents(students: List<String>) {

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter = null
    }
}


fun sum(a: Int, b: Int): Int {
    return a + b
}

////////////////////////////////////
// Android View -> Android View
// Compose -> Compose
// Compose -> Android View
// Android View -> Compose
// Android View -> Compose -> Android View -> Compose
