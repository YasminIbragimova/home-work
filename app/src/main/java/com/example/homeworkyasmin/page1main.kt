package com.example.homeworkyasmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class page1main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)
        val Button = findViewById<Button>(R.id.button)

        Button.setOnClickListener{
            startActivity(Intent(this,pag2main::class.java))
        }
    }
}