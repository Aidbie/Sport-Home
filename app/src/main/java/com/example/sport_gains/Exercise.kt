package com.example.sport_gains

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.AlarmClock
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_exercise.*


class Exercise : AppCompatActivity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        val type= intent.getStringExtra("type")

        if(type=="rankos")
        {
            textView_pratimas.setText("Atsispaudimai")
            imageView2.setImageResource(R.drawable.pushup)
        }
        else if(type=="juosmuo")
        {
            textView_pratimas.setText("Atsilenkimai")
            imageView2.setImageResource(R.drawable.crunches)
        }
        else if(type=="kojos")
        {
            textView_pratimas.setText("Pritūpimai")
            imageView2.setImageResource(R.drawable.squat)
        }
    }

    fun onClick(v:View)
    {
       // val intent = Intent(AlarmClock.ACTION_SET_TIMER);
       // intent.putExtra(AlarmClock.EXTRA_LENGTH, 20)

        val intensity = intent.getStringExtra("intensity")
        var a = 0
        if(intensity=="lengvas")
        {
            a=30000
        }
        else if(intensity=="vidutinis")
        {
            a=60000
        }
        else if(intensity=="sunkus")
        {
            a=90000
        }
        button_start.setVisibility(View.GONE)

        object : CountDownTimer(a.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                text_timer.setText("Liko laiko: " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                text_timer.setText("Programa baigta!")
            }
        }.start()





    }

    fun onClick1 (v: View)
    {
        val type= intent.getStringExtra("type")
        val intensity = intent.getStringExtra("intensity")

        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("intensity", intensity)
        intent.putExtra("type", type)

        startActivity(intent)
    }
}