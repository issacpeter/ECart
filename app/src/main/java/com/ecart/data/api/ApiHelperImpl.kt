package com.shameem.projectstructure.data.api

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getProductSortBY() = apiService.getProductSortBY()

}