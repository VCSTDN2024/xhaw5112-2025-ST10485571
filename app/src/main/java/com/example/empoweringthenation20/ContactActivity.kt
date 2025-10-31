package com.example.empoweringthenation20

import android.os.Bundle
import com.example.empoweringthenation20.databinding.ActivityContactBinding

class ContactActivity : BaseActivity() {

    private lateinit var binding: ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Populate Location 1
        binding.location1.tvLocationTitle.text = "Main Branch - Edenvale"
        binding.location1.tvLocationAddress.text = "93 Lucky Bean Street, Edenvale"
        // TODO: Set a real map image for location 1
        // binding.location1.imgLocationMap.setImageResource(R.drawable.map_edenvale)

        // Populate Location 2
        binding.location2.tvLocationTitle.text = "Fourways Branch"
        binding.location2.tvLocationAddress.text = "168 Nonscot Street, Fourways, Sandton"
        // TODO: Set a real map image for location 2

        // Populate Location 3
        binding.location3.tvLocationTitle.text = "Sandton Office"
        binding.location3.tvLocationAddress.text = "2 Maude St, Sandown, Sandton"
        // TODO: Set a real map image for location 3
    }
}