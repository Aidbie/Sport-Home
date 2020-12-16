package com.example.sport_gains

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.activity_progress.*
import java.time.LocalDate

class Progress : AppCompatActivity() {

    var db :AppDatabase? = null
    var data: MutableList<History>? = null
    var list: RecyclerView? = null
    var adapter :HistoryAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)


        db= AppDatabase.getInstance(this)
        data = mutableListOf()

        list = findViewById(R.id.history_list)
        list?.layoutManager=LinearLayoutManager(this)

        db?.getHistoryDao()?.getAllHistory()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe({
                if(!it.isNullOrEmpty())
                {
                    data= it.toMutableList()
                }
                adapter = HistoryAdapter(data!!)
                list?.adapter = adapter
            },{})
        val area= intent.getStringExtra("type")
            if(area==null)
            {
                update_btn.setVisibility(View.GONE)
            }
            else if(area!=null)
            {
                findViewById<Button>(R.id.update_btn).setOnClickListener { addHistory(it) }

            }


    }
    fun addHistory(v:View)
    {
        val area= intent.getStringExtra("type")
        val intensity = intent.getStringExtra("intensity")
        val date = LocalDate.now()

        var newHistory = History(0,
            area.toString(),
            intensity.toString(),
            date.toString()
        )
         db?.getHistoryDao()?.insert(newHistory)
             ?.subscribeOn(Schedulers.io())
             ?.observeOn(AndroidSchedulers.mainThread())
             ?.subscribe({
                 data?.add(newHistory)
                 adapter?.notifyItemInserted(data!!.lastIndex)
             },{})
        update_btn.setVisibility(View.GONE)

    }
}