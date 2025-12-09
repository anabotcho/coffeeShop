package com.example.coffeshop.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.coffeshop.R
import android.content.Intent


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgCoffee = findViewById<ImageView>(R.id.imgCoffee)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvType = findViewById<TextView>(R.id.tvType)
        val btnBuyNow = findViewById<TextView>(R.id.btnBuyNow)

        tvName.text = "Caffe Mocha"
        tvType.text = "Ice / Hot"

        btnBuyNow.setOnClickListener {
            // Go to Order screen
            startActivity(Intent(this, OrderActivity::class.java))
        }
    }
}
