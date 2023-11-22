package com.development.travelwondama.ui.auth.forgot.verification

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.development.travelwondama.databinding.FragmentVerificationBinding
import com.google.android.material.textfield.TextInputLayout

class VerificationFragment : Fragment() {

    private var _binding: FragmentVerificationBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerificationBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        binding?.apply {
            codeOtp.apply {
                addEditTextListener(tilOtp1, tilOtp2, null)
                addEditTextListener(tilOtp2, tilOtp3, tilOtp1)
                addEditTextListener(tilOtp3, tilOtp4, tilOtp2)
                addEditTextListener(tilOtp4, null, tilOtp3)
            }

            btnVerification.setOnClickListener { navigateToCreatePassword() }
        }

        setupToolbar()
    }

    private fun navigateToCreatePassword() {
        val action = VerificationFragmentDirections.actionVerificationFragmentToCreatePasswordFragment()
        findNavController().navigate(action)
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                setDisplayShowTitleEnabled(false)
            }
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {}

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                findNavController().navigateUp()
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.CREATED)
    }

    private fun addEditTextListener(textInput: TextInputLayout?, nextTextInput: TextInputLayout?, beforeTextInput: TextInputLayout?) {
        textInput?.editText?.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (textInput.editText?.text?.length == 1) {
                    nextTextInput?.editText?.requestFocus()
                } else {
                    beforeTextInput?.editText?.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}