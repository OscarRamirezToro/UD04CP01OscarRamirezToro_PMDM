package com.example.ud04cp01oscarramireztoro
// Paquete base de tu aplicación

import android.content.Intent
// Importa Intent para permitir la navegación entre diferentes Activities

import android.os.Bundle
// Importa Bundle para el ciclo de vida de la Activity

import android.widget.Button
// Importa la vista Button para enlazar los botones del XML

import androidx.appcompat.app.AppCompatActivity
// Importa la clase base de actividades con compatibilidad moderna

class MainActivity : AppCompatActivity() {
// Clase principal que arranca al abrir la app

    override fun onCreate(savedInstanceState: Bundle?) {
        // Método que se ejecuta al instanciarse la pantalla

        super.onCreate(savedInstanceState)
        // Ejecución de la lógica interna de inicialización

        setContentView(R.layout.activity_main)
        // Carga la interfaz gráfica del menú principal

        val btnEjercicio1 = findViewById<Button>(R.id.btnAbrirEjercicio1)
        // Obtiene la referencia al botón del Ejercicio 1

        val btnEjercicio2 = findViewById<Button>(R.id.btnAbrirEjercicio2)
        // Obtiene la referencia al botón del Ejercicio 2

        btnEjercicio1.setOnClickListener {
            // Escuchador del evento de clic para el primer botón

            val intent = Intent(this, Ejercicio1Activity::class.java)
            // Prepara el salto hacia la Activity del Ejercicio 1

            startActivity(intent)
            // Lanza la pantalla del Ejercicio 1
        }
        // Fin del listener de Ejercicio 1

        btnEjercicio2.setOnClickListener {
            // Escuchador del evento de clic para el segundo botón

            val intent = Intent(this, Ejercicio2Activity::class.java)
            // Prepara el salto hacia la Activity del Ejercicio 2

            startActivity(intent)
            // Lanza la pantalla del Ejercicio 2
        }
        // Fin del listener de Ejercicio 2
    }
    // Fin de onCreate
}
// Fin de MainActivity