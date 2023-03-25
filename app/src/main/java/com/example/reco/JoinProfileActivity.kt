package com.example.reco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

@SuppressLint("MissingInflatedId")
class JoinProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_profile)
        val backBtn = findViewById<ImageButton>(R.id.JoinProfileBackBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this,JoinActivity::class.java)
            startActivity(intent)
            Log.d("JoinProfile","move to Join")
        }
    }
}