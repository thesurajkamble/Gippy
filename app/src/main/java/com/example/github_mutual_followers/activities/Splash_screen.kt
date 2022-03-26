package com.example.github_mutual_followers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.github_mutual_followers.R


class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_activity)
        splashScreen()



    }

    private fun splashScreen()
    {
        Handler().postDelayed({
            val intent = Intent(this, Home_activity::class.java)
            startActivity(intent)
        }, 8000)
    }
}