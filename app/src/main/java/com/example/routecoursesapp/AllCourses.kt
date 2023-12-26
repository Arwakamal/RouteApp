package com.example.routecoursesapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AllCourses : AppCompatActivity(),OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_courses)

       val btnAndroid = findViewById<Button>(R.id.android_btn)
       val btnIos = findViewById<Button>(R.id.ios_btn)
       val btnFullstack = findViewById<Button>(R.id.fullstack_btn)

        btnAndroid.setOnClickListener(this)
        btnIos.setOnClickListener(this)
        btnFullstack.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.android_btn) {
            val intent: Intent = Intent(
                this,
               AndroidCourse::class.java
            )
            startActivity(intent)
        } else if (view.id == R.id.ios_btn) {
            val intent: Intent = Intent(this, IosCourse::class.java)
            startActivity(intent)

        } else if (view.id == R.id.fullstack_btn){
            val intent: Intent = Intent(
                this,
                FullStackCourse::class.java
            )
            startActivity(intent)
        }
    }
}