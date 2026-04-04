package com.app.foodorder.v1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.foodorder.v1.adapter.FoodListAdapter
import com.app.foodorder.v1.data.FoodRepository
import com.app.foodorder.v1.databinding.ActivityMenuListBinding

class MenuListActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMenuListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foods = FoodRepository.getFoods()
        val adapter = FoodListAdapter(this, foods)
        binding.listFoods.adapter = adapter

        // Tahap 4: klik item -> pindah ke detail pakai Intent + extras
        binding.listFoods.setOnItemClickListener { _, _, position, _ ->
            val item = foods[position]
            val intent = Intent(this, FoodDetailActivity::class.java)
            intent.putExtra(FoodDetailActivity.EXTRA_FOOD_ID, item.id)
            startActivity(intent)
        }
    }
}