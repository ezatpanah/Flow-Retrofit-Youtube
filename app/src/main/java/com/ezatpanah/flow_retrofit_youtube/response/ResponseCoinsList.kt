package com.ezatpanah.flow_retrofit_youtube.response


import com.google.gson.annotations.SerializedName

class ResponseCoinsList : ArrayList<ResponseCoinsList.ResponseCoinsListItem>(){
    data class ResponseCoinsListItem(
        @SerializedName("id")
        val id: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("symbol")
        val symbol: String
    )
}