package com.example.sharingdatabetweentwofragment.Fragment

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sharingdatabetweentwofragment.R

class CashFinalFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =  inflater.inflate(R.layout.fragment_cash_final, container, false)

        val textusername = binding.findViewById<TextView>(R.id.Usernamecash)
        val amount = binding.findViewById<EditText>(R.id.amount)
        val cashbtn = binding.findViewById<Button>(R.id.sendbtn)

        cashbtn.setOnClickListener {
            val amountsent = amount.text.toString()
            val args =Bundle()
            args.putString("amount",amountsent)
            findNavController().navigate(R.id.action_cashFinalFragment_to_dailogFragment,args)


        }


        var name = arguments?.getString("name")
        textusername.text = "Send cash to $name"



        return binding

    }



}