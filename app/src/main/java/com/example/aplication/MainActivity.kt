package com.example.aplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottombar=findViewById<BottomNavigationView>(R.id.navigation)
        bottombar.setOnItemReselectedListener {

            if (it.itemId==R.id.gaurd)
            {
                inflateFragment()
            } else if (it.itemId==R.id.home)
            {
                inflateFragmentHome()
            }
            true

        }
    }

    private fun inflateFragmentHome() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()
    }


    private fun inflateFragment() {

        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()



    }


}




