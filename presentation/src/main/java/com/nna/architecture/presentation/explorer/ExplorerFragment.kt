package com.nna.architecture.presentation.explorer

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.nna.architecture.presentation.R
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
        setHasOptionsMenu(true)
        binding.carousel.apply {
            adapter = CarouselAdapter()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.explorer_menu, menu)
    }
}