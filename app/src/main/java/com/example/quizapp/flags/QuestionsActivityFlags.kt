package com.example.quizapp.flags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.quizapp.Model.Flags
import com.example.quizapp.Model.QuestionsSource
import com.example.quizapp.R
import com.example.quizapp.ResultActivity
import com.example.quizapp.databinding.ActivityQuestionsflagsBinding

class QuestionsActivityFlags : AppCompatActivity(), View.OnClickListener {

    private var mCurrentQuestion : Int = 1
    private var mQuestionsList : List<Flags>? = null
    private var mSelectedOption : Int = 0
    private var mCorrectAnswers : Int = 0
    private var mUsername : String? = null
    private lateinit var _binding : ActivityQuestionsflagsBinding
    private val binding get() =  _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityQuestionsflagsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mQuestionsList = QuestionsSource.guessFlags()
        Log.d("TAG",mQuestionsList?.size.toString())
        Log.d("TAG1",mCorrectAnswers.toString())
        setQuestion()
        mUsername = intent.getStringExtra(QuestionsSource.username)
        binding.sumbit.setOnClickListener(this)

    }
    private fun setQuestion(){
        val question = mQuestionsList!![mCurrentQuestion-1]
        if(mCurrentQuestion == mQuestionsList!!.size){
            binding.sumbit.text = "FINISH"
        }else{binding.sumbit.text = "SUMBIT"}
        binding.apply {
            image.setImageResource(question.flag)
        }
        binding.guess.visibility = View.VISIBLE
        binding.progressBarr.progress = mCurrentQuestion
        binding.progresstext.text = "$mCurrentQuestion" + "/" + binding.progressBarr.max


    }
    override fun onClick(v: View?) {
        when(v?.id){
           R.id.sumbit -> {
               if (binding.guess.text.toString() == "") {
                   mCurrentQuestion++
                   when {
                       mCurrentQuestion <= mQuestionsList!!.size -> {
                           setQuestion()
                       }
                       else -> {
                           val Intent = Intent(this, ResultActivity::class.java)
                           Intent.putExtra(QuestionsSource.correctAnswer, mCorrectAnswers)
                           Intent.putExtra(QuestionsSource.username, mUsername)
                           startActivity(Intent)
                       }
                   }
               } else {
                   val question = mQuestionsList?.get(mCurrentQuestion - 1)
                   if (question!!.country != binding.guess.text.toString()) {
                       val alertDialog = AlertDialog.Builder(this)
                       alertDialog.setTitle("Incorrect")
                       alertDialog.setMessage("This flag is ${question.country}")
                       alertDialog.setPositiveButton("OK") { _, _ ->
                           Toast.makeText(this, "Closed", Toast.LENGTH_SHORT).show()
                           binding.guess.visibility = View.GONE
                       }
                       alertDialog.show()
                   } else {
                       binding.guess.visibility = View.GONE
                       mCorrectAnswers++
                       Toast.makeText(this, "CORRECT !", Toast.LENGTH_LONG).show()
                   }
                   if (mCurrentQuestion == mQuestionsList!!.size) {
                       binding.sumbit.text = "FINISH"
                   } else {
                       binding.sumbit.text = "NEXT QUESTION"
                   }
                   binding.number.text = mCorrectAnswers.toString()
                   binding.guess.setText("")
               }
           }
        }
    }
}