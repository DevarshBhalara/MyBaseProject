package com.example.mybaseproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mybaseproject.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
  private val homeRepository: HomeRepository
) : ViewModel() {
//
//    private val _randomSlok = MutableStateFlow<DisplayRandomSlok?>(null)
//    var randomSlok = _randomSlok.asStateFlow()
//
//    private val _chapters = MutableStateFlow<ArrayList<Chapter>>(arrayListOf())
//    var chapters = _chapters.asStateFlow()
//
//    private val _isLoading = MutableStateFlow(false)
//    val isLoading = _isLoading.asStateFlow()
//
//    private val _errorMessage = MutableStateFlow("")
//    val errorMessage = _errorMessage.asStateFlow()
//
//    init {
//        getChapter()
//    }
//
//    private fun getChapter() {
//        viewModelScope.launch {
//            homeRepository.getChapters().collectLatest { resource ->
//                when(resource) {
//                    is Resource.Loading -> {
//                        _isLoading.emit(true)
//                    }
//
//                    is Resource.Success -> {
//                        _isLoading.emit(false)
//                        resource.data?.let {
//                            _chapters.emit(it)
//                        }
//                    }
//
//                    is Resource.Error -> {
//                        _isLoading.emit(false)
//                        resource.message?.let { Log.d("response", it) }
//                    }
//                }
//            }
//        }
//    }
//
//    fun getRandomSlok(ch: Int, slok: Int) {
//        viewModelScope.launch {
//            homeRepository.getRandomSlok(ch, slok).collectLatest { resource ->
//                when(resource) {
//                    is Resource.Loading -> {
//                        _isLoading.emit(true)
//                    }
//
//                    is Resource.Success -> {
//                        _isLoading.emit(false)
//                        resource.data?.let { slok ->
//                            Log.d("response", slok.slok ?: "No")
//                            // TODO: Handle null Values
//                            _randomSlok.emit(slok.siva?.et?.let { DisplayRandomSlok(it, slok.chapter, slok.verse) })
//                        }
//                    }
//
//                    is Resource.Error -> {
//                        _isLoading.emit(false)
//                        resource.message?.let {
//                            _errorMessage.emit(it)
//                        }
//                    }
//                }
//            }
//        }
//    }
}