package com.example.ass6fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.ass6fragment.R
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_two, container,false)
        view.btnClickFragOne.setOnClickListener(){
            var flagment: Fragment? = null
            flagment = OneFragment()
            replaceFragment(flagment)
        }
        return view
    }

    fun  replaceFragment(somefragment: Fragment){
        val transaction : FragmentTransaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, somefragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}

