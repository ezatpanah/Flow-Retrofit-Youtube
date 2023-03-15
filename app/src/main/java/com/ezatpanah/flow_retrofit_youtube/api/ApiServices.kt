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

    //List all supported coins price, market cap, volume, and market related data
    //https://api.coingecko.com/api/v3/coins/markets?vs_currency=eur&order=market_cap_desc&per_page=100&page=1&sparkline=false
    @GET("coins/markets?sparkline=true")
    suspend fun getCoinsMarket(@Query("vs_currency")vs_currency: String) : Response<ResponseCoinsMarkets>

    //Get details data (name, price, market, ... including exchange tickers) for a coin
    //https://api.coingecko.com/api/v3/coins/bitcoin?sparkline=true
    @GET("coins/{id}?sparkline=true")
    suspend fun getDetailsCoin(@Path("id") id: String) : Response<ResponseDetailsCoin>


}