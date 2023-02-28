package ru.lpost.data.retrofit

import com.google.gson.annotations.SerializedName

data class GeoObjectModel (
    @SerializedName("name") val name: String,
    @SerializedName("lat") val lat: Float,
    @SerializedName("lon") val lon: Float,
    @SerializedName("country") val country: String
)