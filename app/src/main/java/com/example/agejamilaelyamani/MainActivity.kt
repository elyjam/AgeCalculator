package com.example.agejamilaelyamani

import MyFonctions.calculateAge
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.os.Build
import androidx.annotation.RequiresApi




class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val anneeInput = findViewById<EditText>(R.id.annee)
        val moisInput = findViewById<EditText>(R.id.mois)
        val jourInput = findViewById<EditText>(R.id.Jour)
        val calculerButton = findViewById<Button>(R.id.button)
        val ageTextView = findViewById<TextView>(R.id.age)
        calculerButton.setOnClickListener {

            val annee = anneeInput.text.toString().trim()
            val mois = moisInput.text.toString().trim()
            val jour = jourInput.text.toString().trim()


            if (annee.isNotEmpty() && mois.isNotEmpty() && jour.isNotEmpty()) {
                try {

                    val birthDateString = annee + "-" + mois + "-" + jour


                    val age = calculateAge(birthDateString)

                    ageTextView.text = age
                } catch (e: Exception) {

                    ageTextView.text = "Erreur dans le calcul de l'âge : ${e.message}"
                }
            } else {
               
                ageTextView.text = "Veuillez remplir tous les champs."
            }
        }


    }
}



