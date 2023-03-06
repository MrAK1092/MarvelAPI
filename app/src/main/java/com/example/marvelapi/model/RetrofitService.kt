package com.example.marvelapi.model

class RetrofitService {
    private val retrofit = RetrofitClient.getClient()
    private val retrofitAPI = retrofit.create(RetrofitAPI::class.java)
}