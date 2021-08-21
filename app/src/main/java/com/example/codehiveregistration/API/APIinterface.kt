package com.example.codehiveregistration.API

import com.example.codehiveregistration.Models.Registrationrequest
import com.example.codehiveregistration.Models.Registrationresponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIinterface {
    @POST("/student/register")
    fun registerStudent(@Body registrationrequest: Registrationrequest): Call<Registrationresponse>
}