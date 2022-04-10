package com.example.conversor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val Euro: String? = getIntent().getStringExtra("valeur")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        val txtdol = findViewById<TextView>(R.id.txtdolar)
        val txteur = findViewById<TextView>(R.id.txteur)
        val edtx = findViewById<EditText>(R.id.edtxtdolar)

        button.setOnClickListener{
            if(Euro.isNullOrEmpty()){
                var dolar = edtx.text.toString()
                var res = 0.92 * dolar.toDouble()
                txtdol.text = "El valor en dolares ingresados es de: $" + dolar
                txteur.text = "El valor en euros resultante es de: €" + res.toString()
            }
            else{
                var dolar = edtx.text.toString()
                var res = Euro.toDouble() * dolar.toDouble()
                txtdol.text = "El valor en dolares ingresados es de: $" + dolar
                txteur.text = "El valor en euros resultante es de: €" + res.toString()
            }

        }
        
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Config -> {
                val config:Intent = Intent(this, config::class.java)
                startActivity(config)
                true
            }
            R.id.intg -> {
                val intg:Intent = Intent(this, Integrantes::class.java)
                startActivity(intg)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}