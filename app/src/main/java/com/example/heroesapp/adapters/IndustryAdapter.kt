package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Industry
import com.squareup.picasso.Picasso


class IndustryAdapter(val industryList: List<Industry>,val onClick: (Industry) -> Unit) : RecyclerView.Adapter<IndustryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndustryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.industry_item,parent,false)
        return IndustryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return industryList.count()
    }

    override fun onBindViewHolder(holder: IndustryViewHolder, position: Int) {
        val industry = industryList[position]
        holder.industryNameTV.text = industry.name
        Picasso.get().load(industry.image).into(holder.industryImage)
        holder.itemView.setOnClickListener {
            //Log.i("IndustryAdapter","Click en: ${industry.name}")
            onClick(industry)
        }
    }

}

class IndustryViewHolder(view : View) : ViewHolder(view){
    val industryNameTV : TextView = view.findViewById(R.id.industry_name)
    val industryImage : ImageView = view.findViewById(R.id.industry_image)
}

