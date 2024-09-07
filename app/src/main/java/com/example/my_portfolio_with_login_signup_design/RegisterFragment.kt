package com.example.my_portfolio_with_login_signup_design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.my_portfolio_with_login_signup_design.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.alreadyHaveAnAccount.setOnClickListener {

            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)

        }

        binding.registerButton.setOnClickListener {

            findNavController().navigate(R.id.action_registerFragment_to_portfolioFragment)

        }

        return binding.root
    }
}