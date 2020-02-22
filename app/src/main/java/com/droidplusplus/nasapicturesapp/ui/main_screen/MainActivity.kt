package com.droidplusplus.nasapicturesapp.ui.main_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.nasapicturesapp.R
import com.droidplusplus.nasapicturesapp.data.NasaRepositoryImpl
import com.droidplusplus.nasapicturesapp.ui.NasaViewModel
import com.droidplusplus.nasapicturesapp.ui.NasaViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val nasaListAdapter: NasaListAdapter by lazy {
        NasaListAdapter()
    }

    private lateinit var nasaViewModel: NasaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting the instance of the Viewmodel
        nasaViewModel = ViewModelProvider(
            this,
            NasaViewModelFactory(
                NasaRepositoryImpl(this)
            )
        ).get(NasaViewModel::class.java)

        //Get the data from the viewModel
        nasaViewModel.getNasaData()

        rvNasaList.adapter = nasaListAdapter


        //Observing the data and applying the appropriate data condition
        nasaViewModel.nasaLiveData.observe(this, Observer {
            it?.let {
                nasaListAdapter.swapData(it)
            }
        })


    }


}
