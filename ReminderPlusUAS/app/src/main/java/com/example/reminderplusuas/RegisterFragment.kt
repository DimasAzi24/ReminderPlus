package com.example.reminderplusuas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.reminderplus.databinding.FragmentRegister2Binding
import com.google.firebase.auth.FirebaseAuth


class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegister2Binding
    private lateinit var auth: FirebaseAuth
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegister2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)


        binding.back.setOnClickListener {

        }

        binding.daftar.setOnClickListener {
            val email = binding.editTextTextEmailAddress.toString()
            val password = binding.editTextTextPassword.toString()
            val nohp = binding.phone.toString()
            val nama = binding.namapengguna.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && nohp.isNotEmpty() && nama.isNotEmpty()) {
                registerUser(email, password, nohp, nama)
                }
            else{
                    Toast.makeText(context, "Lengkapi data!", Toast.LENGTH_SHORT).show()
                }
            }
        }

    private fun registerUser(email: String, password: String, nohp: String, nama: String ) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful)

            else
                Toast.makeText(context, it.exception.toString(), Toast.LENGTH_SHORT).show()

        }
    }

    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        auth = FirebaseAuth.getInstance()
    }
}