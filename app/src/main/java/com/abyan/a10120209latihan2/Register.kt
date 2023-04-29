package com.abyan.a10120209latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Register : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnMasuk = findViewById(R.id.btn_masuk)
        btnMasuk.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_masuk ->{
                val intentMasuk = Intent(this@Register, Verify::class.java)
                startActivity(intentMasuk)
            }
        }
    }
}