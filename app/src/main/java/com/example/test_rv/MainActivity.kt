package com.example.test_rv

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val countryList = arrayListOf<Country>(
        Country("German"),
        Country("France")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mAdapter = MainRvAdapter(this, countryList)
        main_rv.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        main_rv.layoutManager = lm
        main_rv.setHasFixedSize(true)





    }
}
