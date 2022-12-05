package com.nna.architecture.domain.usecase

sealed class Result<out R> {
    data class Success<out R>(val data: R): Result<R>()
    data class Error<R>(val exception: Exception): Result<R>()
    object Loading: Result<Nothing>()

    override fun toString(): String {
        return when(this) {
            is Success -> "Success[data=${data.toString()}]"
            is Error -> "Error[exception=$exception]"
            else -> "Loading"
        }
    }
}