package com.iamquan.exambroacastreceiver2

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iamquan.exambroacastreceiver2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var testBroadcast: TestBroadcast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        testBroadcast = TestBroadcast(
            useText = {
                binding.tvReceive.text = it
            }
        )

        //đăng kí nhận
        val intentFilter = IntentFilter("MY_ACTION")
        registerReceiver(testBroadcast, intentFilter)
    }

}