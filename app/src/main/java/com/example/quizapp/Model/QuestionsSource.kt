package com.example.quizapp.Model

import com.example.quizapp.Questions.Questions
import com.example.quizapp.R

object QuestionsSource {
    const val correctAnswer = "correct_answers"
    const val username = "username"
    const val nCorrectAnswer = "correct_answers"
    const val nUsername = "username"
    fun getQuestions(): List<Questions> {
        val questionList : List<Questions> = listOf(
         Questions(
            3,
            R.drawable.champions_league,
            "Who was the winner of the UCL in 1993?",
            "Nottingham Forest",
            "Olympique de Marseille",
            "FC Barcelona",
            "AC Milan",
            2
        ),
       Questions(
            4,
            R.drawable.siuu,
            "When was SIUUU invented?",
            "In pre-season game vs Chelsea 2013",
            "vs Bayern in UCL semis in 2014",
            "vs Atletico in 2017 UCL ",
            "vs Barcelona in 2017 spanish supercup",
            1
        ),
        Questions(
            7,
            R.drawable.messi2012,
            "How many goals did Messi score in 2012?",
            "91",
            "100",
            "85",
            "95",
            1
        ),
         Questions(
            8,
            R.drawable.robben,
            "In which one of these team has Robben played for?",
            "Atletico de Madrid",
            "Chelsea",
            "Juventus",
            "Paris SG",
            2
        ),
       Questions(
            9,
            R.drawable.dinero,
            "What is the most expensive transfer in history?",
            "Neymar to PSG",
            "Mbappe to PSG",
            "Ronaldo to Juventus",
            "Coutinho to Barcelona",
            1
        ),
        Questions(
            9,
            R.drawable.aguerooooooooooo,
            "AGUEROOOOOOOOOOOOO",
            "92:50",
            "93:20",
            "95:00",
            "91:25",
            2
        ),
        Questions(
            9,
            R.drawable.london,
            "Which of these teams isn't from London?",
            "West Ham",
            "Wolves",
            "Arsenal",
            "Chelsea",
            2
        ),
       Questions(
            9,
            R.drawable.`var`,
            "What does VAR stand for?",
            "Video Assisted Referee",
            "Very Awful Referee",
            "Virtual Assitant Referee",
            "Vincent and Rupert(Best referees ITW)",
            1
        ),
        Questions(
            9,
            R.drawable.wc,
            "How many teams play in the World Cup?",
            "16",
            "28",
            "48",
            "32",
            4
        ),
       Questions(
            9,
            R.drawable.zlatan,
            "In which one of these teams Zlatan didn't play for",
            "Barcelona",
            "Juventus",
            "Inter Milan",
            "Arsenal",
            4
        ),
        Questions(
            9,
            R.drawable.rooney,
            "In which year did Wayne Rooney make his Premier League debut?",
            "2000",
            "2001",
            "2002",
            "2003",
            3
        ),
        Questions(
            9,
            R.drawable.billingham,
            "Which Championship side did Jude Bellingham sign for Borussia Dortmund from?",
            "Birmingham",
            "Millwall",
            "Reading",
            "Leeds",
            1
        ),
        Questions(
            9,
            R.drawable.senegal,
            "How many World Cup participations has the Senegal National Team including Qatar 2022",
            "3",
            "2",
            "4",
            "1",
            1
        ),
       Questions(
            9,
            R.drawable.hattrick,
            "Which player scored the fastest hat-trick in the Premier League?",
            "Sergio Aguero",
            "Thierry Henry",
            "Sadio Mané",
            "Luis Suarez",
            3
        ),
        Questions(
            9,
            R.drawable.can,
            "I have played for Chelsea and spent time playing in Turkey. I've been crowned African Footballer of the Year four times and the Africa Cup of Nations twice.",
            "Micheal Essien",
            "Didier Drogba",
            "Michel John Obi",
            "Samuel Eto'o",
            4
        ),
        Questions(
            9,
            R.drawable.euro,
            "With three titles each, which two teams have won the most European Championships?",
            "France & Germany",
            "Spain & Germany",
            "France & Italy",
            "Italy & Spain",
            2
        ),
        Questions(
            9,
            R.drawable.gk,
            "With 202 clean sheets, which goalkeeper has the best record in the Premier League?",
            "Van der Saar",
            "Petr Cech",
            "Petr Schmeichel ",
            "Édouard Mendy",
            2
        ),
        Questions(
            9,
            R.drawable.strikerpl,
            "With 260 goals, who is the Premier League's all-time top scorer?",
            "Alan Shearer",
            "Wayne Rooney",
            "Kun Aguero",
            "Thierry Henry",
            1
        )
        )
        val questions = questionList.asSequence().shuffled().take(15).toList()
        return questions
    }

    fun getNbaQuestions(): List<Questions> {
        val questionsList: List<Questions> = listOf(
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
                R.drawable.nba23,
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
            ),
            Questions(
                16,
                R.drawable.nba23,
                "How many NBA franchises exist as of today?",
                "32",
                "30",
                "28",
                "33",
                2
            ),
            Questions(
                17,
                R.drawable.im2,
                "How long does each contest in an NBA match last?",
                "60 minutes",
                "48 minutes",
                "45 minutes",
                "63 minute",
                2
            ),
            Questions(
                18,
                R.drawable.im3,
                "What is the length of a quarter?",
                "12 minutes",
                "8 minutes",
                "10 minutes",
                "15 minutes",
                1
            ),
            Questions(
                19,
                R.drawable.im6,
                "Who is the first guard to be drafter right out of school?",
                "Allen Iverson",
                "JA Morant",
                "Kobe Bryant",
                "Stephen Curry",
                3
            ),
            Questions(
                20,
                R.drawable.im7,
                "This team has reached five consecutive NBA finals and won three of them in the past decade , which team is it?",
                "San Antonio Spurs",
                "Los Angeles Lakers",
                "Miami Heat",
                "Golden State Warriors",
                4
            )
        )
        val questions = questionsList.asSequence().shuffled().take(10).toList()
        return questions
    }
    fun guessFlags(): List<Flags> {
        val questionsList: List<Flags> = listOf(
            Flags(
                R.drawable.ae,
                "United Arab Emirates"
            ),
            Flags(
                R.drawable.ar,
                "Argentina"
            ),
            Flags(
                R.drawable.be,
                "Belgium"
            ),
            Flags(
                R.drawable.br,
                "Brazil"
            ),
            Flags(
                R.drawable.sn,
                "Senegal"
            ),
            Flags(
                R.drawable.cl,
                "Chile"
            ),
            Flags(
                R.drawable.gh,
                "Ghana"
            ),
            Flags(
                R.drawable.iq,
                "Iraq"
            ),
            Flags(
                R.drawable.jo,
                "Jordan"
            ),
            Flags(
                R.drawable.kw,
                "Kowait"
            ),
            Flags(
                R.drawable.mr,
                "Mauritania"
            ),
            Flags(
                R.drawable.sl,
                "Sierra Leone"
            ),
            Flags(
                R.drawable.za,
                "South Africa"
            ),
            Flags(
                R.drawable.sk,
                "Slovakia"
            ),
            Flags(
                R.drawable.pa,
                "Panama"
            ),
            Flags(
                R.drawable.pr,
                "Puerto Rico"
            ),
            Flags(
                R.drawable.fr,
                "France"
            ),
            Flags(
                R.drawable.es,
                "Spain"
            ),
            Flags(
                R.drawable.de,
                "Germany"
            ),
            Flags(
                R.drawable.nl,
                "Netherlands"
            ),
            Flags(
                R.drawable.fi,
                "Finland"
            ),
            Flags(
                R.drawable.bf,
                "Burkina Faso"
            ),
            Flags(
                R.drawable.vn,
                "Vietnam"
            ),
            Flags(
                R.drawable.zm,
                "Zambia"
            ),
            Flags(
                R.drawable.mz,
                "Mozambique"
            ),
            Flags(
                R.drawable.bo,
                "Bolivia"
            ),
            Flags(
                R.drawable.al,
                "Albania"
            ),
            Flags(
                R.drawable.ua,
                "Ukraine"
            ),
            Flags(
                R.drawable.us,
                "United States"
            ),
            Flags(
                R.drawable.dk,
                "Denmark"
            ),
            Flags(
                R.drawable.co,
                "Colombia"
            ),
            Flags(
                R.drawable.fj,
                "Fiji"
            ),
            Flags(
                R.drawable.ec,
                "Ecuador"
            ),
            Flags(
                R.drawable.eng,
                "England"
            ),
            Flags(
                R.drawable.la,
                "Laos"
            ),
            Flags(
                R.drawable.lb,
                "Lebanon"
            ),
            Flags(
                R.drawable.lu,
                "Luxembourg"
            ),
            Flags(
                R.drawable.ly,
                "Libya"
            ),
            Flags(
                R.drawable.pe,
                "Peru"
            ),
            Flags(
                R.drawable.et,
                "Ethiopia"
            ),
            Flags(
                R.drawable.ee,
                "Estonia"
            ),
            Flags(
                R.drawable.hr,
                "Croatia"
            )

        )
        return questionsList.asSequence().shuffled().take(20).toList()
    }
}
