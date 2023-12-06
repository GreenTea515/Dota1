 package ru.mggtk.sportclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateInterpolator
import android.widget.ProgressBar
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
     private val SPLASH_TIME_OUT: Long = 4000
     override fun onCreate(savedInstanceState: Bundle?) {
         setTheme(R.style.Base_Theme_SportClub)
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         val t:TextView = findViewById(R.id.textView)
         t.animate().apply {
             rotationY(360f)
             rotationX(360f)
             scaleX(1f)
             duration = 7000
             interpolator = AccelerateInterpolator()
         }.start()


         Handler().postDelayed({
             val intent: Intent = Intent(this, MainActivity2::class.java)
             startActivity(intent)
             finish()
         }, SPLASH_TIME_OUT)

     }
 }