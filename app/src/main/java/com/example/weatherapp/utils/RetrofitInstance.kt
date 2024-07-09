package com.example.weatherapp.utils

import com.example.weatherapp.data.APIInterface
import okhttp3.internal.Util
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: APIInterface by lazy {
        Retrofit.Builder()
            .baseUrl(Utils.base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIInterface::class.java)
    }
}