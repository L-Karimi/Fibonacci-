package dev.lucy.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
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
        val n = 10
        var t1 = 0
        var t2 = 1

        print("First $n terms: ")

        for (i in 1..n) {
            print("$t1 + ")

            val sum = t1 + t2
            t1 = t2
            t2 = sum
            var numbersAdapter=NumbersRecyclerViewAdapter(numbersList )
            binding.rvNumbers.layoutManager= LinearLayoutManager(this)
            binding.rvNumbers.adapter=numbersAdapter
        }
    }
}