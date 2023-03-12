package com.ezatpanah.flow_retrofit_youtube.response

data class CoinDetails(
    val block_time_in_minutes: Int?,
    val categories: List<String>?,
    val coingecko_rank: Int?,
    val coingecko_score: Double?,
    val community_score: Double?,
    val country_origin: String?,
    val developer_score: Double?,
    val genesis_date: String?,
    val hashing_algorithm: String?,
    val id: String?,
    val last_updated: String?,
    val liquidity_score: Double?,
    val market_cap_rank: Int?,
    val name: String?,
    val public_interest_score: Double?,
    val sentiment_votes_down_percentage: Double?,
    val sentiment_votes_up_percentage: Double?,
    val symbol: String?,
)
