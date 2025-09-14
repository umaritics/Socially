package com.example.socially

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        var home_button = findViewById<ImageView>(R.id.home_button)
        var search_button = findViewById<ImageView>(R.id.search_button)
        var create_button = findViewById<ImageView>(R.id.create_button)
        var following_button = findViewById<ImageView>(R.id.following_button)
        var editprofile = findViewById<Button>(R.id.editprofile)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        home_button.setOnClickListener {
            finish()
        }
        search_button.setOnClickListener {
            startActivity(android.content.Intent(this, Posts::class.java))
        finish()
        }
        following_button.setOnClickListener {
           startActivity(android.content.Intent(this, Following::class.java))
           finish()
        }
        editprofile.setOnClickListener {
            startActivity(android.content.Intent(this, Editprofile::class.java))
        }
    }
}