package com.droidplusplus.nasapicturesapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.droidplusplus.nasapicturesapp.data.NasaRepositoryImpl
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import kotlinx.coroutines.launch

class NasaViewModel(private val nasaRepository: NasaRepositoryImpl) : ViewModel() {

    //Here creating mutable version to pass the data
    private val mNasaLiveData : MutableLiveData<List<NasaResponse>> = MutableLiveData()
    //To observe that data we use this
    val nasaLiveData :LiveData<List<NasaResponse>> = mNasaLiveData


    fun getNasaData() {
        viewModelScope.launch {
            mNasaLiveData.postValue(nasaRepository.getNasaResponse().value)
        }
    }

}