package dev.lucy.fibonacci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lucy.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()
    }

    fun displayNumbers() {
        var numberList = mutableListOf(0, 1)
        var result = 0
        var i = 1
        for (k in 1..100) {
            result = numberList[i] + numberList[i - 1]
            numberList.add(result)
            i++
        }
        var numbersAdapter = NumbersRecyclerViewAdapter(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numbersAdapter


    }
}
