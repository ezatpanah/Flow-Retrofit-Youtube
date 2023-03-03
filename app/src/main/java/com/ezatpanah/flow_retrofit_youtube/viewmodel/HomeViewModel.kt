package com.ezatpanah.flow_retrofit_youtube.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ezatpanah.flow_retrofit_youtube.repository.ApiRepository
import com.ezatpanah.flow_retrofit_youtube.response.ResponseCoinsMarkets
import com.ezatpanah.flow_retrofit_youtube.response.ResponsePingServer
import com.ezatpanah.flow_retrofit_youtube.utils.DataStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    private val _serverStatus = MutableLiveData<DataStatus<ResponsePingServer>>()
    val serverStatus: LiveData<DataStatus<ResponsePingServer>>
        get() = _serverStatus

    private val _coinsList = MutableLiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>()
    val coinsList: LiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>
        get() = _coinsList


    fun getServerStatus() = viewModelScope.launch {
        _serverStatus.postValue(DataStatus.loading())
        val response = repository.getServerStatus()
        _serverStatus.postValue(handleServerStatusResponse(response))
    }

    private fun handleServerStatusResponse(response: Response<ResponsePingServer>): DataStatus<ResponsePingServer> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return DataStatus.success(resultResponse)
            }
        }
        return DataStatus.error(response.message())
    }


    fun getCoinsList(vs_currency: String) = viewModelScope.launch {
        _coinsList.postValue(DataStatus.loading())
        val response = repository.getCoinsList(vs_currency)
        _coinsList.postValue(handleCoinsListResponse(response))
    }

    private fun handleCoinsListResponse(response: Response<ResponseCoinsMarkets>): DataStatus<ResponseCoinsMarkets> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return DataStatus.success(resultResponse)
            }
        }
        return DataStatus.error(response.message())
    }


}