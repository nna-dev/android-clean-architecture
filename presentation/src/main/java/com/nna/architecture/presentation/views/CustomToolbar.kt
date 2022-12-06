package com.nna.architecture.presentation.views

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import com.google.android.material.appbar.MaterialToolbar

class CustomToolbar: MaterialToolbar {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        setBackgroundColor(Color.TRANSPARENT)
    }
}