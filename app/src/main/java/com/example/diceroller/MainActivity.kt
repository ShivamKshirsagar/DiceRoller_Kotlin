package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import java.lang.Math.random
import java.util.Collections.rotate
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var dice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button)
        dice = findViewById(R.id.imageView)

        btn.setOnClickListener()
        {
            diceROll()
        }
    }

    private fun diceROll() {
        val randomNum  = (0..7).random()
        var anm : Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        dice.startAnimation(anm)

        when(randomNum)
        {
            1 -> dice.setImageResource(R.drawable.dice1)
            2 -> dice.setImageResource(R.drawable.dice2)
            3 -> dice.setImageResource(R.drawable.dice3)
            4 -> dice.setImageResource(R.drawable.dice4)
            5 -> dice.setImageResource(R.drawable.dice5)
            6 -> dice.setImageResource(R.drawable.dice6)
        }
    }
}