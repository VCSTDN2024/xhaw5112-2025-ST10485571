package com.example.empoweringthenation20

import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityAboutSubpageBinding

class About_subpage : BaseActivity() {

    private lateinit var binding: ActivityAboutSubpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutSubpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val section = intent.getStringExtra("section")

        when (section) {
            "who" -> {
                binding.subpageTitle.text = "Who We Are"
                binding.subpageContent.text = "Empowering the Nation delivers short courses designed to increase employability and entrepreneurial opportunities for learners from diverse backgrounds."
            }
            "what" -> {
                binding.subpageTitle.text = "What We Do"
                binding.subpageContent.text = "We provide hands-on training in cooking, gardening, sewing, first aid and technical skills. Our courses combine practical workshops with assessments and industry linkages."
            }
            "vision" -> {
                binding.subpageTitle.text = "Vision and Mission"
                binding.subpageContent.text = "Our mission is to empower individuals with practical skills that lead to sustainable livelihoods. Our vision is a community where everyone has the opportunity to achieve economic independence."
            }
            "impact" -> {
                binding.subpageTitle.text = "Our Impact"
                binding.subpageContent.text = "Over the years we have trained hundreds of learners and placed many in retail and local business partnerships."
            }
            "sponsors" -> {
                binding.subpageTitle.text = "Sponsors"
                binding.subpageContent.text = "ACKERMANS\nPEP\nPNP\nWOOLWORTHS\nSPAR"
            }
        }

        binding.backButton.setOnClickListener {
            finish() // Closes this activity and goes back to the previous one
        }
    }
}