package com.example.socially

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class You : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_you)


        var home_button = findViewById<ImageView>(R.id.home_button)
        var following_button = findViewById<LinearLayout>(R.id.following_button)
        var search_button = findViewById<ImageView>(R.id.search_button)
        var create_button = findViewById<ImageView>(R.id.create_button)
        var profile_button = findViewById<CircleImageView>(R.id.profile_button)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        following_button.setOnClickListener {
            startActivity(android.content.Intent(this,Following::class.java))
            finish()
        }
        home_button.setOnClickListener {
            finish()
        }
        search_button.setOnClickListener {
            startActivity(android.content.Intent(this,Posts::class.java))
            finish()
        }
        create_button.setOnClickListener {
            startActivity(android.content.Intent(this, Addcontent::class.java))
            finish()
        }
        profile_button.setOnClickListener {
            startActivity(android.content.Intent(this, Profile::class.java))
            finish()
        }
    }
}