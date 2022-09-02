package com.example.myfashions10.model

class RecentlyViewedModel {
    private var name: String? = null
    private var description: String? = null
    private var price: String? = null
    private var quantity: String? = null
    private var unit: String? = null
    private var imageUrl = 0
    private var bigimageurl = 0

    fun RecentlyViewed(
        name: String?,
        description: String?,
        price: String?,
        quantity: String?,
        unit: String?,
        imageUrl: Int,
        bigimageurl: Int
    ) {
        this.name = name
        this.description = description
        this.price = price
        this.quantity = quantity
        this.unit = unit
        this.imageUrl = imageUrl
        this.bigimageurl = bigimageurl
    }

    @JvmName("getBigimageurl1")
    fun getBigimageurl(): Int {
        return bigimageurl
    }

    @JvmName("setBigimageurl1")
    fun setBigimageurl(bigimageurl: Int) {
        this.bigimageurl = bigimageurl
    }

    @JvmName("getName1")
    fun getName(): String? {
        return name
    }

    @JvmName("setName1")
    fun setName(name: String?) {
        this.name = name
    }

    @JvmName("getDescription1")
    fun getDescription(): String? {
        return description
    }

    @JvmName("setDescription1")
    fun setDescription(description: String?) {
        this.description = description
    }

    @JvmName("getPrice1")
    fun getPrice(): String? {
        return price
    }

    @JvmName("setPrice1")
    fun setPrice(price: String?) {
        this.price = price
    }

    @JvmName("getQuantity1")
    fun getQuantity(): String? {
        return quantity
    }

    @JvmName("setQuantity1")
    fun setQuantity(quantity: String?) {
        this.quantity = quantity
    }

    @JvmName("getUnit1")
    fun getUnit(): String? {
        return unit
    }

    @JvmName("setUnit1")
    fun setUnit(unit: String?) {
        this.unit = unit
    }

    @JvmName("getImageUrl1")
    fun getImageUrl(): Int {
        return imageUrl
    }

    @JvmName("setImageUrl1")
    fun setImageUrl(imageUrl: Int) {
        this.imageUrl = imageUrl
    }
}