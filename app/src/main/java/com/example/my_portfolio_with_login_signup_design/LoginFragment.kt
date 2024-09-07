package com.example.my_portfolio_with_login_signup_design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.my_portfolio_with_login_signup_design.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.createNewAccount.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)

        }

        binding.loginButton.setOnClickListener {

            Toast.makeText(requireActivity(), "Login Successfully!", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_loginFragment_to_portfolioFragment)

        }

        return binding.root
    }

}