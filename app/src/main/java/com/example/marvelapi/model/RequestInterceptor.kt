package com.example.marvelapi.model

import okhttp3.Interceptor
import okhttp3.Response

object RequestInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        println ("Исходящий запрос на ${request.url}")
        return chain.proceed(request)
    }



}