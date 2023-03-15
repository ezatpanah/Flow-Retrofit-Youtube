package com.ezatpanah.flow_retrofit_youtube.response


import com.google.gson.annotations.SerializedName

data class ResponseDetailsCoin(
    @SerializedName("categories")
    val categories: List<String?>?,
    @SerializedName("description")
    val description: Description?,
    @SerializedName("genesis_date")
    val genesisDate: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image")
    val image: Image?,
    @SerializedName("last_updated")
    val lastUpdated: String?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?,
    @SerializedName("market_data")
    val marketData: MarketData?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("symbol")
    val symbol: String?,
) {

    data class Description(
        @SerializedName("en")
        val en: String?,
    )


    data class Image(
        @SerializedName("large")
        val large: String?,
        @SerializedName("small")
        val small: String?,
        @SerializedName("thumb")
        val thumb: String?,
    )

    data class Links(
        @SerializedName("homepage")
        val homepage: List<String?>?,
    )

    data class MarketData(
        @SerializedName("current_price")
        val currentPrice: CurrentPrice?,
        @SerializedName("high_24h")
        val high24h: High24h?,
        @SerializedName("last_updated")
        val lastUpdated: String?,
        @SerializedName("low_24h")
        val low24h: Low24h?,
        @SerializedName("market_cap_change_24h_in_currency")
        val marketCapChange24hInCurrency: MarketCapChange24hInCurrency?,
        @SerializedName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double?,
        @SerializedName("market_cap_change_percentage_24h_in_currency")
        val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency?,
        @SerializedName("price_change_24h")
        val priceChange24h: Double?,
        @SerializedName("price_change_24h_in_currency")
        val priceChange24hInCurrency: PriceChange24hInCurrency?,
        @SerializedName("price_change_percentage_24h")
        val priceChangePercentage24h: Double?,
        @SerializedName("price_change_percentage_24h_in_currency")
        val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency?,
        @SerializedName("sparkline_7d")
        val sparkline7d: Sparkline7d?
    ) {
        data class CurrentPrice(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class High24h(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class Low24h(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class MarketCapChange24hInCurrency(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class MarketCapChangePercentage24hInCurrency(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class PriceChange24hInCurrency(
            @SerializedName("eur")
            val eur: Double?,
        )

        data class PriceChangePercentage24hInCurrency(
            @SerializedName("eur")
            val eur: Double?,
        )


        data class Sparkline7d(
            @SerializedName("price")
            val price: List<Double?>?,
        )

    }

}