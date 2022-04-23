package com.example.quizapp.Model

import com.example.quizapp.R
import kotlin.collections.ArrayList

object QuestionsSource {
    const val correctAnswer = "correct_answers"
    const val username = "username"
    fun getQuestions(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()
        val question1 = Questions(
            1,
            R.drawable.world_cup,
            "Which national team has won the most World Cup",
            "Brazil",
            "France",
            "Italy",
            "Spain",
            1
        )
        val question2 = Questions(
            2,
            R.drawable.ballon_dor,
            "Who won the most Ballon D'or?",
            "Cristiano Ronaldo",
            "Lionel Messi",
            "Johan Cruyff",
            "Ronaldo Nazario",
            2
        )
        val question3 = Questions(
            3,
            R.drawable.champions_league,
            "Who was the winner of the UCL in 2007?",
            "Liverpool",
            "Manchester United",
            "Real Madrid",
            "AC Milan",
            4
        )
        val question4 = Questions(
            4,
            R.drawable.siuu,
            "When was SIUUU invented?",
            "In pre-season game vs Chelsea 2013",
            "vs Bayern in UCL semis in 2014",
            "vs Atletico in 2017 UCL ",
            "vs Barcelona in 2017 spanish supercup",
            1
        )
        val question5 = Questions(
            5,
            R.drawable.redcaard,
            "What player has never seen a red card?",
            "Ronaldinho",
            "Pepe",
            "David Beckham",
            "Karim Benzema",
            4
        )
        val question6 = Questions(
            6,
            R.drawable.eurocopa,
            "Who won the Euros 2020?",
            "France",
            "Spain",
            "Italy",
            "England",
            3
        )
        val question7 = Questions(
            7,
            R.drawable.messi2012,
            "How many goals did Messi score in 2012?",
            "91",
            "100",
            "85",
            "95",
            1
        )
        val question8 = Questions(
            8,
            R.drawable.robben,
            "In which one of these team has Robben played for?",
            "Atletico de Madrid",
            "Chelsea",
            "Juventus",
            "Paris SG",
            2
        )
        val question9 = Questions(
            9,
            R.drawable.dinero,
            "What is the most expensive transfer in history?",
            "Neymar to PSG",
            "Mbappe to PSG",
            "Ronaldo to Juventus",
            "Coutinho to Barcelona",
            1
        )
        val question10 = Questions(
            9,
            R.drawable.aguerooooooooooo,
            "AGUEROOOOOOOOOOOOO",
            "92:50",
            "93:20",
            "95:00",
            "91:25",
            2
        )
        val question11 = Questions(
            9,
            R.drawable.london,
            "Which of these teams isn't from London?",
            "West Ham",
            "Wolves",
            "Arsenal",
            "Chelsea",
            2
        )
        val question12 = Questions(
            9,
            R.drawable.varr,
            "What does VAR stand for?",
            "Video Assisted Referee",
            "Very Awful Referee",
            "Virtual Assitant Referee",
            "Vincent and Rupert(Best referees ITW)",
            1
        )
        val question13 = Questions(
            9,
            R.drawable.wc,
            "How many teams play in the World Cup?",
            "16",
            "28",
            "48",
            "32",
            4
        )
        val question14 = Questions(
            9,
            R.drawable.zlatan,
            "In which one of these teams Zlatan didn't play for",
            "Barcelona",
            "Juventus",
            "Inter Milan",
            "Arsenal",
            4
        )
        val question15 = Questions(
            9,
            R.drawable.me,
            "In what position does Momo play :D",
            "Forward",
            "Defender",
            "Midfield",
            "GoalKeeper",
            1
        )



        questionList.add(question1)
        questionList.add(question2)
        questionList.add(question3)
        questionList.add(question4)
        questionList.add(question5)
        questionList.add(question6)
        questionList.add(question7)
        questionList.add(question8)
        questionList.add(question9)
        questionList.add(question10)
        questionList.add(question11)
        questionList.add(question12)
        questionList.add(question13)
        questionList.add(question14)
        questionList.add(question15)
        questionList.shuffle()
        return questionList
    }

    fun getNbaQuestions(): ArrayList<Questions> {
        val questionsList: ArrayList<Questions> = arrayListOf(
            Questions(
                1,
                R.drawable.rookie,
                "Who was the rookie player of the 2021 nba season",
                "Lamelo Ball",
                "Saddiq Bey",
                "Anthony Edwards",
                "Tyrese Haliburton",
                1
            ),
            Questions(
                1,
                R.drawable.jobsnotfinished,
                "What did Kobe say here?",
                "We're the best team of the decade",
                "Job's not finished , job's finished? , i don't think so",
                "Just be legendary",
                "To become the best , you gotta work hard for it",
                2
            ),
            Questions(
                2,
                R.drawable.lebron,
                "How many rings has LeBron?",
                "4",
                "2",
                "5",
                "3",
                1
            ),
            Questions(
                4,
                R.drawable.ring,
                "Which one of these teams has more NBA championships?",
                "Chicago Bulls",
                "Los Angeles Lakers",
                "Golden State Warriors",
                "San Antonio Spurs",
                2
            ),
            Questions(
                5,
                R.drawable.curry,
                "Where did Curry surpass Ray Allen to become the all-time leader in 3 pointers",
                "Staples Center",
                "United Center",
                "Madison Square Garden",
                "Quicken Loans Arena",
                3
            ),
            Questions(
                5,
                R.drawable.kobe,
                "What is Kobe bryant's career high in points",
                "81 points",
                "99 points",
                "75 points",
                "85 points",
                1
            ),
            Questions(
                8,
                R.drawable.nbalogo,
                "When was the NBA founded",
                "1918",
                "1930",
                "1955",
                "1946",
                4
            ),
            Questions(
                9,
                R.drawable.youngest,
                "Who was the youngest player to score 10,000 points in the NBA?",
                "Kobe Bryant",
                "LeBron James",
                "Wilt Chamberlain",
                "Micheal Jordan",
                2
            ),
            Questions(
                10,
                R.drawable.nbateams,
                "What team owns the longest winning streak in NBA history?",
                "Chicago Bulls",
                "Los Angeles Lakers",
                "Golden State Warriors",
                "Miami Heat",
                2
            ),
            Questions(
                11,
                R.drawable.allstar2000,
                "What player won All-Star Game MVP, NBA MVP, and NBA Finals MVP awards in 2000?",
                "Kobe Bryant",
                "Micheal Jordan",
                "Shaquille O'Neal",
                "Tim Duncan",
                3
            ),
            Questions(
                12,
                R.drawable.scorer,
                "Who was the first player in NBA history to make 400 three-pointers in a season?",
                "James Harden",
                "Dennis Scott",
                "Ray Allen",
                "Steph Curry",
                4
            ),
            Questions(
                13,
                R.drawable.nba2,
                "What NBA player has won the most league MVPs?",
                "Kobe Bryant",
                "Kareem Abdul-Jabbar",
                "Lebron James",
                "Steph Curry",
                2
            ),
            Questions(
                13,
                R.drawable.madis,
                "Which NBA team plays at Madison Square Garden?",
                "New York Knicks",
                "Los Angeles Clippers",
                "Brooklyn Nets",
                "Golden State Warriors",
                1
            ),
            Questions(
                15,
                R.drawable.bron_jordan,
                "Who was the first NBA player to record a triple-double in the All-Star Game?",
                "LeBron James",
                "Westbrook",
                "Micheal Jordan",
                "Stephen Curry",
                3
            )
        )

        questionsList.asSequence().shuffled().take(5).toList()
        return questionsList
    }
}
