package com.example.myFashion.data

import com.example.myFashion.model.Fashion
import com.example.myfashion.R

class Datasource {

    // list of items
    fun loadFashion() : List<Fashion>{
        return listOf(
            Fashion(R.string.Fashion1, R.drawable.image1),
            Fashion(R.string.Fashion2, R.drawable.image2),
            Fashion(R.string.Fashion3, R.drawable.image3),
            Fashion(R.string.Fashion4, R.drawable.image4),
            Fashion(R.string.Fashion5, R.drawable.image5),
        )
    }
}