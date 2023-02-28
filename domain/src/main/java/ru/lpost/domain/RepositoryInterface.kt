package ru.lpost.domain

interface RepositoryInterface {
    fun findGeoObjectId(findString: String): Int
    fun getCurrentWeather(geoObjectId: Int): String
}