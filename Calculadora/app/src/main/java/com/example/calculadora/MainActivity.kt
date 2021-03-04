package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btcalcular = buttonCalcular
        val resultado = textViewResultado

        btcalcular.setOnClickListener {
            val nota1 = Integer.parseInt(editTextNota1.toString())
            val nota2 = Integer.parseInt(editTextNota2.toString())
            val media = (nota1 + nota2) / 2
            val numeroDefaltas = Integer.parseInt(editTextFaltas.toString())

            if (media >= 6 && numeroDefaltas <= 10){
                textViewResultado.setText("O aluno foi aprovado")
            } else {
                textViewResultado.setText("O aluno foi reprovado")
        }


        }


        }


    }
