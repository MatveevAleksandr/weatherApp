package ru.lpost.domain

class LoadCitiesListUseCase(private val repository: RepositoryInterface) {
    fun exec(findString: String): String {
        val geoObjectId = repository.findGeoObjectId(findString = findString)
        return repository.getCurrentWeather(geoObjectId = geoObjectId)
    }
}