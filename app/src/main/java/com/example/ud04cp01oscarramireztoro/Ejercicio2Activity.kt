package com.example.ud04cp01oscarramireztoro
// Paquete del proyecto

import android.os.Bundle
// Bundle para el ciclo de vida

import androidx.appcompat.app.AppCompatActivity
// Soporte de compatibilidad de la actividad

class Ejercicio2Activity : AppCompatActivity() {
// Define la Activity correspondiente a la pantalla del Ejercicio 2

    override fun onCreate(savedInstanceState: Bundle?) {
        // Inicializador del componente de interfaz

        super.onCreate(savedInstanceState)
        // Llamada a la superclase

        setContentView(R.layout.activity_ejercicio2)
        // Infla la vista diseñada para el formulario con zonas
    }
    // Fin de onCreate
}
// Fin de Ejercicio2Activity