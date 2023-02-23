package com.example.appaula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variaveis de inicialização
        val edtNumeroUm:EditText = findViewById(R.id.edtNumeroUm)
        val edtNumeroDois:EditText = findViewById(R.id.edtNumeroDois)
        val btnCalcular:Button = findViewById(R.id.btnCalcular)

        /* Caluclo a ser realizado */
        btnCalcular.setOnClickListener {
                //val Toast = Toast.makeText(this, "O botão foi clicado", Toast.LENGTH_SHORT)
                // Toast.show()
            calular()
        }


    }
    private fun calular( ) {
        val total: Int
        total = 10 + 2
        val Toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT)
        Toast.show()
    }
}