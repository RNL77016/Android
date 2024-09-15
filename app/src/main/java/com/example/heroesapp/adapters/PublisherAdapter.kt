package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso


class PublisherAdapter(val publisherList: List<Publisher>, val onClick: (Publisher) -> Unit) : RecyclerView.Adapter<PublisherViewHolder>() {

    // Infla el layout para cada ítem
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    // Devuelve el número de publishers
    override fun getItemCount(): Int {
        return publisherList.count()
    }

    // Asigna datos a cada ViewHolder
    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publisherList[position]
        holder.publisherNameTV.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)
        holder.itemView.setOnClickListener {
            onClick(publisher)
        }
    }
}

class PublisherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    // Referencia al TextView que muestra el nombre del publisher
    val publisherNameTV: TextView = view.findViewById(R.id.publisher_name)
    // Referencia al ImageView que muestra la imagen del publisher
    val publisherImage: ImageView = view.findViewById(R.id.publisher_image)
}
