package com.example.sharingdatabetweentwofragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sharingdatabetweentwofragment.R




class MoneyTransferFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =  inflater.inflate(R.layout.fragment_money_transfer, container, false)
        val btncancel = binding.findViewById<Button>(R.id.cancelbtn)
        val btnsend = binding.findViewById<Button>(R.id.sendbtn)
        val recievername = binding.findViewById<EditText>(R.id.enteramount)
        btncancel.setOnClickListener {
            findNavController().navigate(R.id.action_moneyTransferFragment_to_homefragment)

        }
        btnsend.setOnClickListener {
            val rename = recievername.text.toString()
            val args =Bundle()
            args.putString("name",rename)
            findNavController().navigate(R.id.action_moneyTransferFragment_to_cashFinalFragment,args)


        }


   return binding
    }


}