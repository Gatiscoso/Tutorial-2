package com.example.dadinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = dado()

        textin.text = "toque para jogar seu dado de 6 lados"

        button.setOnClickListener()
        {

            textin.text = num.numdado.toString()

        }
    }
}