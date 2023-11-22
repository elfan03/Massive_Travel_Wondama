package com.development.travelwondama.ui.main.profile

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
import com.development.travelwondama.data.UsersData
import com.development.travelwondama.databinding.FragmentProfileBinding
import com.development.travelwondama.domain.model.User
import com.development.travelwondama.utils.Extensions.showImageInto

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val dummyUser = UsersData.dummyUser

        binding?.apply {
            sivProfile.showImageInto(requireActivity(), dummyUser.imageProfile)
            tvName.text = dummyUser.name
            tvEmail.text = dummyUser.email

            contentProfile.apply {
                tvMyProfile.setOnClickListener { navigateToMyProfile(dummyUser) }
                tvFavorite.setOnClickListener { navigateToFavorite() }
                tvWishlist.setOnClickListener { navigateToWishlist() }
                tvChangePassword.setOnClickListener { navigateToChangePassword() }
                tvContactUs.setOnClickListener { navigateToContactUs() }
                tvAboutApp.setOnClickListener { navigateToAboutApp() }
                btnLogout.setOnClickListener { navigateToAuth() }
            }
        }

        setupToolbar()
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
                val action = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
                findNavController().navigate(action)
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.CREATED)
    }

    private fun navigateToMyProfile(user: User) {
        val action = ProfileFragmentDirections.actionProfileFragmentToAccountFragment(user)
        findNavController().navigate(action)
    }

    private fun navigateToFavorite() {
        val action = ProfileFragmentDirections.actionProfileFragmentToFavoriteFragment()
        findNavController().navigate(action)
    }

    private fun navigateToWishlist() {
        val action = ProfileFragmentDirections.actionProfileFragmentToWishlistFragment()
        findNavController().navigate(action)
    }

    private fun navigateToChangePassword() {
        val action = ProfileFragmentDirections.actionProfileFragmentToChangePasswordFragment()
        findNavController().navigate(action)
    }

    private fun navigateToContactUs() {
        val action = ProfileFragmentDirections.actionProfileFragmentToContactUsFragment()
        findNavController().navigate(action)
    }

    private fun navigateToAboutApp() {
        val action = ProfileFragmentDirections.actionProfileFragmentToAboutFragment()
        findNavController().navigate(action)
    }

    private fun navigateToAuth() {
        Toast.makeText(requireActivity(), "Logout berhasil", Toast.LENGTH_SHORT).show()
        val action = ProfileFragmentDirections.actionProfileFragmentToAuthNav()
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}