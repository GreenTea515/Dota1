package ru.mggtk.sportclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class oprogramme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oprogramme)
    }
    fun opragramme(view: View) {
        val b2: Button = findViewById(R.id.button5)
        when (b2?.id) {
            R.id.button5 -> finish()
        }
    }
}