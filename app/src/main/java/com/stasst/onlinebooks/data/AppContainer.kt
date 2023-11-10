package com.stasst.onlinebooks.data

import com.stasst.onlinebooks.network.BookService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val booksRetrofit: BooksRepository
}

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://www.googleapis.com/books/v1/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: BookService by lazy{
        retrofit.create(BookService::class.java)
    }

    override val booksRetrofit: BooksRepository by lazy {
        NetworkBooksRepository(retrofitService)
    }
}