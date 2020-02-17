package com.droidplusplus.nasapicturesapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.nasapicturesapp.data.NasaRepositoryImpl


/**
 * Passing an parameter in ViewModel requires you to create the ViewModelFactory class
 * to override the Base Implementation of the Android ViewmodelFactory without parameter*/
class NasaViewModelFactory(private val nasaRepository: NasaRepositoryImpl) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NasaViewModel(
            nasaRepository
        ) as T
    }
}