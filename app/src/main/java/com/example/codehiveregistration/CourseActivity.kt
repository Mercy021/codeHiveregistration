package com.example.codehiveregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CourseActivity : AppCompatActivity() {
    lateinit var rvcourses:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        displayCourse()
    }
    fun displayCourse(){
        var courselist= listOf<Course>(
            Course(coursename = "Android","AD 101","Native android development","Akirachix"),

        Course(coursename = "javascript","js 101","js development","Akirachix"),
        Course(coursename = "kotlin","kt 101"," android development","Akirachix")   ,
        )
        rvcourses=findViewById(R.id.rvcourses)
        var coursesAdapter=coursesrvAdapter(courselist)
        rvcourses.layoutManager=LinearLayoutManager(baseContext)
        rvcourses.adapter=coursesAdapter
    }
}