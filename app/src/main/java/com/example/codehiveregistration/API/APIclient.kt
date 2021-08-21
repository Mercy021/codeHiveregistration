package com.example.codehiveregistration.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIclient {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://13.244.243.129")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
}
    https://jsonplaceholder.typicode.com/