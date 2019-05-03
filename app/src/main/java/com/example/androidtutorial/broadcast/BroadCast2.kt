package com.example.androidtutorial.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadCast2: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "BroadCast2", Toast.LENGTH_SHORT).show()
        Log.d("BroadCast2", intent?.getStringExtra("data") ?: "text")
        val result = getResultExtras(true)
        result.putString("data", "data is change")
    }
}