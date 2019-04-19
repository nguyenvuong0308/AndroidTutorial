package com.example.androidtutorial.collapsingtoolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidtutorial.R
import kotlinx.android.synthetic.main.collapsingtoolbar_activity.*

class CoordinatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.collapsingtoolbar_activity)
        initData()
    }

    private fun initData() {
        rcvText.layoutManager = LinearLayoutManager(this)
        rcvText.setHasFixedSize(false)
        rcvText.adapter = Adapter(this, arrayListOf<String>().apply {
           for (index in 0..50) {
               add("Minh Vuong $index")
           }
        })

        ivBack.setOnClickListener {
            finish()
        }
    }
}
