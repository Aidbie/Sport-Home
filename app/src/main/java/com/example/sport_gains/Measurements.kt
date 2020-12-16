package com.example.sport_gains

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_measurements.*

class Measurements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_measurements)

    }
    fun onClick(v:View)
    {
        val height = (findViewById<EditText>(R.id.height_field).text.toString().toDouble())/100
        val weight = findViewById<EditText>(R.id.weight_field).text.toString().toDouble()
        val kmic = (weight.toDouble())/(height.toDouble()*height.toDouble())
        kmi_field.setText("$kmic")
    }
}