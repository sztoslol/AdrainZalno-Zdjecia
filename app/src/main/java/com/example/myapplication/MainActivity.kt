package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nastepny = findViewById<Button>(R.id.Nastepny)
        var poprzedni = findViewById<Button>(R.id.Poprzedni)
        var i = 1

        nastepny.setOnClickListener {
            if (i % 2 == 0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.adrian1)
                i++
            } else {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.adraian2)
                i--
            }
        }
        poprzedni.setOnClickListener {
            if (i % 2 != 0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.adraian2)
                i--
            } else {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.adrian1)
                i++
            }
        }

    }
}