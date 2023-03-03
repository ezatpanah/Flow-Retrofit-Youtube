package com.ezatpanah.flow_retrofit_youtube.utils

import android.content.Context
import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat

fun View.isVisible(isShowLoading: Boolean, container: View) {
    if (isShowLoading) {
        this.visibility = View.VISIBLE
        container.visibility = View.GONE
    } else {
        this.visibility = View.GONE
        container.visibility = View.VISIBLE
    }
}

fun Context.getCompatColor(@ColorRes colorId: Int) =
    ResourcesCompat.getColor(resources, colorId, null)