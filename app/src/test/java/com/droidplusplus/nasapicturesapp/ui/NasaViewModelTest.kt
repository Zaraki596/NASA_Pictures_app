package com.droidplusplus.nasapicturesapp.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.droidplusplus.nasapicturesapp.data.NasaRepositoryImpl
import com.droidplusplus.nasapicturesapp.getOrAwaitValue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NasaViewModelTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var nasaViewModel: NasaViewModel

    @Before
    fun setUpViewModel(){
        // Given a fresh ViewModel
        nasaViewModel = NasaViewModel(NasaRepositoryImpl(ApplicationProvider.getApplicationContext(), NasaRepositoryImpl.MoshiFactory.getInstance()))
    }

    @Test
    fun `check if the returned data is not null`() = runBlockingTest {
        // When adding a new Response Data
        nasaViewModel.getNasaData()

        val value = nasaViewModel.nasaLiveData.getOrAwaitValue()

        assertNotNull(value)

    }

}