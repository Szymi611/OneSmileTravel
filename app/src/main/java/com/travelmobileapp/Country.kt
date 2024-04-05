package com.travelmobileapp

import com.google.gson.annotations.SerializedName

data class Country(
    val name: Name,
    val cca2: String,
    val flags: Flags
)


data class Name(
    @SerializedName("common") val commonName: String
)

data class Flags(
    val png: String
)

