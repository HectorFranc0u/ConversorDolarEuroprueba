package com.example.conversor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class config : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        val btneur = findViewById<Button>(R.id.btneuro)
        val edtxteur = findViewById<EditText>(R.id.edtxteuro)

        btneur.setOnClickListener{
            var Euro = (edtxteur.text.toString())
            val intent:Intent = Intent(this, MainActivity::class.java)
            intent.putExtra("valeur", Euro)
            startActivity(intent)
        }

    }
}