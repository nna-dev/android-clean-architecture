package com.nna.architecture.presentation

import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.nna.architecture.presentation.databinding.ActivityMainBinding
import com.nna.architecture.presentation.explorer.ExplorerFragment

class MainActivity : BaseActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initInsets(binding.root)

        initView()
    }

    private fun initView() {
        binding.bottomNav.apply {
            setOnItemSelectedListener(this@MainActivity)
            selectedItemId = R.id.menu_explore
        }

    }

    private fun showFragment(fragment: Fragment, tag: String? = null) {
        supportFragmentManager.beginTransaction()
            .replace(binding.content.id, fragment, tag)
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_explore -> {
                showFragment(ExplorerFragment.newInstance(), ExplorerFragment.TAG)
            }
            else -> {

            }
        }
        return true
    }
}