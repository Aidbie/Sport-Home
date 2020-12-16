package com.example.sport_gains

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class  Tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        val list = findViewById<RecyclerView>(R.id.list_tips)

        val data = listOf<TipAd>(


            TipAd("•  Cigaretei – griežtai „ne!“ Niekada nesutraukę dūmo turi dvigubai daugiau galimybių sulaukti 80-ojo gimtadienio nei rūkaliai."),
            TipAd("•  Venkite cukraus. Mitybos specialistai pataria nuosaikiai elgtis su saldžiąja medžiaga. Kasdien suvartojame vidutiniškai 16 proc. kalorijų cukraus pavidalu."),
            TipAd("•  Saikingai vartokite alkoholį. Dar geriau – dienos be alkoholio."),
            TipAd("•  Venkite akivaizdaus antsvorio. Jei KMI – kūno masės indeksas viršija 30, mirštama anksčiau. Diabetas ir širdies ligos sumažina gyvenimo kokybę.")

        )

        list.adapter = TipAdapter(data)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        list.layoutManager = layoutManager

    }
}