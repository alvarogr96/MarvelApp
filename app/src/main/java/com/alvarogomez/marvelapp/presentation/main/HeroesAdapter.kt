package com.alvarogomez.marvelapp.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alvarogomez.marvelapp.domain.models.Result
import com.alvarogomez.marvelapp.presentation.utils.loadImageWithPicasso
import com.example.marvelapp.R
import com.example.marvelapp.databinding.ItemHeroBinding
import kotlin.properties.Delegates

class HeroesAdapter(private val listener: (Result) -> Unit): RecyclerView.Adapter<HeroesAdapter.ViewHolder>() {

    private var list: List<Result> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_hero, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val binding = ItemHeroBinding.bind(view)
        fun bind(result: Result) {
            binding.thumbnail.loadImageWithPicasso(result.thumbnail.path)
            binding.name.text = result.name
        }
    }
}