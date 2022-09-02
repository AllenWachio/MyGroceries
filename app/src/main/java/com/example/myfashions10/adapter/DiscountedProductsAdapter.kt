package com.example.myfashions10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfashions10.R

class DiscountedProducts(i: Int, discountberry: Any?) {
    var context: Context? = null
    var discountedProductsList: List<DiscountedProducts?>? = null

    fun DiscountedProductAdapter(
        context: Context,
        discountedProductsList: List<DiscountedProducts?>
    ) {
        this.context = context
        this.discountedProductsList = discountedProductsList
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountedProductViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.discounted_row_items, parent, false)
        return DiscountedProductViewHolder(view)
    }



    fun getItemCount(): Int {
        return discountedProductsList!!.size
    }

    class DiscountedProductViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var discountImageView: ImageView

        init {
            discountImageView = itemView.findViewById(R.id.discountImage)
        }
    }
}