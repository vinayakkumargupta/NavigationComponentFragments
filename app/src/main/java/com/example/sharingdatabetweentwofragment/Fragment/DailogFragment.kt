package com.example.sharingdatabetweentwofragment.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.sharingdatabetweentwofragment.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.w3c.dom.Text


class DailogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_dailog, container, false)
        val btnyes = binding.findViewById<Button>(R.id.Yes)
        val btnno = binding.findViewById<Button>(R.id.No)
        val textDisplay = binding.findViewById<TextView>(R.id.textdailog)

        val username = arguments?.getString("name")
        val amount = arguments?.getString("amount")
        textDisplay.text = "Are you sure You want to Send $amount to $username"

        btnyes.setOnClickListener {
            Toast.makeText(activity, "Succesfully sent $amount to $username", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        return binding
    }


}