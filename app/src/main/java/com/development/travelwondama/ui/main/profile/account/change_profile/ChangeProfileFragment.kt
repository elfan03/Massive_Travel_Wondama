package com.development.travelwondama.ui.main.profile.account.change_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentChangeProfileBinding
import com.development.travelwondama.domain.model.User
import com.development.travelwondama.utils.Extensions.showImageInto

class ChangeProfileFragment : Fragment() {

    private var _binding: FragmentChangeProfileBinding? = null
    private val binding get() = _binding
    private val navArgs: ChangeProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChangeProfileBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val userArgs = navArgs.user

        binding?.apply {
            sivProfile.showImageInto(requireActivity(), userArgs.imageProfile)
            tilName.editText?.setText(userArgs.name)
            tilEmail.editText?.setText(userArgs.email)
            tilPhone.editText?.setText(getString(R.string.phone_id, userArgs.telephone.toString()))
            tilAddress.editText?.setText(userArgs.address)
            btnSaveChanges.setOnClickListener {
                Toast.makeText(requireActivity(), "Perubahan Tersimpan", Toast.LENGTH_SHORT).show()
                navigateToMyProfile(userArgs)
            }
        }

        setupToolbar()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.change_profile)
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

    private fun navigateToMyProfile(user: User) {
        val action =
            ChangeProfileFragmentDirections.actionChangeProfileFragmentToAccountFragment(user)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}