package com.example.winetasting.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wine(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    ) {

}