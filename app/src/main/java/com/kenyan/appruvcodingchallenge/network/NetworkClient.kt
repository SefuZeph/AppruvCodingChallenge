package com.kenyan.appruvcodingchallenge.network

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NetworkClient {
    private val BASE_URL = "https://stage.appruve.co"
    private var retrofit: Retrofit? = null

    fun getRetrofitClient(context: Context): Retrofit? {
        if (retrofit == null) {
            val okHttpClient = OkHttpClient.Builder()
                .build()
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }

}