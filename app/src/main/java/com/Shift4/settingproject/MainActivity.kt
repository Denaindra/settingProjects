package com.Shift4.settingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //rollbutton
        val rollBtn: Button = findViewById(R.id.roll_btn)
        rollBtn.text = "Let's Roll now"
        rollBtn.setOnClickListener {
            RollDice()
        }
         diceImage = findViewById(R.id.dice_image)
    }

    private fun RollDice() {
        var randomNum = Random().nextInt(6) + 1
        val drawableResource = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}











