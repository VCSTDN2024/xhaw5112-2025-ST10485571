package com.example.empoweringthenation20

import android.os.Bundle
import android.widget.Toast
import com.example.empoweringthenation20.databinding.ActivityCalculateFeesBinding

class CalculateFeesActivity : BaseActivity() {

    private lateinit var binding: ActivityCalculateFeesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateFeesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            calculateAndDisplayFees()
        }
    }

    private fun calculateAndDisplayFees() {
        val name = binding.tilName.editText?.text.toString().trim()
        val phone = binding.tilPhone.editText?.text.toString().trim()
        val email = binding.tilEmail.editText?.text.toString().trim()

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please enter all customer details", Toast.LENGTH_SHORT).show()
            return
        }

        val selectedCourses = mutableListOf<Int>()
        if (binding.cbFirstAid.isChecked) selectedCourses.add(1200)
        if (binding.cbGardening.isChecked) selectedCourses.add(1000)
        if (binding.cbLandscaping.isChecked) selectedCourses.add(2500)
        // Updated Cooking price
        if (binding.cbCooking.isChecked) selectedCourses.add(1750)
        // Added new courses
        if (binding.cbPediatricFirstAid.isChecked) selectedCourses.add(1200)
        if (binding.cbSewing.isChecked) selectedCourses.add(1500)


        if (selectedCourses.isEmpty()) {
            Toast.makeText(this, "Please select at least one course", Toast.LENGTH_SHORT).show()
            return
        }

        val total = selectedCourses.sum()
        val discountRate = when (selectedCourses.size) {
            2 -> 0.05
            3 -> 0.10
            // Updated discount logic to apply 15% for 4 or more
            else -> if (selectedCourses.size >= 4) 0.15 else 0.0
        }
        val discountedTotal = total - (total * discountRate)
        val finalTotal = discountedTotal * 1.15 // 15% VAT

        binding.tvResult.text = """
            Customer: $name
            Phone: $phone
            Email: $email

            Courses Selected: ${selectedCourses.size}
            Discount Applied: ${(discountRate * 100).toInt()}%
            Final Total (incl. VAT): R${String.format("%.2f", finalTotal)}
        """.trimIndent()
    }
}
