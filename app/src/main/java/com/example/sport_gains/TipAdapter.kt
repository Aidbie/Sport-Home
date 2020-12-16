package com.example.sport_gains

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(data: List<TipAd>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>()
{
    class TipViewHolder(v: View) : RecyclerView.ViewHolder(v)
    {
        var nameField = v.findViewById<TextView>(R.id.tip_field);
    }

    var data = data

    override fun getItemCount(): Int {

        return data.size;
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {

        val tip = data[position]
        holder.nameField.text=tip.Text

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
         val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_tip, parent,false)
        return TipViewHolder(v)
    }

}
