package com.viktor_zet.geoquiz_p3

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var questionTextView: TextView

    private val questionList = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        nextButton=findViewById(R.id.next_button)
        questionTextView=findViewById(R.id.question_text_view)

        trueButton.setOnClickListener { view: View ->
            val toast: Toast = Toast(applicationContext)
            toast.setText(R.string.correct_toast)
            toast.duration = Toast.LENGTH_SHORT
            toast.show() }
        falseButton.setOnClickListener { view: View ->
            val toast = Toast.makeText(applicationContext, R.string.false_toast, Toast.LENGTH_SHORT)
            toast.show() }

        val questionTextResId=questionList[currentIndex].textResId
        questionTextView.setText(questionTextResId)

    }
}