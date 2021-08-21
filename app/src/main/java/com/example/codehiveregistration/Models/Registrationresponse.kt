package com.example.codehiveregistration.Models

import com.google.gson.annotations.SerializedName

data class Registrationresponse(
    var name:String,
    @SerializedName("number") var phonenumber:String,
    var Email:String,
    @SerializedName("dateofbirth") var dateofbirth:String,
    var nationality:String,
    @SerializedName("student_Id") var studentId:String,
)
