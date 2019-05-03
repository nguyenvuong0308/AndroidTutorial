package com.example.androidtutorial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtutorial.broadcast.BroadCastSimpleActivity
import com.example.androidtutorial.collapsingtoolbar.CoordinatorActivity
import com.example.androidtutorial.thread.ThreadActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btnCollapsingToolBar.setOnClickListener {
            startActivity(Intent(this, CoordinatorActivity::class.java))
        }
        btnShowBottomSheetDialogFragment.setOnClickListener {
            BottomSheetDialogFrag().show(supportFragmentManager, "TAG1")
        }

        btnTestBroadcast.setOnClickListener {
            startActivity(Intent(this, BroadCastSimpleActivity::class.java))
        }

        btnTestBroadcast.setOnClickListener {
            startActivity(Intent(this, BroadCastSimpleActivity::class.java))
        }

        btnThread.setOnClickListener {
            startActivity(Intent(this, ThreadActivity::class.java))
        }
    }
}
