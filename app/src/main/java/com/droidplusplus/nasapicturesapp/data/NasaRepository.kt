package com.droidplusplus.nasapicturesapp.data

import androidx.lifecycle.LiveData
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse

interface NasaRepository{
    suspend fun getNasaResponse():LiveData<List<NasaResponse>>
}