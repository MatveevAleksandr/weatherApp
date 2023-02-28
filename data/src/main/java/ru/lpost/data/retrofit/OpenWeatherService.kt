package ru.lpost.data.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherService {
    @GET("geo/1.0/direct?appid=58659a8edb29ec81e399c6c25942f7de&limit=5")
    fun getListCityModelByName(
        @Query("q") city: String
    ): Call<List<GeoObjectModel>>
}
