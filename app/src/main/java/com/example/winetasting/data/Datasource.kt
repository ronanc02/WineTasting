package com.example.winetasting.data

import com.example.winetasting.R
import com.example.winetasting.model.Wine

class Datasource {
    fun loadWines(): List<Wine> {
        return listOf<Wine>(
            Wine(R.string.wine1, R.drawable.image1),
            Wine(R.string.wine2, R.drawable.image2),
            Wine(R.string.wine3, R.drawable.image3),
            Wine(R.string.wine4, R.drawable.image4),
            Wine(R.string.wine5, R.drawable.image5),
            Wine(R.string.wine6, R.drawable.image6),
            Wine(R.string.wine7, R.drawable.image7),
            Wine(R.string.wine8, R.drawable.image8),
            Wine(R.string.wine9, R.drawable.image9),
            Wine(R.string.wine10, R.drawable.image10),
        )
    }
}