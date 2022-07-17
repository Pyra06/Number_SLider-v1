package com.example.slidepuzzle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var block1: TextView
    lateinit var block2: TextView
    lateinit var block3: TextView
    lateinit var block4: TextView
    lateinit var block5: TextView
    lateinit var block6: TextView
    lateinit var block7: TextView
    lateinit var block8: TextView
    lateinit var block9: TextView
    lateinit var block10: TextView
    lateinit var block11: TextView
    lateinit var block12: TextView
    lateinit var block13: TextView
    lateinit var block14: TextView
    lateinit var block15: TextView
    lateinit var block16: TextView
    lateinit var block17: TextView
    lateinit var block18: TextView
    lateinit var block19: TextView
    lateinit var block20: TextView
    lateinit var block21: TextView
    lateinit var block22: TextView
    lateinit var block23: TextView
    lateinit var block24: TextView
    lateinit var block25: TextView
    lateinit var moveLeft: Button
    lateinit var moveRight: Button
    lateinit var moveUP: Button
    lateinit var moveDown: Button
    lateinit var solveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        block1 = findViewById(R.id.textView1)
        block2 = findViewById(R.id.textView2)
        block3 = findViewById(R.id.textView3)
        block4 = findViewById(R.id.textView4)
        block5 = findViewById(R.id.textView5)
        block6 = findViewById(R.id.textView6)
        block7 = findViewById(R.id.textView7)
        block8 = findViewById(R.id.textView8)
        block9 = findViewById(R.id.textView9)
        block10 = findViewById(R.id.textView10)
        block11 = findViewById(R.id.textView11)
        block12 = findViewById(R.id.textView12)
        block13 = findViewById(R.id.textView13)
        block14 = findViewById(R.id.textView14)
        block15 = findViewById(R.id.textView15)
        block16 = findViewById(R.id.textView16)
        block17 = findViewById(R.id.textView17)
        block18 = findViewById(R.id.textView18)
        block19 = findViewById(R.id.textView19)
        block20 = findViewById(R.id.textView20)
        block21 = findViewById(R.id.textView21)
        block22 = findViewById(R.id.textView22)
        block23 = findViewById(R.id.textView23)
        block24 = findViewById(R.id.textView24)
        block25 = findViewById(R.id.textView25)
        moveLeft = findViewById(R.id.button1)
        moveRight = findViewById(R.id.button2)
        moveUP = findViewById(R.id.button3)
        moveDown = findViewById(R.id.button4)
        solveBtn = findViewById(R.id.button6)

        moveLeft.setOnClickListener() {
            when {
                block1.text.isEmpty() -> {
                    block1.text = block2.text
                    block2.text = ""
                }
                block2.text.isEmpty() -> {
                    block2.text = block3.text
                    block3.text = ""
                }
                block3.text.isEmpty() -> {
                    block3.text = block4.text
                    block4.text = ""
                }
                block4.text.isEmpty() -> {
                    block4.text = block5.text
                    block5.text = ""
                }
                block5.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block6.text.isEmpty() -> {
                    block6.text = block7.text
                    block7.text = ""
                }
                block7.text.isEmpty() -> {
                    block7.text = block8.text
                    block8.text = ""
                }
                block8.text.isEmpty() -> {
                    block8.text = block9.text
                    block9.text = ""
                }
                block9.text.isEmpty() -> {
                    block9.text = block10.text
                    block10.text = ""
                }
                block10.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block11.text.isEmpty() -> {
                    block11.text = block12.text
                    block12.text = ""
                }
                block12.text.isEmpty() -> {
                    block12.text = block13.text
                    block13.text = ""
                }
                block13.text.isEmpty() -> {
                    block13.text = block14.text
                    block14.text = ""
                }
                block14.text.isEmpty() -> {
                    block14.text = block15.text
                    block15.text = ""
                }
                block15.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block16.text.isEmpty() -> {
                    block16.text = block17.text
                    block17.text = ""
                }
                block17.text.isEmpty() -> {
                    block17.text = block18.text
                    block18.text = ""
                }
                block18.text.isEmpty() -> {
                    block18.text = block19.text
                    block19.text = ""
                }
                block19.text.isEmpty() -> {
                    block19.text = block20.text
                    block20.text = ""
                }
                block20.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block21.text.isEmpty() -> {
                    block21.text = block22.text
                    block22.text = ""
                }
                block22.text.isEmpty() -> {
                    block22.text = block23.text
                    block23.text = ""
                }
                block23.text.isEmpty() -> {
                    block23.text = block24.text
                    block24.text = ""
                }
                block24.text.isEmpty() -> {
                    block24.text = block25.text
                    block25.text = ""
                }
                block25.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        moveRight.setOnClickListener() {
            when {
                block5.text.isEmpty() -> {
                    block5.text = block4.text
                    block4.text = ""
                }
                block4.text.isEmpty() -> {
                    block4.text = block3.text
                    block3.text = ""
                }
                block3.text.isEmpty() -> {
                    block3.text = block2.text
                    block2.text = ""
                }
                block2.text.isEmpty() -> {
                    block2.text = block1.text
                    block1.text = ""
                }
                block1.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block10.text.isEmpty() -> {
                    block10.text = block9.text
                    block9.text = ""
                }
                block9.text.isEmpty() -> {
                    block9.text = block8.text
                    block8.text = ""
                }
                block8.text.isEmpty() -> {
                    block8.text = block7.text
                    block7.text = ""
                }
                block7.text.isEmpty() -> {
                    block7.text = block6.text
                    block6.text = ""
                }
                block6.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block15.text.isEmpty() -> {
                    block15.text = block14.text
                    block14.text = ""
                }
                block14.text.isEmpty() -> {
                    block14.text = block13.text
                    block13.text = ""
                }
                block13.text.isEmpty() -> {
                    block13.text = block12.text
                    block12.text = ""
                }
                block12.text.isEmpty() -> {
                    block12.text = block11.text
                    block11.text = ""
                }
                block11.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block20.text.isEmpty() -> {
                    block20.text = block19.text
                    block19.text = ""
                }
                block19.text.isEmpty() -> {
                    block19.text = block18.text
                    block18.text = ""
                }
                block18.text.isEmpty() -> {
                    block18.text = block17.text
                    block17.text = ""
                }
                block17.text.isEmpty() -> {
                    block17.text = block16.text
                    block16.text = ""
                }
                block16.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block25.text.isEmpty() -> {
                    block25.text = block24.text
                    block24.text = ""
                }
                block24.text.isEmpty() -> {
                    block24.text = block23.text
                    block23.text = ""
                }
                block23.text.isEmpty() -> {
                    block23.text = block22.text
                    block22.text = ""
                }
                block22.text.isEmpty() -> {
                    block22.text = block21.text
                    block21.text = ""
                }
                block21.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        moveUP.setOnClickListener() {
            when {
                block1.text.isEmpty() -> {
                    block1.text = block6.text
                    block6.text = ""
                }
                block6.text.isEmpty() -> {
                    block6.text = block11.text
                    block11.text = ""
                }
                block11.text.isEmpty() -> {
                    block11.text = block16.text
                    block16.text = ""
                }
                block16.text.isEmpty() -> {
                    block16.text = block21.text
                    block21.text = ""
                }
                block21.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block2.text.isEmpty() -> {
                    block2.text = block7.text
                    block7.text = ""
                }
                block7.text.isEmpty() -> {
                    block7.text = block12.text
                    block12.text = ""
                }
                block12.text.isEmpty() -> {
                    block12.text = block17.text
                    block17.text = ""
                }
                block17.text.isEmpty() -> {
                    block17.text = block22.text
                    block22.text = ""
                }
                block22.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block3.text.isEmpty() -> {
                    block3.text = block8.text
                    block8.text = ""
                }
                block8.text.isEmpty() -> {
                    block8.text = block13.text
                    block13.text = ""
                }
                block13.text.isEmpty() -> {
                    block13.text = block18.text
                    block18.text = ""
                }
                block18.text.isEmpty() -> {
                    block18.text = block23.text
                    block23.text = ""
                }
                block23.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block4.text.isEmpty() -> {
                    block4.text = block9.text
                    block9.text = ""
                }
                block9.text.isEmpty() -> {
                    block9.text = block14.text
                    block14.text = ""
                }
                block14.text.isEmpty() -> {
                    block14.text = block19.text
                    block19.text = ""
                }
                block19.text.isEmpty() -> {
                    block19.text = block24.text
                    block24.text = ""
                }
                block24.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block5.text.isEmpty() -> {
                    block5.text = block10.text
                    block10.text = ""
                }
                block10.text.isEmpty() -> {
                    block10.text = block15.text
                    block15.text = ""
                }
                block15.text.isEmpty() -> {
                    block15.text = block20.text
                    block20.text = ""
                }
                block20.text.isEmpty() -> {
                    block20.text = block25.text
                    block25.text = ""
                }
                block25.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        moveDown.setOnClickListener() {
            when {
                block25.text.isEmpty() -> {
                    block25.text = block20.text
                    block20.text = ""
                }
                block20.text.isEmpty() -> {
                    block20.text = block15.text
                    block15.text = ""
                }
                block15.text.isEmpty() -> {
                    block15.text = block10.text
                    block10.text = ""
                }
                block10.text.isEmpty() -> {
                    block10.text = block5.text
                    block5.text = ""
                }
                block5.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block24.text.isEmpty() -> {
                    block24.text = block19.text
                    block19.text = ""
                }
                block19.text.isEmpty() -> {
                    block19.text = block14.text
                    block14.text = ""
                }
                block14.text.isEmpty() -> {
                    block14.text = block9.text
                    block9.text = ""
                }
                block9.text.isEmpty() -> {
                    block9.text = block4.text
                    block4.text = ""
                }
                block4.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block23.text.isEmpty() -> {
                    block23.text = block18.text
                    block18.text = ""
                }
                block18.text.isEmpty() -> {
                    block18.text = block13.text
                    block13.text = ""
                }
                block13.text.isEmpty() -> {
                    block13.text = block8.text
                    block8.text = ""
                }
                block8.text.isEmpty() -> {
                    block8.text = block3.text
                    block3.text = ""
                }
                block3.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block22.text.isEmpty() -> {
                    block22.text = block17.text
                    block17.text = ""
                }
                block17.text.isEmpty() -> {
                    block17.text = block12.text
                    block12.text = ""
                }
                block12.text.isEmpty() -> {
                    block12.text = block7.text
                    block7.text = ""
                }
                block7.text.isEmpty() -> {
                    block7.text = block2.text
                    block2.text = ""
                }
                block2.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                block21.text.isEmpty() -> {
                    block21.text = block16.text
                    block16.text = ""
                }
                block16.text.isEmpty() -> {
                    block16.text = block11.text
                    block11.text = ""
                }
                block11.text.isEmpty() -> {
                    block11.text = block6.text
                    block6.text = ""
                }
                block6.text.isEmpty() -> {
                    block6.text = block1.text
                    block1.text = ""
                }
                block1.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        solveBtn.setOnClickListener() {
            block1.text = "1"
            block2.text = "2"
            block3.text = "3"
            block4.text = "4"
            block5.text = "5"
            block6.text = "6"
            block7.text = "7"
            block8.text = "8"
            block9.text = "9"
            block10.text = "10"
            block11.text = "11"
            block12.text = "12"
            block13.text = "13"
            block14.text = "14"
            block15.text = "15"
            block16.text = "16"
            block17.text = "17"
            block18.text = "18"
            block19.text = "19"
            block20.text = "20"
            block21.text = "21"
            block22.text = "22"
            block23.text = "23"
            block24.text = "24"
            block25.text = ""
        }
    }
}
