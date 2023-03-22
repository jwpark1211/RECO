package com.example.reco

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class LoginOrJoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_or_join)

        val localLoginBtn = findViewById<ImageButton>(R.id.localLoginBtn)
        localLoginBtn.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Log.d("LoginOrJoin","move to login[local]")
        }

        val joinBtn = findViewById<TextView>(R.id.LoJ_noAccount_txt)
        joinBtn.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        joinBtn.setOnClickListener {
            val intent = Intent(this,JoinActivity::class.java)
            startActivity(intent)
        }
    }
}