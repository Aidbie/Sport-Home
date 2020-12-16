package com.example.sport_gains

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Sports_program : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_program)
    }

    fun onClick(v:View)
    {
        val intent = Intent(this, Intensity::class.java)
        var type = "rankos"
        intent.putExtra("type", type)
        startActivity(intent);

    }

    fun onClick1(v:View)
    {
        val intent = Intent(this, Intensity::class.java)
        var type = "juosmuo"
        intent.putExtra("type", type)
        startActivity(intent);

    }
    fun onClick2(v:View)
    {
        val intent = Intent(this, Intensity::class.java)
        var type = "kojos"
        intent.putExtra("type", type)
        startActivity(intent);

    }
}