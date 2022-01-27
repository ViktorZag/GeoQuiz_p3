package com.viktor_zet.geoquiz_p3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
           val toast:Toast= Toast(applicationContext)
               toast.setText( R.string.correct_toast)
                toast.duration=Toast.LENGTH_SHORT
            toast.show()

        }
        falseButton.setOnClickListener { view: View ->
           val toast= Toast.makeText(applicationContext, R.string.false_toast, Toast.LENGTH_SHORT)
            toast.show()

        }

    }
}