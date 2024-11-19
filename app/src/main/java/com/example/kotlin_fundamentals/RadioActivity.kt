package com.example.kotlin_fundamentals

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var jsBtn : RadioButton
    lateinit var pythonBtn: RadioButton
    lateinit var  kotlinBtn: RadioButton
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)

        jsBtn = findViewById(R.id.jsRadio)
        pythonBtn = findViewById(R.id.pythonRadio)
        kotlinBtn = findViewById(R.id.kotlinRadio)
        image = findViewById(R.id.imageView)

        jsBtn.setOnClickListener {
            image.setImageResource(R.drawable.js)
        }

        pythonBtn.setOnClickListener {
            image.setImageResource(R.drawable.python)
        }

        kotlinBtn.setOnClickListener {
            image.setImageResource(R.drawable.kotlin)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}