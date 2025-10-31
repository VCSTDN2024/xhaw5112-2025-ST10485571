package com.example.empoweringthenation20

import android.content.Intent
import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityCourseDetails1Binding

class CourseDetails1 : BaseActivity() {

    private lateinit var binding: ActivityCourseDetails1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseDetails1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val courseName = intent.getStringExtra("courseName")
        binding.txtCourseTitle.text = courseName

        var aboutText = ""
        var lesson1Text = ""
        var lesson2Text = ""
        var lesson3Text = ""

        when (courseName) {
            "First Aid Basics" -> {
                binding.imgCourse.setImageResource(R.drawable.kit22)
                aboutText = "This First Aid Basic course will introduce you to the fundamentals and practical skills required to be confident in this field. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Emergency response and CPR basics — how to assess a scene, call for help and perform CPR."
                lesson2Text = "Lesson 2: Wound care & bandaging — cleaning wounds, dressing techniques and infection prevention."
                lesson3Text = "Lesson 3: Burns, Breaks & Bites — learn to identify and provide initial care for common household injuries like burns, suspected fractures, and insect/animal bites."
            }
            "Organic Gardening" -> {
                binding.imgCourse.setImageResource(R.drawable.gardening)
                aboutText = "This Organic Gardening course will introduce you to the fundamentals and practical skills required to be confident in this field. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Soil health & composting — understand soil structure, compost making, and natural fertilizers."
                lesson2Text = "Lesson 2: Planting & pest control — seasonal planting, companion planting and eco-friendly pest management."
                lesson3Text = "Lesson 3: Harvesting & Seed Saving — learn the proper techniques for harvesting produce to maximize yield and how to collect and store seeds for the next season."
            }
            "Advanced Cooking" -> {
                binding.imgCourse.setImageResource(R.drawable.cooking)
                aboutText = "This Advanced Cooking course will introduce you to the fundamentals and practical skills required to be confident in this field. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Knife skills & ingredient prep — learn safe knife handling, chopping, and mise en place techniques used in professional kitchens."
                lesson2Text = "Lesson 2: Sauces & flavour building — basic mother sauces, seasoning, and techniques to balance flavours."
                lesson3Text = "Lesson 3: Plating & Presentation — understand the principles of food presentation, color theory, and modern plating techniques to make your dishes look as good as they taste."
            }
            "Landscaping Design" -> {
                binding.imgCourse.setImageResource(R.drawable.landscaping)
                aboutText = "This Landscaping course will introduce you to the fundamentals and practical skills required to be confident in this field. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Garden design basics — space planning, plant selection, and focal points."
                lesson2Text = "Lesson 2: Hardscaping & maintenance — basic pathways, edging, and seasonal maintenance tips."
                lesson3Text = "Lesson 3: Water-Wise Gardening — explore principles of xeriscaping, selecting drought-tolerant plants, and setting up simple, efficient irrigation."
            }
            "Pediatric First Aid" -> {
                binding.imgCourse.setImageResource(R.drawable.pediatric_first_aid)
                aboutText = "This Pediatric First Aid course will introduce you to the fundamentals and practical skills required to be confident in this field, focusing on child-specific care. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Child & infant CPR — learn the specific techniques for performing CPR and using an AED on children and infants."
                lesson2Text = "Lesson 2: Common childhood emergencies — managing choking, allergic reactions, fevers, and injuries common to young children."
                lesson3Text = "Lesson 3: Home Safety & Accident Prevention — learn to identify common household hazards for children and implement strategies for creating a safer home environment."
            }
            "Basic Sewing" -> {
                binding.imgCourse.setImageResource(R.drawable.sewing)
                aboutText = "This Basic Sewing course will introduce you to the fundamentals and practical skills required to be confident in this field. Practical activities and assessments included."
                lesson1Text = "Lesson 1: Machine basics & stitching — how to thread a sewing machine, adjust tension, and sew straight, curved, and corner stitches."
                lesson2Text = "Lesson 2: Simple repairs & projects — learn to mend seams, sew on buttons, and complete a simple project like a pillowcase or tote bag."
                lesson3Text = "Lesson 3: Working with Patterns — introduction to reading and using a simple sewing pattern, including layout, cutting fabric, and understanding pattern symbols."
            }
        }

        binding.txtAbout.text = aboutText

        binding.btnLess1.setOnClickListener {
            openLesson(lesson1Text)
        }
        binding.btnLess2.setOnClickListener {
            openLesson(lesson2Text)
        }
        binding.btnLess3.setOnClickListener {
            openLesson(lesson3Text)
        }

        binding.btnCalcFees.setOnClickListener {
            startActivity(Intent(this, CalculateFeesActivity::class.java))
        }
    }

    private fun openLesson(lessonContent: String) {
        startActivity(Intent(this, LessonActivity::class.java).putExtra("lesson", lessonContent))
    }
}
