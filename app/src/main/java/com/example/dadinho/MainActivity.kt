package com.example.dadinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = dadinho()

        texto.text = "toque para jogar seu dado de 6 lados"

        button.setOnClickListener()
        {

            texto.text = num.numdado

        }
    }
}