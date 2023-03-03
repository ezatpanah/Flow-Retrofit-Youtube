package com.ezatpanah.flow_retrofit_youtube.response


import com.google.gson.annotations.SerializedName

data class ResponsePingServer(
    @SerializedName("gecko_says")
    val geckoSays: String
)