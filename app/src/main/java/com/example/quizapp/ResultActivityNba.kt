package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.Auth.NbaAuth
import com.example.quizapp.Model.NbaUsers
import com.example.quizapp.Model.QuestionsSource
import com.example.quizapp.databinding.ActivityResultBinding
import com.example.quizapp.recyclerView.LbAdapterNba
import com.google.firebase.firestore.*

class ResultActivityNba : AppCompatActivity() {
    private lateinit var _binding : ActivityResultBinding
    private val binding get() =  _binding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter : LbAdapterNba
    private lateinit var userArrayList : ArrayList<NbaUsers>
    private lateinit var layoutManager: LinearLayoutManager
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val answers = intent.getIntExtra(QuestionsSource.nCorrectAnswer,0)
        val username = intent.getStringExtra(QuestionsSource.nUsername)
        recyclerView = binding.recyclerView
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        userArrayList = arrayListOf()
        adapter = LbAdapterNba(userArrayList)
        recyclerView.adapter = adapter
        database()
        if (username != null) {
            db.collection("nbaUsers").document(username).set(hashMapOf("name" to username ,
                "score" to answers))
        }
        binding.finish.setOnClickListener {
            val Intent = Intent(this, NbaAuth::class.java)
            startActivity(Intent)
        }
    }
    private fun database(){
        db.collection("nbaUsers").orderBy("score",Query.Direction.DESCENDING).addSnapshotListener(object:EventListener<QuerySnapshot>{
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if(error != null){
                    Log.e("Firestore Error",error.message.toString())

                }

                for (dc : DocumentChange in value?.documentChanges!!){
                    if(dc.type == DocumentChange.Type.ADDED){
                        userArrayList.add(dc.document.toObject(NbaUsers::class.java))
                    }
                }
                adapter.notifyDataSetChanged()
            }

        })
    }
}