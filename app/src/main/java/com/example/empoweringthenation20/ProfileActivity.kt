package com.example.empoweringthenation20

import android.content.Intent
import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityProfileBinding

class ProfileActivity : BaseActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set Default Profile Info
        binding.tvUserName.text = "Guest User"
        binding.tvUserPhone.text = "000 000 0000"
        binding.tvAvatar.text = "G"

        // Button Click Actions
        binding.btnCourseFees.setOnClickListener {
            startActivity(Intent(this, CalculateFeesActivity::class.java))
        }

        binding.btnTimetable.setOnClickListener {
            // TODO: Replace with TimetableActivity when ready
        }

        binding.btnContactUs.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }

        binding.btnViewCustomers.setOnClickListener {
            startActivity(Intent(this, CustomersActivity::class.java))
        }
    }
}