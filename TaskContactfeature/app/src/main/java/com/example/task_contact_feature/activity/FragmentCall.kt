package com.example.task_contact_feature.activity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.task_contact_feature.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentCall : Fragment() {

    companion object{
        fun getInstance(): FragmentCall = FragmentCall()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.activity_second, container, false)
    }
}