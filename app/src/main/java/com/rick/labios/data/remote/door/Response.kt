package com.rick.labios.data.remote.door


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("success")
    val success: Boolean
)