package ru.mggtk.sportclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Windranger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_windranger)
    }
    fun Clickwiarc(view: View) {
        val b: Button = findViewById(R.id.button)
        when (b?.id) {
            R.id.button -> finish()
        }
    }
}