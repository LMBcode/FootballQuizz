package com.example.quizapp.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityCategoriesBinding
import com.example.quizapp.flags.QuestionsActivityFlags

class CategoriesActivity : AppCompatActivity() {
    private lateinit var _binding : ActivityCategoriesBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.football.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
        binding.nba.setOnClickListener {
            val Intent = Intent(this, NbaAuth::class.java)
            startActivity(Intent)
        }
        binding.flag.setOnClickListener {
            val Intent = Intent(this,QuestionsActivityFlags::class.java)
            startActivity(Intent)
        }

    }



}