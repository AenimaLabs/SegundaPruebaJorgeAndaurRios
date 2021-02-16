package com.example.segundapruebajorgeandaurrios.ListFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.segundapruebajorgeandaurrios.data.Games
import com.example.segundapruebajorgeandaurrios.databinding.GameItemBinding
import com.example.segundapruebajorgeandaurrios.viewmodel.GamesViewModel

class GameAdapter : RecyclerView.Adapter<GameVH>() {

    private val gamelist = listOf<Games>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameVH {
        val binding = GameItemBinding.inflate(LayoutInflater.from(parent.context))

        return GameVH(binding)
    }

    override fun onBindViewHolder(holder: GameVH, position: Int) {
        val game = gamelist[position]

        holder.bind(game)
    }

    override fun getItemCount() = gamelist.size

}

class GameVH(val binding: GameItemBinding) : RecyclerView.ViewHolder(binding.root){

    fun bind(games: Games){
        binding.textView.text = games.name
    }
}