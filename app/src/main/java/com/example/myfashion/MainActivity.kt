package com.example.myfashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myFashion.adapter.FashionAdapter
import com.example.myFashion.data.Datasource



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Data source
        val FashionList = Datasource().loadFashion()

        // adapter
        val adapter = FashionAdapter(FashionList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_fashion)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}