package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageTextView = findViewById<TextView>(R.id.messageTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        findViewById<Button>(R.id.clickButton).setOnClickListener{
            if(nameEditText.text.isEmpty())
                messageTextView.text = "Please enter your name"
            else {
                messageTextView.text = "Hi, ${nameEditText.text}! Welcome! :)"
                nameEditText.setText("")
            }
        }

    }

}