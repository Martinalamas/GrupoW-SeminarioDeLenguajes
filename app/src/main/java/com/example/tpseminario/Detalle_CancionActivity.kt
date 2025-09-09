package com.example.tpseminario

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detalle_CancionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_cancion)

        val titulo = intent.getStringExtra("titulo")
        val artista = intent.getStringExtra("artista")
        val duracion = intent.getStringExtra("duracion")

        findViewById<TextView>(R.id.DNombreCancion).text = titulo
        findViewById<TextView>(R.id.DArtista).text = artista
        findViewById<TextView>(R.id.dc_duracion).text = duracion


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}