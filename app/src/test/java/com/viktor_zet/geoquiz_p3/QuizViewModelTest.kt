package com.viktor_zet.geoquiz_p3

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class QuizViewModelTest {

    private lateinit var savedStateHandle: SavedStateHandle
    private lateinit var quizViewModel: QuizViewModel

    @Before
    fun setUp(){
        savedStateHandle = SavedStateHandle()
        quizViewModel = QuizViewModel(savedStateHandle)
    }

    @Test
    fun providesExpectedQuestionText() {
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
    }

    @Test
    fun wrapsAroundQuestionBank() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 5))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_asia, quizViewModel.currentQuestionText)
        quizViewModel.moveToNext()
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
    }

    @Test
    fun providesExpectedQuestionAnswer() {
        assertTrue(quizViewModel.currentQuestionAnswer)
    }

}