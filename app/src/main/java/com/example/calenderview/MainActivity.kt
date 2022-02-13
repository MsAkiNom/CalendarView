package com.example.calenderview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCalenderView = findViewById<CalendarView>(R.id.myCalendarView)
        myCalenderView.setOnDateChangeListener { _, year, month, day ->
            val cal : Calendar = GregorianCalendar(year, month, day)
            val dateFormatter = SimpleDateFormat("yyyy/MM/dd")
            Toast.makeText(this,
                "you picked \n" + dateFormatter.format(cal.time),
                Toast.LENGTH_LONG).show()

        }
    }
}