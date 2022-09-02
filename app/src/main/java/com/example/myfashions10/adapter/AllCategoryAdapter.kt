package com.example.myfashions10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfashions10.R
import com.example.myfashions10.model.AllCategoryModel

class AllCategory {
    var context: Context? = null
    private lateinit var categoryList: List<AllCategoryModel?>

    fun AllCategoryAdapter(context: Context, categoryList: List<AllCategoryModel?>) {
        this.context = context
        this.categoryList = categoryList;
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllCategoryViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.all_category_row_items, parent, false)
        return AllCategoryViewHolder(view)
    }

    fun onBindViewHolder(holder: AllCategoryViewHolder, position: Int) {
        categoryList!![position]!!.getImageurl()?.let { holder.categoryImage.setImageResource(it) }
    }

    fun getItemCount(): Int {
        return categoryList!!.size
    }

    class AllCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryImage: ImageView

        init {
            categoryImage = itemView.findViewById(R.id.categoryImage)
        }
    }
}