package com.example.empoweringthenation20

import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityCustomersBinding

class CustomersActivity : BaseActivity() {

    private lateinit var binding: ActivityCustomersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: In the future initialize a RecyclerView here
        // to display a list of customers fetched from a database or API.
    }
}