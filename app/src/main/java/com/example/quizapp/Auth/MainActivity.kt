package com.example.quizapp.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.Model.QuestionsSource
import com.example.quizapp.Questions.QuestionsActivity
import com.example.quizapp.ResultActivity
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _binding : ActivityMainBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val start = binding.btnStart
        start.setOnClickListener {
            if(binding.username.text.isEmpty()) {
                Toast.makeText(this,"Please enter username",Toast.LENGTH_SHORT).show()
            }
            else{
                    val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(QuestionsSource.username,binding.username.text.toString())
                startActivity(intent)
            }
            }
        binding.btnLeaderboard.setOnClickListener {
            val Intent =  Intent(this, ResultActivity::class.java)
            startActivity(Intent)
        }
        binding.btnHome.setOnClickListener {
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}