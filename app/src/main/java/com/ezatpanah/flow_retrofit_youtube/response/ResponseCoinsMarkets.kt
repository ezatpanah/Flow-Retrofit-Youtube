package com.ezatpanah.flow_retrofit_youtube.response


import com.google.gson.annotations.SerializedName

class ResponseCoinsMarkets : ArrayList<ResponseCoinsMarkets.ResponseCoinsMarketsItem>(){
    data class ResponseCoinsMarketsItem(
        @SerializedName("ath")
        val ath: Double?,
        @SerializedName("ath_change_percentage")
        val athChangePercentage: Double?,
        @SerializedName("ath_date")
        val athDate: String?,
        @SerializedName("atl")
        val atl: Double?,
        @SerializedName("atl_change_percentage")
        val atlChangePercentage: Double?,
        @SerializedName("atl_date")
        val atlDate: String?,
        @SerializedName("circulating_supply")
        val circulatingSupply: Double?,
        @SerializedName("current_price")
        val currentPrice: Double?,
        @SerializedName("fully_diluted_valuation")
        val fullyDilutedValuation: Long?,
        @SerializedName("high_24h")
        val high24h: Double?,
        @SerializedName("id")
        val id: String?,
        @SerializedName("image")
        val image: String?,
        @SerializedName("last_updated")
        val lastUpdated: String?,
        @SerializedName("low_24h")
        val low24h: Double?,
        @SerializedName("market_cap")
        val marketCap: Long?,
        @SerializedName("market_cap_change_24h")
        val marketCapChange24h: Double?,
        @SerializedName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double?,
        @SerializedName("market_cap_rank")
        val marketCapRank: Int?,
        @SerializedName("max_supply")
        val maxSupply: Double?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("price_change_24h")
        val priceChange24h: Double?,
        @SerializedName("price_change_percentage_24h")
        val priceChangePercentage24h: Double?,
        @SerializedName("roi")
        val roi: Roi?,
        @SerializedName("sparkline_in_7d")
        val sparklineIn7d: SparklineIn7d?,
        @SerializedName("symbol")
        val symbol: String?,
        @SerializedName("total_supply")
        val totalSupply: Double?,
        @SerializedName("total_volume")
        val totalVolume: Double?
    ) {
        data class Roi(
            @SerializedName("currency")
            val currency: String?,
            @SerializedName("percentage")
            val percentage: Double?,
            @SerializedName("times")
            val times: Double?
        )
    
        data class SparklineIn7d(
            @SerializedName("price")
            val price: List<Double?>?
        )
    }
}