package com.example.winetasting

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amountButton: Button = findViewById(R.id.buttonCheck)
        amountButton.setOnClickListener{
            amountBottle()
        }
    }

    private fun amountBottle() {
        val bottle = Bottle(6)
        val bottleAmount = bottle.amount()

        val resultTextView: TextView = findViewById(R.id.amountText)
        resultTextView.text = bottleAmount.toString()
    }
}


class Bottle (val amountRanges: Int){
    fun amount(): Int {
        return (1..amountRanges).random()
    }
}
