package com.viktor_zet.geoquiz_p3

import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {

    var currentIndex = 0

    private val questionList = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )
    val currentQuestionAnswer: Boolean
        get() = questionList[currentIndex].answer

    val currentQuestionText: Int
        get() = questionList[currentIndex].textResId

    fun moveToNext(){
        currentIndex++
        if (currentIndex == questionList.size) currentIndex = 0
    }

}