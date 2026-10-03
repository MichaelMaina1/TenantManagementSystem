package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {

            val tenant = Tenant(
                name = binding.tenantNameEditText.text.toString(),
                phone = binding.phoneEditText.text.toString(),
                rent = binding.rentEditText.text.toString()
            )

            binding.tenant = tenant
        }
    }
}