package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val imageObjects : MutableList<Images>  = mutableListOf()
        imageObjects.add(Images(R.drawable.img,"android"))
        imageObjects.add(Images(R.drawable.img_1,"dog"))
        imageObjects.add(Images(R.drawable.img_2,"cake"))
        imageObjects.add(Images(R.drawable.img_3,"asad"))
        viewPage.adapter = viewPagerAdapter(imageObjects)

    }

    }
