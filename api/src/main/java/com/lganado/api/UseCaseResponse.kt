package com.lganado.api.login

sealed class UseCaseResponse<out T: Any> {
    data class Error(val errorMessage: String) : UseCaseResponse<Nothing>()
    data class Success<T: Any>(val data: T) : UseCaseResponse<T>()
}