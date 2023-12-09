package com.example.project3_dynamic_viewer_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class act_cake : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_cake)

        val coffee_btn = findViewById<Button>(R.id.button_coffee)
        coffee_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, act_coffee::class.java)
            startActivity(intent)
        })

        val cookie_btn = findViewById<Button>(R.id.button_cookie)
        cookie_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, act_cookie::class.java)
            startActivity(intent)
        })
    }

    fun goToCoffeeActivity(view: View?) {
        val intent = Intent(this@act_cake, act_coffee::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
    fun goToCookieActivity(view: View?) {
        val intent = Intent(this@act_cake, act_cookie::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}