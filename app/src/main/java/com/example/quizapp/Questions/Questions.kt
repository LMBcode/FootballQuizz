package com.example.quizapp.Questions

data class Questions(
    val id : Int,
    val image : Int,
    val question : String,
    val optionA : String,
    val optionB : String,
    val optionC : String,
    val optionD : String,
    val correctAnswer : Int
)
