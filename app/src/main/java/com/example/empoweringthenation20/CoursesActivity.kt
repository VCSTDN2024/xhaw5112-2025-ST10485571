package com.example.empoweringthenation20

import android.content.Intent
import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityCoursesBinding

class CoursesActivity : BaseActivity() {

    private lateinit var binding: ActivityCoursesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup First Aid Card
        val firstAidTitle = "First Aid Basics"
        binding.cardFirstAid.tvCourseTitleItem.text = firstAidTitle
        binding.cardFirstAid.imgCourseItem.setImageResource(R.drawable.kit22)
        binding.cardFirstAid.btnViewCourseItem.setOnClickListener {
            openCourse(firstAidTitle)
        }

        // Setup Gardening Card
        val gardeningTitle = "Organic Gardening"
        binding.cardGardening.tvCourseTitleItem.text = gardeningTitle
        binding.cardGardening.imgCourseItem.setImageResource(R.drawable.gardening)
        binding.cardGardening.btnViewCourseItem.setOnClickListener {
            openCourse(gardeningTitle)
        }

        // Setup Cooking Card
        val cookingTitle = "Advanced Cooking"
        binding.cardCooking.tvCourseTitleItem.text = cookingTitle
        binding.cardCooking.imgCourseItem.setImageResource(R.drawable.cooking)
        binding.cardCooking.btnViewCourseItem.setOnClickListener {
            openCourse(cookingTitle)
        }

        // Setup Landscaping Card
        val landscapingTitle = "Landscaping Design"
        binding.cardLandscaping.tvCourseTitleItem.text = landscapingTitle
        binding.cardLandscaping.imgCourseItem.setImageResource(R.drawable.landscaping)
        binding.cardLandscaping.btnViewCourseItem.setOnClickListener {
            openCourse(landscapingTitle)
        }

        // Setup Pediatric First Aid Card
        val pediatricTitle = "Pediatric First Aid"
        binding.cardPediatricFirstAid.tvCourseTitleItem.text = pediatricTitle
        // TODO: Add R.drawable.pediatric_first_aid_image
        binding.cardPediatricFirstAid.imgCourseItem.setImageResource(R.drawable.pediatric_first_aid)
        binding.cardPediatricFirstAid.btnViewCourseItem.setOnClickListener {
            openCourse(pediatricTitle)
        }

        // Setup Basic Sewing Card
        val sewingTitle = "Basic Sewing"
        binding.cardBasicSewing.tvCourseTitleItem.text = sewingTitle
        // TODO: Add R.drawable.sewing_image
        binding.cardBasicSewing.imgCourseItem.setImageResource(R.drawable.sewing)
        binding.cardBasicSewing.btnViewCourseItem.setOnClickListener {
            openCourse(sewingTitle)
        }
    }

    private fun openCourse(courseName: String) {
        val intent = Intent(this, CourseDetails1::class.java)
        intent.putExtra("courseName", courseName)
        startActivity(intent)
    }
}
