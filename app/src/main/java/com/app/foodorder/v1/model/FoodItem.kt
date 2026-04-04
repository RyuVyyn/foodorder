package com.app.foodorder.v1.model

data class FoodItem(
    val id: Int,
    val name: String,
    val restaurant: String,
    val price: Int,
    val rating: Double,
    val description: String,
    val imageResId: Int
)