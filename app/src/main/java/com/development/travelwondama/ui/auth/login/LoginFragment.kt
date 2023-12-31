package com.development.travelwondama.ui.auth.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.development.travelwondama.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        binding?.apply {
            btnLogin.setOnClickListener {
                navigateToHome()
            }
            tvRegister.setOnClickListener {
                navigateToRegister()
            }
            tvForgot.setOnClickListener {
                navigateToForgot()
            }
        }
    }

    private fun navigateToHome() {
        val action = LoginFragmentDirections.actionLoginFragmentToMainActivity()
        findNavController().navigate(action)
    }

    private fun navigateToRegister() {
        val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
        findNavController().navigate(action)
    }

    private fun navigateToForgot() {
        val action = LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment()
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}