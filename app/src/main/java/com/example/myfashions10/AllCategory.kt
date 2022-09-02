package com.example.myfashions10

import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.myfashions10.R.drawable
import com.example.myfashions10.adapter.AllCategory
import com.example.myfashions10.model.AllCategoryModel

class AllCategory : AppCompatActivity() {


    private lateinit var AllCategoryRecycler: RecyclerView
    var allCategoryAdapter: AllCategory? = null
    var allCategoryModelList: List<AllCategoryModel>? = null

    var back: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_category)

        AllCategoryRecycler = findViewById<RecyclerView>(R.id.all_category)
        back = findViewById<ImageView>(R.id.back)


        back!!.setOnClickListener {
            val back = Intent(this@AllCategory, MainActivity::class.java)
            startActivity(back)
            finish()
        }


        // adding data to model

        // adding data to model
        allCategoryModelList = ArrayList<AllCategoryModel>()
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(1, drawable.ic_fruits))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(2, drawable.ic_veggies))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(3, drawable.ic_meat))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(4, drawable.ic_fish))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(5, drawable.ic_spices))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(6, drawable.ic_egg))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(7, drawable.ic_drink))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(8, drawable.ic_cookies))
        (allCategoryModelList as ArrayList<AllCategoryModel>).add(AllCategoryModel(8, drawable.ic_juce))


        setCategoryRecycler(allCategoryModelList as ArrayList<AllCategoryModel>)
    }
    private fun setCategoryRecycler(allcategoryModelList: List<AllCategoryModel>) {
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 4)
        AllCategoryRecycler.layoutManager = layoutManager
        AllCategoryRecycler.addItemDecoration(GridSpacingItemDecoration(4, dpToPx(16), true))
        AllCategoryRecycler.itemAnimator = DefaultItemAnimator()
        AllCategory(this, allcategoryModelList).also { allCategoryAdapter = it }
        allCategoryAdapter.also { AllCategoryRecycler.adapter = it }
    }

    // now we need some item decoration class for manage spacing

    // now we need some item decoration class for manage spacing
    class GridSpacingItemDecoration(
        private val spanCount: Int,
        private val spacing: Int,
        private val includeEdge: Boolean
    ) :
        ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            val position = parent.getChildAdapterPosition(view) // item position
            val column = position % spanCount // item column
            if (includeEdge) {
                outRect.left =
                    spacing - column * spacing / spanCount // spacing - column * ((1f / spanCount) * spacing)
                outRect.right =
                    (column + 1) * spacing / spanCount // (column + 1) * ((1f / spanCount) * spacing)
                if (position < spanCount) { // top edge
                    outRect.top = spacing
                }
                outRect.bottom = spacing // item bottom
            } else {
                outRect.left = column * spacing / spanCount // column * ((1f / spanCount) * spacing)
                outRect.right =
                    spacing - (column + 1) * spacing / spanCount // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private fun dpToPx(dp: Int): Int {
        val r = resources
        return Math.round(
            TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp.toFloat(),
                r.displayMetrics
            )
        )
    }
}