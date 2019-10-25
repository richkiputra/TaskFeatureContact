package com.example.task_contact_feature.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.ListFragment
import com.example.task_contact_feature.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var menu : Menu = btm_navigation.menu
        selectedMenu(menu.getItem(0))
        btm_navigation.setOnNavigationItemSelectedListener {
                item: MenuItem ->  selectedMenu(item)

            false
        }

    }

    private fun selectedMenu(item : MenuItem) {
        item.isChecked = true
        when(item.itemId) {
            R.id.itContact -> selectedFragment(FragmentCall.getInstance())

        }
    }

    fun selectedFragment(fragment: FragmentCall) {
        var transaction : FragmentTransaction? = supportFragmentManager.beginTransaction()
        transaction?.replace(R.id.flContainer, fragment)
        transaction?.commit()
    }

    override fun onBackPressed() {
        finish()
    }


}

