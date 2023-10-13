package com.example.costumtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.costumtoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        binding.costumtoolbar.ivback.setOnClickListener {
            Toast.makeText(this, "Tombol kembali",Toast.LENGTH_LONG).show()
        }
        binding.costumtoolbar.ivproril.setOnClickListener {
            Toast.makeText(this, "Tombol PROFIL",Toast.LENGTH_LONG).show()
        }

    }
}