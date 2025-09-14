package com.example.socially

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class Posts : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_posts)

        var home = findViewById<ImageView>(R.id.home_button)
        var shop = findViewById<TextView>(R.id.shop)
        var create_button = findViewById<ImageView>(R.id.create_button)
        var following_button = findViewById<ImageView>(R.id.following_button)
        var profile = findViewById<CircleImageView>(R.id.profile_button)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        home.setOnClickListener {
            finish()
        }
        shop.setOnClickListener {
            startActivity(android.content.Intent(this, Search::class.java))

        }
        create_button.setOnClickListener {
            startActivity(android.content.Intent(this, Addcontent::class.java))
            finish()
        }
        following_button.setOnClickListener {
            startActivity(android.content.Intent(this, Following::class.java))
            finish()
        }
        profile.setOnClickListener {
            startActivity(android.content.Intent(this, Profile::class.java))
            finish()
        }
    }
}