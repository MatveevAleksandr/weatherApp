package ru.lpost.data.repository

import ru.lpost.data.storage.GeoObjectStorageInterface
import ru.lpost.data.storage.WeatherStorageInterface
import ru.lpost.domain.RepositoryInterface

class RepositoryImpl(
    private val geoStorage: GeoObjectStorageInterface, private val weatherStorage: WeatherStorageInterface
) : RepositoryInterface {
    override fun findGeoObjectId(findString: String): Int {
        return geoStorage.getId(objectTxt = findString)
    }

    override fun getCurrentWeather(geoObjectId: Int): String {
        return weatherStorage.getCurrent(geoObjectId = geoObjectId)
    }
}