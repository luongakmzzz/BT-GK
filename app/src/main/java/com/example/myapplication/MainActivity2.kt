package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //lay du lieu tu intent
        var intent = intent
        var name = intent.getStringExtra("Tên")
        var sdt = intent.getStringExtra("Số điện thoại")


        var showall = findViewById<TextView>(R.id.showall)
        showall.text= "Tên: " +name+ "\nSố điện thoại: " +sdt





    }
}