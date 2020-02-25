package com.droidplusplus.nasapicturesapp.data

import android.content.Context
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class NasaRepositoryImpl(private val context: Context) : NasaRepository {


    override suspend fun getNasaResponse(): List<NasaResponse>? {
        /**
         * Created a new listype because moshi.apapter dosen't take directly the List<NasaRespons> as a parameter
         * */
        val listType = Types.newParameterizedType(List::class.java, NasaResponse::class.java)
        val adapter: JsonAdapter<List<NasaResponse>> = getMoshiInstance().adapter(listType)

        val nasaJson = context.assets.open("data.json").bufferedReader().use { it.readText() }
        return adapter.fromJson(nasaJson)
    }


    /**
     * Creating a static object to get the instance of the moshi builder
     * */
    companion object MoshiFactory {
        private val moshi: Moshi? = null

        // Singleton moshi initialization
        fun getMoshiInstance(): Moshi {
            return moshi ?: Moshi.Builder().build()
        }
    }
}