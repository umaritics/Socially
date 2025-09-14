package com.example.socially

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class main_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_page)
        var chat_button = findViewById<ImageView>(R.id.chats_button)
        var search_button = findViewById<ImageView>(R.id.search_button)
        var heart_button = findViewById<ImageView>(R.id.following_button)
        var profile_button = findViewById<CircleImageView>(R.id.profile_button)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        chat_button.setOnClickListener {
            startActivity(android.content.Intent(this, chats::class.java))
        }
        search_button.setOnClickListener {
            startActivity(android.content.Intent(this, Posts::class.java))
        }
        heart_button.setOnClickListener {
            startActivity(android.content.Intent(this, Following::class.java))
        }
        profile_button.setOnClickListener {
            startActivity(android.content.Intent(this, Profile::class.java))
        }
    }

}