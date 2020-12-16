package com.example.sport_gains

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun onClick (v: View)
    {
        val intent = Intent(this,Sports_program::class.java)

        startActivity(intent)
    }
    fun onClick1 (v: View)
    {
        val intent = Intent(this,Measurements::class.java)

        startActivity(intent)
    }
    fun onClick2 (v: View)
    {
        val intent = Intent(this,Tips::class.java)

        startActivity(intent)
    }

    fun onClick3 (v: View)
    {
        val type= intent.getStringExtra("type")
        val intensity = intent.getStringExtra("intensity")
        val intent = Intent(this,Progress::class.java)
        intent.putExtra("intensity", intensity)
        intent.putExtra("type", type)

        startActivity(intent)
    }

    fun onClick4 (v: View)
    {
        val intent = Intent(this,About::class.java)

        startActivity(intent)

    }
}