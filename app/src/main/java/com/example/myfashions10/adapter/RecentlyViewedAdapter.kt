package com.example.myfashions10.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myfashions10.R

class RecentlyViewed(
    s: String,
    s1: String,
    s2: String,
    s3: String,
    s4: String,
    card1: Any?,
    b2: Any?
) {
    var context: Context? = null
    private var recentlyViewedList: List<RecentlyViewed?>? = null

    fun RecentlyViewedAdapter(context: Context, recentlyViewedList: List<RecentlyViewed?>) {
        this.context = context
        this.recentlyViewedList = recentlyViewedList
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentlyViewedViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.recently_viewed_items, parent, false)
        return RecentlyViewedViewHolder(view)
    }

    fun onBindViewHolder(holder: RecentlyViewedViewHolder, position: Int) {
        holder.name.setText(recentlyViewedList!![position].getName())
        holder.description.setText(recentlyViewedList!![position].getDescription())
        holder.price.setText(recentlyViewedList!![position].getPrice())
        holder.qty.setText(recentlyViewedList!![position].getQuantity())
        holder.unit.setText(recentlyViewedList!![position].getUnit())
        holder.bg.setBackgroundResource(recentlyViewedList!![position].getImageUrl())
        holder.itemView.setOnClickListener {
            val i = Intent(context, ProductDetails::class.java)
            i.putExtra("name", recentlyViewedList!![position].getName())
            i.putExtra("image", recentlyViewedList!![position].getBigimageurl())
            i.putExtra("price", recentlyViewedList!![position].getPrice())
            i.putExtra("desc", recentlyViewedList!![position].getDescription())
            i.putExtra("qty", recentlyViewedList!![position].getQuantity())
            i.putExtra("unit", recentlyViewedList!![position].getUnit())
            context!!.startActivity(i)
        }
    }

    fun getItemCount(): Int {
        return recentlyViewedList!!.size
    }

    class RecentlyViewedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var description: TextView
        var price: TextView
        var qty: TextView
        var unit: TextView
        var bg: ConstraintLayout

        init {
            name = itemView.findViewById(R.id.product_name)
            description = itemView.findViewById(R.id.description)
            price = itemView.findViewById(R.id.price)
            qty = itemView.findViewById(R.id.qty)
            unit = itemView.findViewById(R.id.unit)
            bg = itemView.findViewById(R.id.recently_layout)
        }
    }
}