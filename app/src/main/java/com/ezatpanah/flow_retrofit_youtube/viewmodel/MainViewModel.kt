package com.ezatpanah.flow_retrofit_youtube.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ezatpanah.flow_retrofit_youtube.repository.ApiRepository
import com.ezatpanah.flow_retrofit_youtube.response.ResponseCoinsMarkets
import com.ezatpanah.flow_retrofit_youtube.response.ResponseDetailsCoin
import com.ezatpanah.flow_retrofit_youtube.response.ResponsePingServer
import com.ezatpanah.flow_retrofit_youtube.utils.DataStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    /**
     * Server Status
     */
    private val _serverStatus = MutableLiveData<DataStatus<ResponsePingServer>>()
    val serverStatus: LiveData<DataStatus<ResponsePingServer>>
        get() = _serverStatus

    fun getServerStatus() = viewModelScope.launch {
        repository.getServerStatus().collect{
            _serverStatus.value=it
        }
    }

    /**
     * List of Coins
     */

    private val _coinsList = MutableLiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>()
    val coinsList: LiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>
        get() = _coinsList


    fun getCoinsList(vs_currency: String) = viewModelScope.launch {
        repository.getCoinsList(vs_currency).collect{
            _coinsList.value =it
        }
    }


    /**
     * Details Coin
     */
    private val _detailsCoin = MutableLiveData<DataStatus<ResponseDetailsCoin>>()
    val detailsCoin: LiveData<DataStatus<ResponseDetailsCoin>>
        get() = _detailsCoin

    fun getDetailsCoin(id: String) = viewModelScope.launch {
        repository.getDetailsCoin(id).collect{
            _detailsCoin.value=it
        }
    }



}