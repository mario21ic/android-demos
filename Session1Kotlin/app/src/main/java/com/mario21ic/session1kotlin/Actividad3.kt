package com.mario21ic.session1kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Actividad3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)
    }

    fun actividad1(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun actividad2(view: View) {
        startActivity(Intent(this, Main2Activity::class.java))
    }

    fun mispinner(view: View) {
        startActivity(Intent(this, MiSpinner::class.java))
    }

}
