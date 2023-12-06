package ru.mggtk.sportclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class osebe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osebe)
    }
    fun osebe1(view: View) {
        val b1: Button = findViewById(R.id.button4)
        when (b1?.id) {
            R.id.button4 -> finish()
        }
    }
}