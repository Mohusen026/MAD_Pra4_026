package com.mo_husen.mad_pra4_026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Loginbutton).setOnClickListener {
            // Create an Intent to navigate to SecondActivity
            val intent = Intent(this, Activity_loginActivity::class.java)
            startActivity(intent)}
        findViewById<View>(R.id.signupbutton).setOnClickListener {
            // Create an Intent to navigate to SecondActivity
            val intent = Intent(this, Activity_signupactivityActivity::class.java)
            startActivity(intent)}}}
