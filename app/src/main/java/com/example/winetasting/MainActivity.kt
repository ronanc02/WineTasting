package com.example.winetasting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.winetasting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val whiteWineBottle = White("Pouilly Fusse", "Chardonnay")
        val wineList1 = wineList(1)
        wineList1.addBottle(whiteWineBottle)

        binding.buttonCheck.setOnClickListener{
            val selectedId = binding.radioGroup1.checkedRadioButtonId
            binding.amountText.text = when (selectedId) {
                R.id.activity_main_q1_rb1 -> "Red"
                R.id.activity_main_q1_rb2 -> whiteWineBottle.toString()
                else -> "Rose"
            }
        }

        binding.buttonRecyclerView.setOnClickListener {
            val context = binding.buttonRecyclerView.context
            val intent = Intent(context, RecyclerViewActivity::class.java)
            context.startActivity(intent)
        }
    }

    private fun amountBottle() {
        val bottle = BottleGen(6)
        val bottleAmount = bottle.amount()

        binding.amountText.text = bottleAmount.toString()
    }
}


class BottleGen (val amountRanges: Int){
    fun amount(): Int {
        return (1..amountRanges).random()
    }
}
open class Bottle(val name: String, val price: Int)

class Red : Bottle("Red wine", 10)

class White(vararg val types: String) : Bottle("White wine", 7) {
    override fun toString(): String {
        if (types.isEmpty()) {
            return "No $name"
        } else {
            return types.joinToString()
        }
    }
}

class Rose : Bottle("Rose wine", 4)

class wineList(val listNumber: Int) {
    private val bottleList = mutableListOf<Bottle>()

    fun addBottle(newBottle: Bottle) : wineList {
        bottleList.add(newBottle)
        return this
    }

}
