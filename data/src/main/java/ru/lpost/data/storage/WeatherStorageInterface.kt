package ru.lpost.data.storage

interface WeatherStorageInterface {
    fun getCurrent(geoObjectId: Int): String
}