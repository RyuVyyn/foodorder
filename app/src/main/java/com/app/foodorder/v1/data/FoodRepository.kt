package com.app.foodorder.v1.data

import com.app.foodorder.v1.R
import com.app.foodorder.v1.model.FoodItem

object FoodRepository {
    fun getFoods(): List<FoodItem> {
        return listOf(
            FoodItem(
                id = 1,
                name = "Nasi Goreng Spesial",
                restaurant = "Warung Nusantara",
                price = 28000,
                rating = 4.6,
                description = "Nasi goreng dengan ayam suwir, telur, dan sambal khas. Porsi mengenyangkan.",
                imageResId = R.drawable.food_1
            ),
            FoodItem(
                id = 2,
                name = "Mie Ayam Bakso",
                restaurant = "Bakso Mantap",
                price = 24000,
                rating = 4.5,
                description = "Mie ayam gurih dengan bakso sapi, sawi, dan pangsit. Cocok untuk makan siang.",
                imageResId = R.drawable.food_3
            ),
            FoodItem(
                id = 3,
                name = "Ayam Geprek",
                restaurant = "Geprek Pedas",
                price = 26000,
                rating = 4.7,
                description = "Ayam crispy digeprek dengan sambal pedas. Level pedas bisa dipilih.",
                imageResId = R.drawable.food_2
            )
        )
    }

    fun getFoodById(id: Int): FoodItem? = getFoods().find { it.id == id }
}