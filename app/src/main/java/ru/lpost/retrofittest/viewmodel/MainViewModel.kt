package ru.lpost.retrofittest.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.lpost.domain.LoadCitiesListUseCase

class MainViewModel(private val findUseCase: LoadCitiesListUseCase) : ViewModel() {
    fun findClick(findString: String) {
        viewModelScope.launch(Dispatchers.IO) {
            Log.e("AAA_AAA", findUseCase.exec(findString = findString))
        }
    }
}