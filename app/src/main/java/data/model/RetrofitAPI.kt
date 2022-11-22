package data.model

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET ("characters")
    fun getChar(): Call<List<Characters>>

    @GET ("comics")
    fun getComics(): Call<List<Comics>>
}