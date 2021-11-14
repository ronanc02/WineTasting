package com.example.winetasting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.winetasting.databinding.ActivityRecyclerviewBinding

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }

}