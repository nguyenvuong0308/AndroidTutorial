package com.example.androidtutorial.broadcast

import android.Manifest
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtutorial.R
import kotlinx.android.synthetic.main.broadcast_act.*

class BroadCastSimpleActivity : AppCompatActivity() {
    val ACTION = "com.example.androidtutorial.OrderedBroadcast"
    lateinit var broadCast1: BroadCast1
    lateinit var broadCast2: BroadCast2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.broadcast_act)
        broadCast2 = BroadCast2()
        broadCast1 = BroadCast1()
        val intentFilter = IntentFilter()
        intentFilter.addAction(ACTION)
        intentFilter.priority = 1
        registerReceiver(broadCast1, intentFilter, Manifest.permission.SEND_SMS, Handler { msg ->
            Toast.makeText(BroadCastSimpleActivity@ this, msg.toString(), Toast.LENGTH_SHORT).show()
            true
        })
        intentFilter.priority = 2
        registerReceiver(broadCast2, intentFilter)
        btnSendBroadcast.setOnClickListener {
            Intent().also { intent ->
                intent.action = ACTION
                intent.putExtra("data", "Notice me senpai!")
                sendBroadcast(intent)
            }
        }

        btnSendOrderBroadcast.setOnClickListener {
            Intent().also { intent ->
                intent.action = ACTION
                intent.putExtra("data", "Notice me senpai!")
                sendOrderedBroadcast(intent, null)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(broadCast1)
        unregisterReceiver(broadCast2)
    }
}