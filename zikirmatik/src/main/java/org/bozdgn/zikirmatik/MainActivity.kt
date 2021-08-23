package org.bozdgn.zikirmatik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.bozdogan.zikirmatik.R

class MainActivity : AppCompatActivity() {
    var count = 0
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            ++count
            textView.text = count.toString()
        }

        button2.setOnClickListener {
            count = 0
            textView.text = count.toString()
        }
    }
}