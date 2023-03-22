package com.example.reco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

@SuppressLint("MissingInflatedId")
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backBtn = findViewById<ImageButton>(R.id.LoginBackBtn)

        backBtn.setOnClickListener {
            val intent = Intent(this,LoginOrJoinActivity::class.java)
            startActivity(intent)
            Log.d("Login","move to loginOrJoin")
        }
    }
}