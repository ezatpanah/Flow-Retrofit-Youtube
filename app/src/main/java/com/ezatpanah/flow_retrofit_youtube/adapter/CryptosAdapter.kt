package com.ezatpanah.flow_retrofit_youtube.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ezatpanah.flow_retrofit_youtube.R
import com.ezatpanah.flow_retrofit_youtube.databinding.ItemBinding
import com.ezatpanah.flow_retrofit_youtube.response.ResponseCoinsMarkets
import com.ezatpanah.flow_retrofit_youtube.utils.Constants
import com.ezatpanah.flow_retrofit_youtube.utils.roundToThreeDecimals
import com.ezatpanah.flow_retrofit_youtube.utils.toDoubleFloatPairs
import javax.inject.Inject

class CryptosAdapter @Inject() constructor() : RecyclerView.Adapter<CryptosAdapter.ViewHolder>() {

    private lateinit var binding: ItemBinding
    private lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemBinding.inflate(inflater, parent, false)
        context = parent.context
        return ViewHolder()
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
        holder.setIsRecyclable(false)
    }

    inner class ViewHolder() : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(item: ResponseCoinsMarkets.ResponseCoinsMarketsItem) {
            binding.apply {
                tvName.text = item.id
                tvSymbol.text = item.symbol?.uppercase()
                tvPrice.text = "€${item.currentPrice?.roundToThreeDecimals()}"
                imgCrypto.load(item.image) {
                    crossfade(true)
                    crossfade(500)
                    placeholder(R.drawable.round_currency_bitcoin_24)
                    error(R.drawable.round_currency_bitcoin_24)
                }

                lineChart.gradientFillColors =
                    intArrayOf(
                        Color.parseColor("#2a9085"),
                        Color.TRANSPARENT
                    )

                lineChart.animation.duration = Constants.animationDuration
                val listData = item.sparklineIn7d?.price.toDoubleFloatPairs()
                lineChart.animate(listData)

                root.setOnClickListener {
                    onItemClickListener?.let {
                        it(item)
                    }
                }
            }
        }
    }

    private var onItemClickListener: ((ResponseCoinsMarkets.ResponseCoinsMarketsItem) -> Unit)? = null

    fun setOnItemClickListener(listener: (ResponseCoinsMarkets.ResponseCoinsMarketsItem) -> Unit) {
        onItemClickListener = listener
    }

    private val differCallback = object : DiffUtil.ItemCallback<ResponseCoinsMarkets.ResponseCoinsMarketsItem>() {
        override fun areItemsTheSame(oldItem: ResponseCoinsMarkets.ResponseCoinsMarketsItem, newItem: ResponseCoinsMarkets.ResponseCoinsMarketsItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ResponseCoinsMarkets.ResponseCoinsMarketsItem, newItem: ResponseCoinsMarkets.ResponseCoinsMarketsItem): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)
}
