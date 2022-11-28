package com.iamquan.exambroacastreceiver2

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class TestBroadcast(val useText: (String?) -> Unit) : BroadcastReceiver() {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (p1?.action == "MY_ACTION") {
            val textSent = p1.getStringExtra("TEXT_SENT")
            useText(textSent)
        }
    }
}