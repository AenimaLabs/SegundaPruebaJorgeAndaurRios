package com.example.segundapruebajorgeandaurrios.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.segundapruebajorgeandaurrios.data.Games
import com.example.segundapruebajorgeandaurrios.data.RetrofitClient
import kotlinx.coroutines.launch
import timber.log.Timber

class GamesViewModel : ViewModel() {

    private val gamesList = MutableLiveData<List<Games>>()

    fun gamesList(): LiveData<List<Games>> = gamesList

    fun getGames (){
        viewModelScope.launch {
            val response = RetrofitClient.retrofitInstance().getGames()

            Log.d("GameVM", "load info")

            response.let {
                when(it.isSuccessful){
                    true -> gamesList.value = response.body()
                    false -> Log.d("GameVM", "error")}
            } }

    }
}