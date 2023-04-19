package com.example.face_detection.Login_Registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.face_detection.R
import com.example.face_detection.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding :ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)

    }
}