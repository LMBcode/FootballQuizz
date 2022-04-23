package com.example.quizapp.Questions

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quizapp.Model.QuestionsSource
import com.example.quizapp.R
import com.example.quizapp.ResultActivity
import com.example.quizapp.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentQuestion : Int = 1
    private var mQuestionsList : List<Questions>? = null
    private var mSelectedOption : Int = 0
    private var mCorrectAnswers : Int = 0
    private var mUsername : String? = null
    private lateinit var _binding : ActivityQuestionsBinding
    private val binding get() =  _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = QuestionsSource.getQuestions()
        setQuestion()
        mUsername = intent.getStringExtra(QuestionsSource.username)


        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
        binding.sumbit.setOnClickListener(this)

    }
    private fun setQuestion(){
        val question = mQuestionsList!![mCurrentQuestion-1]
        defaultOption()
        if(mCurrentQuestion == mQuestionsList!!.size){
            binding.sumbit.text = "FINISH"
        }else{binding.sumbit.text = "SUMBIT"}
        binding.apply {
            Question.text = question.question
            option1.text = question.optionA
            option2.text = question.optionB
            option3.text = question.optionC
            option4.text = question.optionD
            image.setImageResource(question.image)
        }
        binding.progressBarr.progress = mCurrentQuestion
        binding.progresstext.text = "$mCurrentQuestion" + "/" + binding.progressBarr.max


    }
    private fun defaultOption(){
        val options = ArrayList<TextView>()
        options.add(0,binding.option1)
        options.add(1,binding.option2)
        options.add(2,binding.option3)
        options.add(3,binding.option4)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option1 -> {
                selectedOption(binding.option1, 1)
            }
            R.id.option2 -> {
                selectedOption(binding.option2, 2)
            }
            R.id.option3 -> {
                selectedOption(binding.option3, 3)
            }
            R.id.option4 -> {
                selectedOption(binding.option4, 4)
            }
           R.id.sumbit -> {
                if(mSelectedOption == 0){
                    mCurrentQuestion ++

                    when {
                        mCurrentQuestion <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else -> {
                            val Intent = Intent(this, ResultActivity::class.java)
                            Intent.putExtra(QuestionsSource.correctAnswer,mCorrectAnswers)
                            Intent.putExtra(QuestionsSource.username,mUsername)
                        startActivity(Intent)
                        }
                    }
                }
                else{
                    val question = mQuestionsList?.get(mCurrentQuestion-1)
                    if(question!!.correctAnswer != mSelectedOption){
                        answerView(mSelectedOption, R.drawable.wrong_option_bg)
                    }
                    else{mCorrectAnswers++}
                    answerView(question.correctAnswer, R.drawable.correct_option_bg)


                    if(mCurrentQuestion == mQuestionsList!!.size){
                        binding.sumbit.text = "FINISH"
                    }else{
                        binding.sumbit.text = "NEXT QUESTION"
                    }
                    mSelectedOption = 0

                }
            }
        }
    }
    private fun sumbit() {
        binding.sumbit.setOnClickListener {
            if (mSelectedOption == 0) {
                mCurrentQuestion++

                when {
                    mCurrentQuestion <= mQuestionsList!!.size -> {
                        setQuestion()
                    }
                    else -> {
                        Toast.makeText(this, "Quiz Completed!", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                val question = mQuestionsList?.get(mCurrentQuestion - 1)
                if (question!!.correctAnswer != mSelectedOption) {
                    answerView(mSelectedOption, R.drawable.wrong_option_bg)
                }
                answerView(question.correctAnswer, R.drawable.correct_option_bg)
                if (mCurrentQuestion == mQuestionsList!!.size) {
                    binding.sumbit.text = "FINISH"
                } else {
                    binding.sumbit.text = "NEXT QUESTION"
                }
                mSelectedOption = 0
            }
        }
    }
    private fun answerView(answer : Int , drawableView : Int){
        when(answer){
            1-> {
                binding.option1.background = ContextCompat.getDrawable(this, drawableView)
                binding.option1.setTextColor(Color.parseColor("#FFFFFF"))
            }
            2-> {
                binding.option2.background = ContextCompat.getDrawable(this, drawableView)
                binding.option2.setTextColor(Color.parseColor("#FFFFFF"))
            }
            3-> {
                binding.option3.background = ContextCompat.getDrawable(this, drawableView)
                binding.option3.setTextColor(Color.parseColor("#FFFFFF"))
            }
            4-> {
                binding.option4.background = ContextCompat.getDrawable(this, drawableView)
                binding.option4.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
    }
    private fun selectedOption(view: TextView , selectedOptionNumber : Int){
        defaultOption()
        mSelectedOption = selectedOptionNumber
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface,Typeface.BOLD)
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }
}