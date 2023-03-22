package com.example.reco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val backBtn = findViewById<ImageButton>(R.id.JoinBackBtn)

        backBtn.setOnClickListener {
            val intent = Intent(this,LoginOrJoinActivity::class.java)
            startActivity(intent)
            Log.d("Join","move to loginOrJoin")
        }

    }
}