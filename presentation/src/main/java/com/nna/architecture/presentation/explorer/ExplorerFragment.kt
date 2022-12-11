package com.nna.architecture.presentation.explorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nna.architecture.presentation.databinding.FragmentExplorerBinding

class ExplorerFragment : Fragment() {
    private val viewModel: ExplorerViewModel by viewModels()
    private lateinit var binding: FragmentExplorerBinding
    companion object {
        const val TAG = "ExplorerFragment"
        fun newInstance() = ExplorerFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExplorerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}