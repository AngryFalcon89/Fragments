package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            var manager = supportFragmentManager.beginTransaction()

            manager.replace(R.id.frame,BlankFragment())
            manager.commit()
        }

        binding.button2.setOnClickListener {

            var manager = supportFragmentManager.beginTransaction()

            manager.replace(R.id.frame,BlankFragment2())
            manager.commit()
        }


    }
}