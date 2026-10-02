package com.example.compteurandroid

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)
        val buttonIncrementer = findViewById<Button>(R.id.buttonIncrementer)
        val buttonDecrementer = findViewById<Button>(R.id.buttonDecrementer)
        val buttonReinitialiser = findViewById<Button>(R.id.buttonReinitialiser)

        buttonIncrementer.setOnClickListener {
            compteur++
            textViewCompteur.text = compteur.toString()
            changerCouleur(textViewCompteur)
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            textViewCompteur.text = compteur.toString()
            changerCouleur(textViewCompteur)
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            textViewCompteur.text = compteur.toString()
            changerCouleur(textViewCompteur)
            Toast.makeText(this, R.string.message_reinitialisation, Toast.LENGTH_SHORT).show()
        }
    }

    private fun changerCouleur(textView: TextView) {
        if (compteur > 0) {
            textView.setTextColor(Color.GREEN)
        } else if (compteur < 0) {
            textView.setTextColor(Color.RED)
        } else {
            textView.setTextColor(Color.BLACK)
        }
    }
}