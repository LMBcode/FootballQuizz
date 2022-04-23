package com.example.quizapp.Questions

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.quizapp.Model.QuestionsSource
import com.example.quizapp.R
import com.example.quizapp.ResultActivityNba
import com.example.quizapp.databinding.ActivityQuestionsBinding

class NbaActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var _binding : ActivityQuestionsBinding
    private val binding get() = _binding
    private  var mCurrentPosition : Int = 1
    private var mSelectedPosition : Int = 0
    private var mQuestionsList : List<Questions>? = null
    private var mCorrectAnswers = 0
    private var mUsername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mQuestionsList = QuestionsSource.getNbaQuestions()
        mUsername = intent.getStringExtra(QuestionsSource.nUsername)
        getQuestion()


        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
        binding.sumbit.setOnClickListener(this)
    }

    private fun getQuestion(){
        val question = mQuestionsList?.get(mCurrentPosition - 1)
        if (mCurrentPosition == mQuestionsList!!.size){
            binding.sumbit.text = "END"
        }
        else{
            binding.sumbit.text = "SUMBIT"
        }
        binding.Question.text = question?.question
        binding.option1.text = question?.optionA
        binding.option2.text = question?.optionB
        binding.option3.text = question?.optionC
        binding.option4.text = question?.optionD
        question?.image?.let { binding.image.setImageResource(it) }
        defaultOption()
        binding.progressBarr.max = 10
        binding.progressBarr.progress = mCurrentPosition
        binding.progresstext.text = "$mCurrentPosition" + "/" + 10
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


    private fun selectedOption(view: TextView , selectedOptionNumber : Int){
        defaultOption()
        mSelectedPosition = selectedOptionNumber
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface,Typeface.BOLD)
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option1 ->{selectedOption(binding.option1,1)}
            R.id.option2 ->{selectedOption(binding.option2,2)}
            R.id.option3 ->{selectedOption(binding.option3,3)}
            R.id.option4 ->{selectedOption(binding.option4,4)}
            R.id.sumbit ->{
                if (mSelectedPosition == 0) {
                    mCurrentPosition++
                    when {
                        // Move to the next question when the current position is smaller than the size of questions
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            getQuestion()
                        }
                        else -> {
                            val Intent = Intent(this, ResultActivityNba::class.java)
                            Intent.putExtra(QuestionsSource.nCorrectAnswer, mCorrectAnswers)
                            Intent.putExtra(QuestionsSource.nUsername, mUsername)
                            startActivity(Intent)
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if (question!!.correctAnswer != mSelectedPosition ){
                        answerView(mSelectedPosition, R.drawable.wrong_option_bg)
                    }
                    else{mCorrectAnswers++}
                        answerView(question.correctAnswer, R.drawable.correct_option_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.sumbit.text = "FINISH"
                    }else{
                        binding.sumbit.text = "NEXT QUESTION"
                    }
                    mSelectedPosition = 0
                }
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


}