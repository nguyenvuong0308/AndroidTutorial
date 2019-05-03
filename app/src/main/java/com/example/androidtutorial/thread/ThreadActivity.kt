package com.example.androidtutorial.thread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtutorial.R


class ThreadActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thread_test)
        val hello = DisplayMessage("Hello")
        val thread1 = Thread(hello)
        thread1.setDaemon(true)
        thread1.setName("hello")
        println("Starting hello thread...")
        thread1.start()

        val bye = DisplayMessage("Goodbye")
        val thread2 = Thread(bye)
        thread2.priority = Thread.MIN_PRIORITY
        thread2.isDaemon = true
        println("Starting goodbye thread...")
        thread2.start()

        println("Starting thread3...")
        val thread3 = GuessANumber(27)
        thread3.start()
        try {
            thread3.join()
        } catch (e: InterruptedException) {
            println("Thread interrupted.")
        }

        println("Starting thread4...")
        val thread4 = GuessANumber(75)

        thread4.start()
        println("main() is ending...")
    }
}
