package com.rick.labios.data.remote.camera


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("data")
    val data: Data,
    @SerializedName("success")
    val success: Boolean
)