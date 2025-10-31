package com.example.empoweringthenation20

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseActivity : AppCompatActivity() {

    override fun setContentView(view: View?) {
        super.setContentView(view)
        setupBottomNav()
    }

    private fun setupBottomNav() {
        // Find the BottomNavigationView using the ID we set in the <include> tag
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Safety check to prevent crashes if the view isn't found
        if (bottomNavigationView != null) {
            // This prevents the listener from being called when we programmatically set the selected item
            bottomNavigationView.setOnItemSelectedListener(null)

            // Set the correct item as selected based on the current activity
            when (this) {
                is MainActivity -> bottomNavigationView.selectedItemId = R.id.nav_home
                is CoursesActivity -> bottomNavigationView.selectedItemId = R.id.nav_courses
                is AboutActivity, is About_subpage -> bottomNavigationView.selectedItemId = R.id.nav_about
                is ProfileActivity, is ContactActivity, is CalculateFeesActivity -> bottomNavigationView.selectedItemId = R.id.nav_profile
            }

            // Set the listener that handles user taps
            bottomNavigationView.setOnItemSelectedListener { item ->
                val intent = when (item.itemId) {
                    R.id.nav_home -> Intent(this, MainActivity::class.java)
                    R.id.nav_courses -> Intent(this, CoursesActivity::class.java)
                    R.id.nav_about -> Intent(this, AboutActivity::class.java)
                    R.id.nav_profile -> Intent(this, ProfileActivity::class.java)
                    else -> null
                }

                if (intent != null && item.itemId != bottomNavigationView.selectedItemId) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                    finish()
                }
                true
            }
        }
    }
}