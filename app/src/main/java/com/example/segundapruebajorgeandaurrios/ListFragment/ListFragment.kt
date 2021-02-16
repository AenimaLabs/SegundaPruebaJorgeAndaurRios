package com.example.segundapruebajorgeandaurrios.ListFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.segundapruebajorgeandaurrios.data.Games
import com.example.segundapruebajorgeandaurrios.databinding.FragmentListBinding
import com.example.segundapruebajorgeandaurrios.viewmodel.GamesViewModel

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    private val gamesViewModel: GamesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(inflater)

        gamesViewModel.gamesList().observe(viewLifecycleOwner, {
            Log.d("ListFragment", "actualizando info games ${it.size}")
        })

        return binding.root
    }
}