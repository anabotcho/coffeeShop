package com.example.coffeshop.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.coffeshop.R

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val btnDeliver = findViewById<TextView>(R.id.btnDeliver)
        val btnPickUp = findViewById<TextView>(R.id.btnPickUp)
        val btnOrder = findViewById<TextView>(R.id.btnOrder)

        btnDeliver.setOnClickListener {
            btnDeliver.setBackgroundResource(R.drawable.rounded_button)
            btnPickUp.setBackgroundResource(android.R.color.transparent)
        }

        btnPickUp.setOnClickListener {
            btnPickUp.setBackgroundResource(R.drawable.rounded_button)
            btnDeliver.setBackgroundResource(android.R.color.transparent)
        }

        btnOrder.setOnClickListener {
            //
        }
    }
}
