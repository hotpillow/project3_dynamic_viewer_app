package com.example.project3_dynamic_viewer_app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project3_dynamic_viewer_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        val cookie_btn = findViewById<Button>(R.id.button_cookie)
        cookie_btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, act_cookie::class.java)
            startActivity(intent)
        })
    }
    fun goToCakeActivity(view: View?) {
        val intent = Intent(this@MainActivity, act_cake::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
    fun goToCoffeeActivity(view: View?) {
        val intent = Intent(this@MainActivity, act_coffee::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
    fun goToCookieActivity(view: View?) {
        val intent = Intent(this@MainActivity, act_cookie::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }

}