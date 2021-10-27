package com.example.fragment_cahyo_06.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_cahyo_06.R
import com.example.fragment_cahyo_06.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var binding : FragmentSettingsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        Toast.makeText(activity, "Yah, lagi maintenace nih!", Toast.LENGTH_LONG).show()
    }

}