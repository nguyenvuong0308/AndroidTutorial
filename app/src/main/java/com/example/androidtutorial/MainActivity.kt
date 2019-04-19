package com.example.androidtutorial

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.androidtutorial.collapsingtoolbar.CoordinatorActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
        btnCollapsingToolBar.setOnClickListener {
            startActivity(Intent(this, CoordinatorActivity::class.java))
        }
        btnShowBottomSheetDialogFragment.setOnClickListener {
            BottomSheetDialogFrag().show(supportFragmentManager, "TAG1")
        }
    }
}
