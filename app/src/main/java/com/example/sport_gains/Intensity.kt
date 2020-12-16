package com.example.sport_gains

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_intensity.*

class Intensity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intensity)



    }

    fun onClick (v: View)
    {
        val type= intent.getStringExtra("type")
        var intent = Intent(this, Exercise::class.java)
        var intensity = "lengvas"
        intent.putExtra("intensity", intensity)
        intent.putExtra("type", type)
        startActivity(intent);

    }
    fun onClick1(v:View)
    {
        val type= intent.getStringExtra("type")
        val intent = Intent(this, Exercise::class.java)
        var intensity = "vidutinis"
        intent.putExtra("intensity", intensity)
        intent.putExtra("type", type)
        startActivity(intent);

    }
    fun onClick2(v:View)
    {
        val type= intent.getStringExtra("type")
        val intent = Intent(this, Exercise::class.java)
        var intensity = "sunkus"
        intent.putExtra("intensity", intensity)
        intent.putExtra("type", type)
        startActivity(intent);

    }
}