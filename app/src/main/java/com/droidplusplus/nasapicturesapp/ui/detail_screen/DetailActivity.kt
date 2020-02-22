package com.droidplusplus.nasapicturesapp.ui.detail_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.nasapicturesapp.R
import com.droidplusplus.nasapicturesapp.data.NasaRepositoryImpl
import com.droidplusplus.nasapicturesapp.ui.NasaViewModel
import com.droidplusplus.nasapicturesapp.ui.NasaViewModelFactory
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {


    private val detailsAdapter: DetailsAdapter by lazy {
        DetailsAdapter()
    }

    private val clickedPosition: Int by lazy {
        intent.getIntExtra("position", 0)
    }

    private lateinit var nasaViewModel: NasaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        viewModelSetUp()

        loadDataAndUpdateUI()
    }

    private fun loadDataAndUpdateUI() {
        //Get the data from the viewModel
        nasaViewModel.getNasaData()

        vpDetailScreen.adapter = detailsAdapter
        vpDetailScreen.setPageTransformer(ViewPagerTransformation())


        //Observing the data and applying the appropriate data condition
        nasaViewModel.nasaLiveData.observe(this, Observer {
            it?.let {
                detailsAdapter.swapData(it)
                //Set smooth scroll to false so that it doesn't animate when selected at certain position
                vpDetailScreen.setCurrentItem(clickedPosition, false)
            }
        })
    }

    private fun viewModelSetUp() {
        //Getting the instance of the Viewmodel
        nasaViewModel = ViewModelProvider(
            this,
            NasaViewModelFactory(
                NasaRepositoryImpl(this)
            )
        ).get(NasaViewModel::class.java)
    }
}
