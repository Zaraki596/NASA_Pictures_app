package com.droidplusplus.nasapicturesapp.data

import com.droidplusplus.nasapicturesapp.data.model.NasaResponse

interface NasaRepository{
    suspend fun getNasaResponse(): List<NasaResponse>?
}