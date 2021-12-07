package com.example.calculadorafromjavatokt2

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.calculadorafromjavatokt2.R

class MainActivity : AppCompatActivity() {
    private var cifra_01: EditText? = null
    private var cifra_02: EditText? = null
    private var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cifra_01 = findViewById(R.id.cifra_01)
        cifra_02 = findViewById(R.id.cifra_02)
        resultado = findViewById(R.id.resultado)
    }

    fun sumar (view: View?) {
        if(cifra_01!!.text.toString() != "" && cifra_02!!.text.toString() != "") {
            val resultadoNumero = cifra_01!!.text.toString().toInt() + cifra_02!!.text.toString().toInt()
            resultado!!.text = resultadoNumero.toString()
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR Suma", "Algun campo esta vacio")
        }
    }

    fun restar (view: View?) {
        if(cifra_01!!.text.toString() != "" && cifra_02!!.text.toString() != "") {
            val resultadoNumero = cifra_01!!.text.toString().toInt() - cifra_02!!.text.toString().toInt()
            resultado!!.text = resultadoNumero.toString()
        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR Resta", "Algun campo esta vacio")
        }
    }

    fun multiplicar (view: View?) {
        if(cifra_01!!.text.toString() != "" && cifra_02!!.text.toString() != "") {
            val resultadoNumero = cifra_01!!.text.toString().toInt() * cifra_02!!.text.toString().toInt()
            resultado!!.text = resultadoNumero.toString()
        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR Multiplicacion", "Algun campo esta vacio")
        }
    }

    fun dividir (view: View?) {
        if(cifra_01!!.text.toString() != "" && cifra_02!!.text.toString() != "") {
            if(cifra_02!!.text.toString() != "0") {
                val resultadoNumero = cifra_01!!.text.toString().toInt() / cifra_02!!.text.toString().toInt()
                resultado!!.text = resultadoNumero.toString()
            }else{
                Toast.makeText(this, "No es posible dividir por cero", Toast.LENGTH_SHORT).show()
                Log.d("ERROR en la Dicision", "Valor cero en el divisor")
            }
        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR Division", "Algun campo esta vacio")
        }
    }
}