package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.editten)
        val sdt = findViewById<EditText>(R.id.editsdt)
        val saveBtn = findViewById<Button>(R.id.btn_login)

        //button click
        saveBtn.setOnClickListener {
            val name = name.text.toString()
            val sdt = sdt.text.toString()

            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Tên", name)
            intent.putExtra("Số điện thoại", sdt)
            startActivity(intent)
        }
    }

}