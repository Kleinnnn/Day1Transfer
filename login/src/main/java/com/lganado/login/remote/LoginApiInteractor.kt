package com.lganado.api.login


interface LoginApiInteractor {

    suspend fun getLoginToken(loginRequest: LoginRequest): UseCaseResponse<LoginResponse>
}