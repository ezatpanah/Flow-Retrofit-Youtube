package com.ezatpanah.flow_retrofit_youtube.repository

import com.ezatpanah.flow_retrofit_youtube.api.ApiServices
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiServices: ApiServices) {

/*    suspend fun getServerStatus(): Flow<DataStatus<ResponsePingServer>> = flow {
        emit(DataStatus.loading())
        val result = apiServices.getServerStatus()
        when (result.code()) {
            200 -> emit(DataStatus.success(result.body()))
            400 -> emit(DataStatus.error(result.message()))
            500 -> emit(DataStatus.error(result.message()))
        }
    }
        .catch {
            emit(DataStatus.error(it.message.toString()))
        }
        .flowOn(Dispatchers.IO)*/

    suspend fun getServerStatus() = apiServices.getServerStatus()
    suspend fun getCoinsList(vs_currency: String) = apiServices.getCoinsMarket(vs_currency)

}