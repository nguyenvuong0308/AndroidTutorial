package com.example.androidtutorial.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadCast1: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "BroadCast1", Toast.LENGTH_SHORT).show()
        val result = getResultExtras(true)
        Log.d("BroadCast1", result.getString("data") ?: "text")
    }
}