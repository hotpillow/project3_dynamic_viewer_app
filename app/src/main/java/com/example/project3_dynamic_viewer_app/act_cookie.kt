package com.example.project3_dynamic_viewer_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class act_cookie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_cookie)

        val cake_btn = findViewById<Button>(R.id.button_cake)
        cake_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, act_cake::class.java)
            startActivity(intent)
        })

        val coffee_btn = findViewById<Button>(R.id.button_coffee)
        coffee_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, act_coffee::class.java)
            startActivity(intent)
        })
    }

    fun goToCakeActivity(view: View?) {
        val intent = Intent(this@act_cookie, act_cake::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
    fun goToCoffeeActivity(view: View?) {
        val intent = Intent(this@act_cookie, act_coffee::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}