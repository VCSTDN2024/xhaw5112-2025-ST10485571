package com.example.empoweringthenation20

import android.content.Intent
import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityAboutBinding

class AboutActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWhoWeAre.setOnClickListener {
            openSubpage("who")
        }
        binding.btnWhatWeDo.setOnClickListener {
            openSubpage("what")
        }
        binding.btnVisionMission.setOnClickListener {
            openSubpage("vision")
        }
        binding.btnOurImpact.setOnClickListener {
            openSubpage("impact")
        }
        binding.btnSponsors.setOnClickListener {
            openSubpage("sponsors")
        }
    }

    private fun openSubpage(section: String) {
        val intent = Intent(this, About_subpage::class.java)
        intent.putExtra("section", section)
        startActivity(intent)
    }
}