package ru.lpost.retrofittest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.lpost.domain.LoadCitiesListUseCase

class MainViewModelFactory(private val findUseCase: LoadCitiesListUseCase): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(findUseCase = findUseCase) as T
    }
}