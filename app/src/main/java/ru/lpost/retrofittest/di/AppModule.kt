package ru.lpost.retrofittest.di

import dagger.Module
import dagger.Provides
import ru.lpost.domain.LoadCitiesListUseCase
import ru.lpost.retrofittest.viewmodel.MainViewModelFactory

@Module
class AppModule {
    @Provides
    fun provideMainViewModelFactory(findUseCase: LoadCitiesListUseCase): MainViewModelFactory{
        return MainViewModelFactory(findUseCase = findUseCase)
    }
}