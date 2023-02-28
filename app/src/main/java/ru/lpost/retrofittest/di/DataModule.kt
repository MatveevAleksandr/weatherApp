package ru.lpost.retrofittest.di

import dagger.Module
import dagger.Provides
import ru.lpost.data.repository.RepositoryImpl
import ru.lpost.data.storage.GeoObjectStorageImpl
import ru.lpost.data.storage.GeoObjectStorageInterface
import ru.lpost.data.storage.WeatherStorageImpl
import ru.lpost.data.storage.WeatherStorageInterface
import ru.lpost.domain.RepositoryInterface

@Module
class DataModule {
    @Provides
    fun provideRepository(
        geoStorage: GeoObjectStorageInterface, weatherStorage: WeatherStorageInterface
    ): RepositoryInterface {
        return RepositoryImpl(geoStorage = geoStorage, weatherStorage = weatherStorage)
    }

    @Provides
    fun provideGeoStorage(): GeoObjectStorageInterface{
        return GeoObjectStorageImpl()
    }

    @Provides
    fun provideWeatherStorage(): WeatherStorageInterface{
        return WeatherStorageImpl()
    }
}