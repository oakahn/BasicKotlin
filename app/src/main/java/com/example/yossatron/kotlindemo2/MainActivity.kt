package com.example.yossatron.kotlindemo2

import android.support.v7.app.AppCompatActivity
import android.support.v4.app.Fragment
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportFragmentManager.beginTransaction()
               .replace(R.id.container,MainFragment.newInstance())
               .commit()
    }
    fun changeFragnment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()

    }
}
