package com.travelmobileapp.data

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>() // <out T> is a generic type that is covariant, which means that it can be a type of T or any subtype of T
    data class Error(val exception: Exception) : Result<Nothing>()
}