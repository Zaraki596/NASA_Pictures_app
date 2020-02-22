package com.droidplusplus.nasapicturesapp.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.droidplusplus.nasapicturesapp.data.NasaRepository
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NasaViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var nasaViewModel: NasaViewModel

    @MockK
    lateinit var repo: NasaRepository

    @Before
    fun setUpViewModel() {
        MockKAnnotations.init(this)
        // Given a fresh ViewModel
        nasaViewModel = NasaViewModel(repo)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `check if the expected response from the given fake response`() = runBlockingTest {
        val expectedResponse = MutableLiveData(listOf(NasaResponse("hi", "2", "ex", null, "a")))
        coEvery { repo.getNasaResponse() } returns (expectedResponse)
    }

}