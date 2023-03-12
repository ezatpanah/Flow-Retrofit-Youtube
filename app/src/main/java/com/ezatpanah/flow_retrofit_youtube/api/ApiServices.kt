package com.ezatpanah.flow_retrofit_youtube.api

import com.ezatpanah.flow_retrofit_youtube.response.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    //Check API server status
    //https://api.coingecko.com/api/v3/ping

    @GET("ping")
    suspend fun getServerStatus() : Response<ResponsePingServer>

    //List all supported coins id, name and symbol (no pagination required)
    //https://api.coingecko.com/api/v3/coins/list?include_platform=false
    @GET("coins/list")
    suspend fun getCoinsList(@Query("include_platform") include_platform: Boolean) : Response<ResponseCoinsList>

    //List all supported coins price, market cap, volume, and market related data
    //https://api.coingecko.com/api/v3/coins/markets?vs_currency=eur&order=market_cap_desc&per_page=100&page=1&sparkline=false
    @GET("coins/markets")
    suspend fun getCoinsMarket(@Query("vs_currency")vs_currency: String) : Response<ResponseCoinsMarkets>

    //Get details data (name, price, market, ... including exchange tickers) for a coin
    //https://api.coingecko.com/api/v3/coins/bitcoin
    @GET("coins/{id}")
    suspend fun getDetailsCoin(@Path("id") id: String) : Response<CoinDetails>

    //Get historical market data include price, market cap, and 24h volume (granularity auto)
    /**
    Get historical market data include price, market cap, and 24h volume (granularity auto)
    Data granularity is automatic (cannot be adjusted)
    1 day from current time = 5 minute interval data
    1 - 90 days from current time = hourly data
    above 90 days from current time = daily data (00:00 UTC)
     */
    //https://api.coingecko.com/api/v3/coins/bitcoin/market_chart?vs_currency=eur&days=10
    @GET("coins/{id}/")
    suspend fun getCoinsHistorical(@Path("id") id: String) : Response<ResponseHistoricalMarketData>

}