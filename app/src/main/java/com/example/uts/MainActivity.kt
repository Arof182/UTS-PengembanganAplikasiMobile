package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            setContentView(R.layout.activity_main)
                val button_2: Button = findViewById(R.id.button_2)
                button_2.setOnClickListener {
                    val intent = Intent(this, Register::class.java)
                    startActivity(intent)
                }
        }, 3000)
    }

}