package com.kenyan.appruvcodingchallenge.network

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


interface UploadService {
    @Multipart
    @POST("/v1/verifications/test/file_upload")
    fun uploadImage(@Part image: MultipartBody.Part?): Call<UploadResponse>
}