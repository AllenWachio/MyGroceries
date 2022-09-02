package com.example.myfashions10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductDetails : AppCompatActivity() {

    var img: ImageView? = null
    var back: ImageView? = null
    var proName: TextView? = null
    var proPrice:TextView? = null
    var proDesc:TextView? = null
    var proQty:TextView? = null
    var proUnit:TextView? = null
    var name: String? = null
    var price: String? = null
    var desc: String? = null
    var qty: String? = null
    var unit: String? = null
    var image = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)


        val i = intent

        name = i.getStringExtra("name")
        image = i.getIntExtra("image", R.drawable.b1)
        price = i.getStringExtra("price")
        desc = i.getStringExtra("desc")
        qty = i.getStringExtra("qty")
        unit = i.getStringExtra("unit")

        proName = findViewById(R.id.productName)
        proDesc = findViewById(R.id.prodDesc)
        proPrice = findViewById(R.id.prodPrice)
        img = findViewById(R.id.big_image)
        back = findViewById(R.id.back2)
        proQty = findViewById(R.id.qty)
        proUnit = findViewById(R.id.unit)

        proName!!.setText(name)
        proPrice!!.setText(price)
        proDesc!!.setText(desc)
        proQty!!.setText(qty)
        proUnit!!.setText(unit)
        img!!.setImageResource(image)


        back!!.setOnClickListener(View.OnClickListener {
            val i = Intent(this@ProductDetails, MainActivity::class.java)
            startActivity(i)
            finish()
        })

    }

    // this tutorial has been completed
    // see you in the next.
}