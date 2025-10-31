package com.example.empoweringthenation20

import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityLessonBinding

class LessonActivity : BaseActivity() {

    private lateinit var binding: ActivityLessonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lessonText = intent.getStringExtra("lesson")
        binding.textLesson.text = lessonText

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}