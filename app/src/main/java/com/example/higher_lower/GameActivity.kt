package com.example.higher_lower


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

data class Card(var image: Int, var value: Int)

class GameActivity : AppCompatActivity() {
    lateinit var higherButton: Button
    lateinit var lowerButton: Button
    lateinit var imageView: ImageView
    lateinit var scoreView: TextView
    var score: Int = 0
    var random = Random
    var isHigherGuess: Boolean = false


    lateinit var currentCard: Card

    val cardList: ArrayList<Card> = arrayListOf(
        Card(R.drawable.one, 1),
        Card(R.drawable.two, 2),
        Card(R.drawable.three, 3),
        Card(R.drawable.four, 4),
        Card(R.drawable.five, 5),
        Card(R.drawable.six, 6),
        Card(R.drawable.seven, 7),
        Card(R.drawable.eight, 8),
        Card(R.drawable.nine, 9),
        Card(R.drawable.ten, 10),
        Card(R.drawable.eleven, 11),
        Card(R.drawable.twelve, 12),
        Card(R.drawable.thirteen, 13),
        Card(R.drawable.fourteen, 14),
        Card(R.drawable.fifteen, 15),
        Card(R.drawable.sixteen, 16),
        Card(R.drawable.seventeen, 17),
        Card(R.drawable.eightteen, 18),
        Card(R.drawable.nineteen, 19),
        Card(R.drawable.twenty, 20),
        Card(R.drawable.twentyone, 21),
        Card(R.drawable.twentytwo, 22),
        Card(R.drawable.twentythree, 23),
        Card(R.drawable.twentyfour, 24),
        Card(R.drawable.twentyfive, 25),
        Card(R.drawable.twentysix, 26),
        Card(R.drawable.twentyseven, 27),
        Card(R.drawable.twentyeight, 28),
        Card(R.drawable.twentynine, 29),
        Card(R.drawable.thirty, 30),
        Card(R.drawable.thirtyone, 31),
        Card(R.drawable.thirtytwo, 32),
        Card(R.drawable.thirtythree, 33),
        Card(R.drawable.thirtyfour, 34),
        Card(R.drawable.thirtyfive, 35),
        Card(R.drawable.thirtysix, 36),
        Card(R.drawable.thirtyseven, 37),
        Card(R.drawable.thirtyeight, 38),
        Card(R.drawable.thirtynine, 39),
        Card(R.drawable.fourty, 40),
        Card(R.drawable.fourtyone, 41),
        Card(R.drawable.fourtytwo, 42),
        Card(R.drawable.fourtythree, 43),
        Card(R.drawable.fourtyfour, 44),
        Card(R.drawable.fourtyfive, 45),
        Card(R.drawable.fourtysix, 46),
        Card(R.drawable.fourtyseven, 47),
        Card(R.drawable.fourtyeight, 48),
        Card(R.drawable.fourtynine, 49),
        Card(R.drawable.fifty, 50),
        Card(R.drawable.fiftyone, 51),
        Card(R.drawable.fiftytwo, 52),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        higherButton = findViewById(R.id.higherButton)
        lowerButton = findViewById(R.id.lowerButton)
        scoreView = findViewById(R.id.scoreView)
        imageView = findViewById(R.id.imageView)

        currentCard = cardList[random.nextInt(cardList.size)]


        higherButton.setOnClickListener {

            val nextCard = cardList[random.nextInt(cardList.size)]
            isHigherGuess = true
            updateScoreAndDisplay(nextCard)
        }

        lowerButton.setOnClickListener {

            val nextCard = cardList[random.nextInt(cardList.size)]
            isHigherGuess = false
            updateScoreAndDisplay(nextCard)
        }


    }

    fun updateScoreAndDisplay(nextCard: Card) {
        imageView.setImageResource(nextCard.image)

        if ((nextCard.value > currentCard.value && isHigherGuess) ||
            (nextCard.value < currentCard.value && !isHigherGuess)
        ) {
            score++
        } else {
            showToast("Oops! Incorrect guess!")
        }
        scoreView.text = "Score: $score"
        currentCard = nextCard

    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}







