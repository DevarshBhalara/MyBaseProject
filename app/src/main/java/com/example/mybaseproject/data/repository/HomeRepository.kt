package com.example.mybaseproject.data.repository

import com.example.mybaseproject.data.services.ApiService

class HomeRepository(private val apiService: ApiService) : BaseRepository() {

//    suspend fun getRandomSlok(ch: Int, slok: Int) = flow<Resource<Slok>> {
//        emit(Resource.Loading())
//        try {
//            apiService.getRandomSlok(ch, slok).let { response ->
//                val resource = handleResponse(response)
//                emit(resource)
//            }
//        } catch (e: Exception) {
//            Log.d("response", e.localizedMessage)
//        }
//
//    }.flowOn(Dispatchers.IO)
//
//    suspend fun getChapters() = flow<Resource<ArrayList<Chapter>>> {
//        emit(Resource.Loading())
//        try {
//            apiService.getChapters().let { response ->
//                val resource = handleResponse(response)
//                emit(resource)
//            }
//        } catch (e: Exception) {
//            Log.d("response", e.localizedMessage)
//        }
//    }.flowOn(Dispatchers.IO)
}