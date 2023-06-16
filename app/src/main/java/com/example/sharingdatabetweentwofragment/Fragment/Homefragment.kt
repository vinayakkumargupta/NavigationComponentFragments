package com.example.sharingdatabetweentwofragment.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.sharingdatabetweentwofragment.R


class Homefragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =  inflater.inflate(R.layout.fragment_homefragment, container, false)
        val btntransaction = binding.findViewById<Button>(R.id.Viewtrasactionbtn)
        val btnbalance = binding.findViewById<Button>(R.id.ViewBalanceBTN)
        val btnsendmoney = binding.findViewById<Button>(R.id.SendMoneybtn)

        btntransaction.setOnClickListener {
            findNavController().navigate(R.id.action_homefragment_to_viewTransactionFragment)

        }
        btnbalance.setOnClickListener {
            findNavController().navigate(R.id.action_homefragment_to_viewBalanceFragment)
        }
        btnsendmoney.setOnClickListener {
            findNavController().navigate(R.id.action_homefragment_to_moneyTransferFragment3)
        }





        return binding
    }


}