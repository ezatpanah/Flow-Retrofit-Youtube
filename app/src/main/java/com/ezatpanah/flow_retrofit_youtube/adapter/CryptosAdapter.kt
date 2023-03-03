package com.ezatpanah.flow_retrofit_youtube.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ezatpanah.flow_retrofit_youtube.databinding.ItemBinding
import com.ezatpanah.flow_retrofit_youtube.response.ResponseCoinsMarkets
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
    }

    inner class ViewHolder() : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(item: ResponseCoinsMarkets.ResponseCoinsMarketsItem) {
            binding.apply {
                tvId.text = item.id
                tvSymbol.text = item.symbol
            }

        }
    }

    private var onItemClickListener: ((ResponseCoinsMarkets) -> Unit)? = null

    fun setOnItemClickListener(listener: (ResponseCoinsMarkets) -> Unit) {
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
