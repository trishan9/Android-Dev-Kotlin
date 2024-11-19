package com.example.kotlin_fundamentals

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class SignupFormActivity : AppCompatActivity() {
//    lateinit var firstName : TextInputEditText
//    lateinit var lastName : TextInputEditText
//    lateinit var emailAddress : TextInputEditText
//    lateinit var password : TextInputEditText
    lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_form)

//        firstName = findViewById(R.id.firstName)
//        lastName = findViewById(R.id.lastName)
//        emailAddress = findViewById(R.id.email)
//        password = findViewById(R.id.password)
        signupButton = findViewById(R.id.signupButton)

//        if (firstName.text != null || firstName.text.toString() != "") {
//            print("Hello")
//        }

        signupButton.setOnClickListener {
            Toast.makeText(this, "Signed up successfully!", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}