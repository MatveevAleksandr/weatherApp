package ru.lpost.data.storage

import android.util.Log
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import ru.lpost.data.retrofit.OpenWeatherService

class GeoObjectStorageImpl : GeoObjectStorageInterface {
    override fun getId(objectTxt: String): Int {
        val a = Retrofit.Builder().baseUrl("https://api.openweathermap.org/").addConverterFactory(
            GsonConverterFactory.create()
        ).build().create<OpenWeatherService>()
        val call =
            a.getListCityModelByName(city = "London")
                .execute()
        Log.e("AAA_AAA", call.body().toString())
        return 0
    }
}