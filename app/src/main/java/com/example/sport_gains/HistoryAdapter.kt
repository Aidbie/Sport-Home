package com.example.sport_gains

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter (data:MutableList<History>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>()
{
    class ViewHolder(v:View) : RecyclerView.ViewHolder(v)
    {
        var area = v.findViewById<TextView>(R.id.text_program)
        var intensity = v.findViewById<TextView>(R.id.text_intensity)
        var date = v.findViewById<TextView>(R.id.text_date)
    }
    var data=data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_history,parent, false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
         return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var history = data[position]

        holder.area.text = history.type
        holder.intensity.text = history.intensity
        holder.date.text = history.date
    }

}