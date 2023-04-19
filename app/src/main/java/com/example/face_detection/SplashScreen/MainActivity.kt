package com.example.face_detection.SplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import com.example.face_detection.Login_Registration.RegisterActivity
import com.example.face_detection.R

class MainActivity : AppCompatActivity() {
    var i =0
    var progressbar:ProgressBar?=null
    lateinit var progresstext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progresstext = findViewById(R.id.progress_text)
        progressbar = findViewById(R.id.progressbar)

        val handler = Handler()
        handler.postDelayed(object :Runnable{
            override fun run() {
                if (i<=100){
                    progresstext.setText(""+i)
                    progressbar?.setProgress(i)
                    i++
                    handler.postDelayed(this,50)
                }
                else{
                    handler.removeCallbacks(this)
                    val intent = Intent(this@MainActivity, RegisterActivity::class.java)
                    startActivity(intent)
                }


            }

        },50)

    }
}