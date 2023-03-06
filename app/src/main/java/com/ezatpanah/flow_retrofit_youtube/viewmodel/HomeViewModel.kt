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
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    private val _serverStatus = MutableLiveData<DataStatus<ResponsePingServer>>()
    val serverStatus: LiveData<DataStatus<ResponsePingServer>>
        get() = _serverStatus

    fun getServerStatus() = viewModelScope.launch {
        repository.getServerStatus().collect{
            _serverStatus.value=it
        }
    }


    private val _coinsList = MutableLiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>()
    val coinsList: LiveData<DataStatus<List<ResponseCoinsMarkets.ResponseCoinsMarketsItem>>>
        get() = _coinsList


    fun getCoinsList(vs_currency: String) = viewModelScope.launch {
        repository.getCoinsList(vs_currency).collect{
            _coinsList.value =it
        }
    }



}