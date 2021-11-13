package com.example.winetasting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.winetasting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCheck.setOnClickListener{
            val selectedId = binding.radioGroup1.checkedRadioButtonId
            binding.amountText.text = when (selectedId) {
                R.id.activity_main_q1_rb1 -> "Red"
                R.id.activity_main_q1_rb2 -> "White"
                else -> "Rose"
            }
        }
    }

    private fun amountBottle() {
        val bottle = Bottle(6)
        val bottleAmount = bottle.amount()

        binding.amountText.text = bottleAmount.toString()
    }
}


class Bottle (val amountRanges: Int){
    fun amount(): Int {
        return (1..amountRanges).random()
    }
}
