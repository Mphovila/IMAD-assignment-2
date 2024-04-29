package com.example.myproject2

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject2.R.id.BtnFeed

class MainActivity2 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    override fun onCreate(savedInstanceStateException: Bundle?) {
        super.onCreate(savedInstanceStateException)
        setContentView(R.layout.activity_main2)

        //Get the button and text values
        val btnFeed = findViewById<Button>(BtnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnHappy = findViewById<Button>(R.id.btnHappy)
        val txtHunger = findViewById<EditText>(R.id.hungerValue)
        val txtClean = findViewById<EditText>(R.id.CleanlinessValue)
        val txtHappy = findViewById<EditText>(R.id.happyValue)
        val petimage = findViewById<ImageView>(R.id.Petimage)

        //set the initial text values
        txtHunger.setText(petHunger.toString())
        txtClean.setText(petCleanliness.toString())
        txtHappy.setText (petHealth.toString())

        //Handle button clicks
        btnFeed.setOnClickListener{
            petHunger -= 10
            petHealth += 10
            petHunger += 5
             txtHunger.setText(petHealth.toString())
             animateImageChange (petimage, R.drawable.img)

        }
        btnClean.setOnClickListener{
            petCleanliness += 10
            petHealth += 10

            txtClean.setText(petCleanliness.toString())
            animateImageChange(petimage, R.drawable.img_5)
        }
        btnHappy.setOnClickListener{
            petHealth += 10
            petHunger += 5
            petCleanliness -= 5
            txtHappy.setText(petHealth.toString())
            animateImageChange(petimage,R.drawable.img_1)
        }
    }
    private fun animateImageChange(imageView: ImageView, newImageResoure: Int) {
        val animation = AlphaAnimation(0.0f, 1.0f)
        animation.duration =500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResoure)
    }
}