package com.example.segundapruebajorgeandaurrios.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.segundapruebajorgeandaurrios.data.RetrofitClient
import kotlinx.coroutines.launch
import timber.log.Timber

class GamesViewModel : ViewModel() {

    fun getGames (){
        viewModelScope.launch {
            val response = RetrofitClient.retrofitInstance().getGames()

            Log.d("GameVM", "load info")
            response?.body()?.get(0)?.let { Log.d("GameVM", it?.toString()) }
        }

    }
}