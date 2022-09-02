package com.example.myfashions10.model

class CategoryModel {
    var id = null
    var imageurl: Int? = null

    fun Category(id: Int?, imageurl: Int?) {
        this.id = id as Nothing?
        this.imageurl = imageurl
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id as Nothing?
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