package com.development.travelwondama.ui.main.profile.account

import android.os.Bundle
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
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentAccountBinding
import com.development.travelwondama.domain.model.User
import com.development.travelwondama.utils.Extensions.showImageInto

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding
    private val navArgs: AccountFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(layoutInflater, container, false)
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
            tvFullNameValue.text = userArgs.name
            tvEmailValue.text = userArgs.email
            tvPhoneValue.text = getString(R.string.phone_id, userArgs.telephone.toString())
            tvAddressValue.text = userArgs.address
            btnUpdate.setOnClickListener { navigateToChangeProfile(userArgs) }
        }

        setupToolbar()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.my_profile)
            }
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {}

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                val action = AccountFragmentDirections.actionAccountFragmentToProfileFragment()
                findNavController().navigate(action)
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.CREATED)
    }

    private fun navigateToChangeProfile(user: User) {
        val action = AccountFragmentDirections.actionAccountFragmentToChangeProfileFragment(user)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}