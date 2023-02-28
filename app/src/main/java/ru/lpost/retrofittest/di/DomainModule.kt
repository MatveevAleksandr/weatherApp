package ru.lpost.retrofittest.di

import dagger.Module
import dagger.Provides
import ru.lpost.domain.LoadCitiesListUseCase
import ru.lpost.domain.RepositoryInterface

@Module
class DomainModule {
    @Provides
    fun provideFindUseCase(repository: RepositoryInterface): LoadCitiesListUseCase{
        return LoadCitiesListUseCase(repository = repository)
    }
}