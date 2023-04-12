package com.rick.labios.data.remote.door


import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("favorites")
    val favorites: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("room")
    val room: String,
    @SerializedName("snapshot")
    val snapshot: String
)