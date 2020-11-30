package com.shameem.projectstructure.data.api

import com.google.gson.JsonObject
import retrofit2.http.GET

interface ApiService {

    @GET("getProductSortBY")
    suspend fun getProductSortBY(): List<JsonObject>



}