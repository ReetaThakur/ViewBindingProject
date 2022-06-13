package com.reeta.viewbindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reeta.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnClick.text = "change"
            btnSetButton.setOnClickListener {
                tvName.text="reeta"
            }
        }
    }
}