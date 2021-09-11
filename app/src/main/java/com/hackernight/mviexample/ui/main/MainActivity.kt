package com.hackernight.mviexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackernight.mviexample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMainFragment()

    }

    /**
     * Display the Main Fragment Inside The Main Activity Container
     */

    private fun showMainFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, MainFragment(),"MainFragment")
            .commit()
    }

}