package com.engmob.android.certification.core.toast

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val duration = Toast.LENGTH_SHORT

        simpleToast.setOnClickListener {
            val text = getString(R.string.simple_toast)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        topToast.setOnClickListener {
            val text = getString(R.string.top_toast)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        topMarginToast.setOnClickListener {
            val text = getString(R.string.top_margin_toast)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.TOP, 0, 1000)
            toast.show()
        }

        leftToast.setOnClickListener {
            val text = getString(R.string.left_toast)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.START, 0, 0)
            toast.show()
        }

        leftMarginToast.setOnClickListener {
            val text = getString(R.string.left_margin_toast)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.START or Gravity.BOTTOM, 100, 100)
            toast.show()
        }

        customToast.setOnClickListener {
            val inflater = layoutInflater
            val layout: View = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container))
            val text: TextView = layout.findViewById(R.id.text)
            text.text = getString(R.string.customToast)
            with(Toast(applicationContext)) {
                view = layout
                show()
            }
        }
    }
}