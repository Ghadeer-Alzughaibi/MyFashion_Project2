package com.example.myFashion.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myFashion.model.Fashion
import com.example.myfashion.R



// - Bind data with views
// - send list of data to RecyclerView
class FashionAdapter(
    private val dataset: List<Fashion>,
    private val context: Context
)
    : RecyclerView.Adapter<FashionAdapter.FashionViewHolder>() {

    // Adapter helper class to arrange data in layout file
    class FashionViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    // 3 functions
    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FashionViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return FashionViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: FashionViewHolder, position: Int) {
        // save the position of them (which item i'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.FashionStringId)
        holder.imageView.setImageResource(item.FashionImageId)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size


}