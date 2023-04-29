package com.abyan.a10120209latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Verify : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnVerify : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        btnVerify = findViewById(R.id.btn_verify)
        btnVerify.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_verify ->{
                val intentVerify = Intent(this@Verify, SendVerify::class.java)
                startActivity(intentVerify)
            }
        }
    }
}