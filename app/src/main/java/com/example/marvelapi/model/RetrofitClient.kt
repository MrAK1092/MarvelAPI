package com.example.marvelapi.model

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val baseUrl = "https://gateway.marvel.com/v1/public/"

    val okHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(RequestInterceptor)
        .build()

    fun getClient():Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}