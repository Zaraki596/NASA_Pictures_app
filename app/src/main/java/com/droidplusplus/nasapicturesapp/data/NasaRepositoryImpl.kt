package com.droidplusplus.nasapicturesapp.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class NasaRepositoryImpl(private val context: Context,
    private val moshi: Moshi = MoshiFactory.getInstance()) : NasaRepository {




    override suspend fun getNasaResponse(): LiveData<List<NasaResponse>> {
        val nasaResponseLiveData = MutableLiveData<List<NasaResponse>>()
        /**
         * Created a new listype because moshi.apapter dosen't take directly the List<NasaRespons> as a parameter
         * */
        val listType = Types.newParameterizedType(List::class.java, NasaResponse::class.java)
        val adapter: JsonAdapter<List<NasaResponse>> = moshi.adapter(listType)

        val nasaJson = context.assets.open("data.json").bufferedReader().use { it.readText() }
        val response = adapter.fromJson(nasaJson)

        nasaResponseLiveData.value = response

        return nasaResponseLiveData
    }



    /**
     * Creating a static object to get the instance of the moshi builder
     * */
    internal object MoshiFactory{
        val moshi = Moshi.Builder().build()

        fun getInstance() = moshi
    }
}