package com.lganado.login.remote

import com.lganado.api.login.LoginApiInteractor
import com.lganado.api.login.LoginRequest
import com.lganado.api.login.LoginResponse
import com.lganado.api.login.UseCaseResponse

interface LoginRepository {

    suspend fun getLoginToken(loginRequest: LoginRequest): UseCaseResponse<LoginResponse>
}