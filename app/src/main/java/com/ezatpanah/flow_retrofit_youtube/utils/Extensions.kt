package com.ezatpanah.flow_retrofit_youtube.utils

import android.content.Context
import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import java.text.DecimalFormat

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

fun RecyclerView.initRecycler(layoutManager: RecyclerView.LayoutManager, adapter: RecyclerView.Adapter<*>) {
    this.adapter=adapter
    this.layoutManager=layoutManager
}

fun List<Double?>?.toDoubleFloatPairs(): List<Pair<String, Float>> {
    return this!!.map { d ->
        val f = d!!.toFloat()
        val s = d.toString()
        Pair(s, f)
    }
}

private val formatter2= DecimalFormat("##.##")
private val formatter3= DecimalFormat("##.###")

fun Double.roundToTwoDecimals() = formatter2.format(this).toString()
fun Double.roundToThreeDecimals() = formatter3.format(this).toString()