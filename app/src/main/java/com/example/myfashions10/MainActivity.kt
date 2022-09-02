package com.example.myfashions10

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfashions10.adapter.Category
import com.example.myfashions10.adapter.DiscountedProducts
import com.example.myfashions10.adapter.RecentlyViewed

class MainActivity : AppCompatActivity() {


    private var discountRecyclerView: RecyclerView? = null
    private var categoryRecyclerView:RecyclerView? = null
    private var recentlyViewedRecycler:RecyclerView? = null
    private var discountedProductAdapter: DiscountedProducts? = null
    private var discountedProductsList: List<DiscountedProducts>? = null
    private var categoryAdapter: Category? = null
    private var categoryList: List<Category>? = null
    private var recentlyViewedAdapter: RecentlyViewed? = null
    private var recentlyViewedList: List<RecentlyViewed>? = null

    private var allCategory: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        discountRecyclerView = findViewById(R.id.discountedRecycler)
        categoryRecyclerView = findViewById(R.id.categoryRecycler)
        allCategory = findViewById(R.id.allCategoryImage)
        recentlyViewedRecycler = findViewById(R.id.recently_item)


        allCategory!!.setOnClickListener {
            val i = Intent(this@MainActivity, AllCategory::class.java)
            startActivity(i)
        }

        // adding data to model

        // adding data to model
        discountedProductsList = ArrayList()
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(1, discountberry))
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(2, discountbrocoli))
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(3, discountmeat))
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(4, discountberry))
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(5, discountbrocoli))
        (discountedProductsList as ArrayList<DiscountedProducts>).add(DiscountedProducts(6, discountmeat))

        // adding data to model

        // adding data to model
        categoryList = ArrayList()
        (categoryList as ArrayList<Category>).add(Category(1, ic_home_fruits))
        (categoryList as ArrayList<Category>).add(Category(2, ic_home_fish))
        (categoryList as ArrayList<Category>).add(Category(3, ic_home_meats))
        (categoryList as ArrayList<Category>).add(Category(4, ic_home_veggies))
        (categoryList as ArrayList<Category>).add(Category(5, ic_home_fruits))
        (categoryList as ArrayList<Category>).add(Category(6, ic_home_fish))
        (categoryList as ArrayList<Category>).add(Category(7, ic_home_meats))
        (categoryList as ArrayList<Category>).add(Category(8, ic_home_veggies))

        // adding data to model

        // adding data to model
        recentlyViewedList = ArrayList()
        (recentlyViewedList as ArrayList<RecentlyViewed>).add(
            RecentlyViewed(
                "Watermelon",
                "Watermelon has high water content and also provides some fiber.",
                "₹ 80",
                "1",
                "KG",

            )
        )
        (recentlyViewedList as ArrayList<RecentlyViewed>).add(
            RecentlyViewed(
                "Papaya",
                "Papayas are spherical or pear-shaped fruits that can be as long as 20 inches.",
                "₹ 85",
                "1",
                "KG",

            )
        )
        (recentlyViewedList as ArrayList<RecentlyViewed>).add(
            RecentlyViewed(
                "Strawberry",
                "The strawberry is a highly nutritious fruit, loaded with vitamin C.",
                "₹ 30",
                "1",
                "KG",
                card2,
                b1
            )
        )
        recentlyViewedList.add(
            RecentlyViewed(
                "Kiwi",
                "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.",
                "₹ 30",
                "1",
                "PC",
                card1,
                b2
            )
        )

        setDiscountedRecycler(discountedProductsList as ArrayList<DiscountedProducts>)
        setCategoryRecycler(categoryList as ArrayList<Category>)
        setRecentlyViewedRecycler(recentlyViewedList as ArrayList<RecentlyViewed>)

    }

    private fun setDiscountedRecycler(dataList: List<DiscountedProducts>) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        discountRecyclerView!!.layoutManager = layoutManager
        discountedProductAdapter = DiscountedProducts(this, dataList)
        discountRecyclerView!!.adapter = discountedProductAdapter
    }


    private fun setCategoryRecycler(categoryDataList: List<Category>) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        categoryRecyclerView!!.layoutManager = layoutManager
        categoryAdapter = Category(this, categoryDataList)
        categoryRecyclerView!!.adapter = categoryAdapter
    }

    private fun setRecentlyViewedRecycler(recentlyViewedDataList: List<RecentlyViewed>) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recentlyViewedRecycler!!.layoutManager = layoutManager
        recentlyViewedAdapter = RecentlyViewed(this, recentlyViewedDataList)
        recentlyViewedRecycler!!.adapter = recentlyViewedAdapter
    }
    //Now again we need to create a adapter and model class for recently viewed items.
    // lets do it fast.
}