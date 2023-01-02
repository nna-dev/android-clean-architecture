package com.nna.architecture.presentation.views

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.MaterialToolbar
import com.nna.architecture.presentation.R
import com.nna.architecture.presentation.databinding.WidgetCustomToolbarBinding


class CustomToolbar : MaterialToolbar {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    private var binding: WidgetCustomToolbarBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = WidgetCustomToolbarBinding.inflate(inflater, this)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            outlineAmbientShadowColor = ContextCompat.getColor(context, android.R.color.transparent)
            outlineSpotShadowColor = ContextCompat.getColor(context, android.R.color.transparent)
        }
    }
}