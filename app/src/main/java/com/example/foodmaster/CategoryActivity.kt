package com.example.foodmaster

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmaster.adapters.FoodAdapter
import com.example.foodmaster.models.Food

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_category)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val category: RecyclerView = findViewById(R.id.categoryRecycler)
        val foodList = arrayListOf<Food>()

        foodList.add(Food(1, "burger", "Burger", "Идеальный бургер для идеального дня", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"))
        foodList.add(Food(2,"pizza", "Pizza", "Отличный вариант для компании", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"))
        foodList.add(Food(3, "hotdog", "Hot Dog", "Вкусный перекус с сосиской", "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"))

        category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        category.adapter = FoodAdapter(foodList, this)

        val category2: RecyclerView = findViewById(R.id.categoryRecycler2)
        val foodList2 = arrayListOf<Food>()


        foodList2.add(Food(4, "cezar", "Цезарь", "Вкусно и полезно – легкий салат для вас", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"))
        foodList2.add(Food(5,"olivie", "Оливье", "Любимый салат с идеальным вкусом", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"))


        category2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        category2.adapter = FoodAdapter(foodList2, this)
    }

}