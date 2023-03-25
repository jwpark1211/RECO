package com.example.reco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton

@SuppressLint("MissingInflatedId")
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

        val joinNextBtn = findViewById<Button>(R.id.JoinNextBtn)
        joinNextBtn.setOnClickListener {
            val intent = Intent(this,JoinProfileActivity::class.java)
            startActivity(intent)
            Log.d("Join","move to joinProfile")
        }

    }
}