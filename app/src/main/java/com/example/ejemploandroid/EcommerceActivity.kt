package com.example.ejemploandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EcommerceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce)

        val btnVolver = findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            // Regresar a la pantalla anterior
            finish()
        }
    }
}