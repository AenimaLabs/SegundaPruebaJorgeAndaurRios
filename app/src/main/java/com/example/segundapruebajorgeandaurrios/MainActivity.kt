package com.example.segundapruebajorgeandaurrios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.segundapruebajorgeandaurrios.databinding.ActivityMainBinding
import com.example.segundapruebajorgeandaurrios.viewmodel.GamesViewModel

class MainActivity : AppCompatActivity() {

    val gameVM : GamesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gameVM.getGames()


    }
}