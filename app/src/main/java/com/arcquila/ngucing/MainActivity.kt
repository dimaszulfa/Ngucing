package com.arcquila.ngucing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arcquila.ngucing.Util.Util
import com.arcquila.ngucing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        initAction()

    }

//    private fun initAction(){
//
//        Util.apply {
//            loadImage(this@MainActivity,binding.ivImage,R.drawable.ic_android_black_24dp)
//            loadImage(this@MainActivity, binding.ivImagess,R.drawable.ic_baseline_10k_24)
//        }
//
//        binding.btnLogin.setOnClickListener {
//            val email = binding.etEmailvalues.text.takeIf {
//                it != null
//            }?.trim().toString()
//            val password = binding.etPasswordvalues.text.toString()
//            Toast.makeText(this,email,Toast.LENGTH_SHORT).show()
//        }
//    }




}