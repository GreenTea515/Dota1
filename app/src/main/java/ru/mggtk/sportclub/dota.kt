package ru.mggtk.sportclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dota)
    }
    fun dota1(view: View) {
        val b3: Button = findViewById(R.id.button6)
        when (b3?.id) {
            R.id.button6 -> finish()
        }
    }
}