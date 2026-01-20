package com.lganado.api.login


interface LoginApiInteractor {

    suspend fun getLoginToken(): UseCaseResponse<LoginResponse>
}