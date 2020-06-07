package com.example.passtool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<TextView>(R.id.editTextTextPassword)
        val buttonSubmit = findViewById<Button>(R.id.button)
        val len = findViewById<TextView>(R.id.length)
        val str = findViewById<TextView>(R.id.strength)
        lateinit var stre: String
        val final = findViewById<TextView>(R.id.textView8)


        buttonSubmit.setOnClickListener {
            len.text = "${input.text.length}"
            if (input.text.length > 12){
                stre = "Strong Password"
                final.text = "Result:-\n${input.text} is a good Password"
            } else {
                stre = "Weak Password"
                final.text = "Result:-\n${input.text} is not a good password.\nIncrease the length to make it Stronger."
            }

            str.text = "${stre}"
            input.text = ""

        }

    }
}