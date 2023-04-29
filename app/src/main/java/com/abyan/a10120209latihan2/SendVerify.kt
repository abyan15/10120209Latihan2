package com.abyan.a10120209latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SendVerify : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnVerify2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_verify)

        btnVerify2 = findViewById(R.id.btn_verify2)
        btnVerify2.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_verify2 ->{
                val intentVerify2 = Intent(this@SendVerify, Home::class.java)
                startActivity(intentVerify2)
            }
        }
    }
}