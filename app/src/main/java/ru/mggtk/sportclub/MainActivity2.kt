package ru.mggtk.sportclub

import android.animation.ObjectAnimator
import android.animation.ValueAnimator.INFINITE
import android.animation.ValueAnimator.REVERSE
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val t: TextView = findViewById(R.id.invoker)

    }
    fun Click1 (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, Pudge::class.java)
        startActivity(intent)
    }
    fun Click2 (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, Invoker::class.java)
        startActivity(intent)
    }
    fun Click3 (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, Windranger::class.java)
        startActivity(intent)
    }
    fun osebe (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, osebe::class.java)
        startActivity(intent)
    }
    fun oprogramm (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, oprogramme::class.java)
        startActivity(intent)
    }
    fun dota (view: View){
        val b1 : Button = findViewById(R.id.button1)
        val intent : Intent = Intent(this, dota::class.java)
        startActivity(intent)
    }
    fun Theme(view: View) {
        val sw: Switch = findViewById(R.id.switch1)
        if (sw.isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }

}