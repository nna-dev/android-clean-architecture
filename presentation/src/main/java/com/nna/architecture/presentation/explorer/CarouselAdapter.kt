package com.nna.architecture.presentation.explorer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nna.architecture.presentation.R
import com.nna.architecture.presentation.databinding.ItemCarouselBinding

class CarouselAdapter : RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {
    private val carouselList = mutableListOf<CarouselVO>()
    private lateinit var binding: ItemCarouselBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        binding = ItemCarouselBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarouselViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(R.drawable.carousel_example)
            .centerCrop()
            .into(holder.iv)
    }

    override fun getItemCount(): Int {
        return 5
    }

    fun setCarousels(list: List<CarouselVO>) {
        carouselList.clear()
        carouselList.addAll(list)
        notifyDataSetChanged()
    }

    class CarouselViewHolder(binding: ItemCarouselBinding) : RecyclerView.ViewHolder(binding.root) {
        val iv = binding.carouselImg
    }
}