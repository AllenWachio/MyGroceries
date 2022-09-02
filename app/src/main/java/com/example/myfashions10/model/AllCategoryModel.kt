package com.example.myfashions10.model

class AllCategoryModel(i: Int, icVeggies: Int) {

    var id: Int? = null
    private var imageurl: Int? = null

    fun AllCategoryModel(id: Int?, imageurl: Int?) {
        this.id = id
        this.imageurl = imageurl
    }

    @JvmName("getId1")
    fun getId(): Int? {
        return id
    }

    @JvmName("setId1")
    fun setId(id: Int?) {
        this.id = id
    }

    @JvmName("getImageurl1")
    fun getImageurl(): Int? {
        return imageurl
    }

    @JvmName("setImageurl1")
    fun setImageurl(imageurl: Int?) {
        this.imageurl = imageurl
    }

}