package com.example.face_detection.Dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.face_detection.R
import com.example.face_detection.databinding.ActivityDashboardBinding

class ActivityDashboard : AppCompatActivity() {
    private lateinit var binding:ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.
        setContentView(this,R.layout.activity_dashboard)

    }
}