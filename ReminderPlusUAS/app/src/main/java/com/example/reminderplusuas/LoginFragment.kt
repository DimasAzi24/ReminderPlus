package com.example.reminderplusuas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.reminderplus.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)

        binding.daftar.setOnClickListener {

        }

        binding.login.setOnClickListener{
            val email = binding.editTextTextEmailAddress.toString()
            val password = binding.editTextTextPassword.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                loginUser(email, password)
            }
            else{
                Toast.makeText(context, "Masukan Email dan Password!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loginUser(email: String, password: String){
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
            if(it.isSuccessful){

            }
            else{
                Toast.makeText(context, "Email atau Password Salah!", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        auth = FirebaseAuth.getInstance()
    }
}
