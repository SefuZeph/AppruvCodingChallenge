package com.kenyan.appruvcodingchallenge.network

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


interface UploadService {
    @Multipart
    @POST("/v1/verifications/test/file_upload")
    fun uploadImage(
        @Part document: MultipartBody.Part,
        @Part("user_id") userId: Int
    ): Call<ResponseBody>

}