package com.example.winetasting.data

import com.example.winetasting.R
import com.example.winetasting.model.Wine

class Datasource {
    fun loadWines(): List<Wine> {
        return listOf<Wine>(
            Wine(R.string.wine1),
            Wine(R.string.wine2),
            Wine(R.string.wine3),
            Wine(R.string.wine4),
            Wine(R.string.wine5),
            Wine(R.string.wine6),
            Wine(R.string.wine7),
            Wine(R.string.wine8),
            Wine(R.string.wine9),
            Wine(R.string.wine10),
        )
    }
}