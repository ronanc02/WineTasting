package com.example.winetasting

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.winetasting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val amountButton: Button = binding.buttonCheck
        amountButton.setOnClickListener{
            amountBottle()
        }
    }

    private fun amountBottle() {
        val bottle = Bottle(6)
        val bottleAmount = bottle.amount()

        val resultTextView: TextView = binding.amountText
        resultTextView.text = bottleAmount.toString()
    }
}


class Bottle (val amountRanges: Int){
    fun amount(): Int {
        return (1..amountRanges).random()
    }
}
