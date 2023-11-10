package com.stasst.onlinebooks.network

import com.stasst.onlinebooks.OnlineBooks
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): OnlineBooks

}