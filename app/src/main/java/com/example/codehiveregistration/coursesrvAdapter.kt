package com.example.codehiveregistration

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class coursesrvAdapter (var courselist:List<Course>):RecyclerView.Adapter<coursesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): coursesViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.course_list_item,parent,false)
        return coursesViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: coursesViewHolder, position: Int) {
        var currentCourse=courselist.get(position)
        holder.tvcoursename.text=currentCourse.coursename
        holder.tvdescription.text=currentCourse.description
        holder.tvcoursecode.text=currentCourse.courseCode
        holder.tvinstructor.text=currentCourse.instructor

    }

    override fun getItemCount(): Int {
        return courselist.size
    }
}
class coursesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
var tvcoursename=itemView.findViewById<TextView>(R.id.tvcoursename)
var tvdescription=itemView.findViewById<TextView>(R.id.tvdescription)
var tvcoursecode=itemView.findViewById<TextView>(R.id.tvcoursecode)
var tvinstructor=itemView.findViewById<TextView>(R.id.tvinstructor)
}