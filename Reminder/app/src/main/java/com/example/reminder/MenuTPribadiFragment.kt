package com.example.reminder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reminderplus.databinding.FragmentMenuTPribadiBinding
import com.example.reminderplus.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth

private lateinit var binding: FragmentMenuTPribadiBinding
private lateinit var auth: FirebaseAuth

class MenuTPribadiFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuTPribadiBinding.inflate(inflater, container, false)
        return binding.root

    }


}