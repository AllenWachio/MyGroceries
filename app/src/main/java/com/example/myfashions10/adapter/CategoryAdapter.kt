package com.example.myfashions10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfashions10.R

class Category(i: Int, ic_home_fruits: Any?) {
    var context: Context? = null
    private var categoryList: List<Category?>? = null

    fun CategoryAdapter(context: Context, categoryList: List<Category?>) {
        this.context = context
        this.categoryList = categoryList
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.category_row_items, parent, false)
        return CategoryViewHolder(view)
    }

    fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryImage.setImageResource(categoryList!![position].getImageurl())
    }

    fun getItemCount(): Int {
        return categoryList!!.size
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryImage: ImageView

        init {
            categoryImage = itemView.findViewById(R.id.categoryImage)
        }
    }
}