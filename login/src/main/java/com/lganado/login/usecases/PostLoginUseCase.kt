package com.lganado.login.usecases

import com.lganado.api.login.LoginRequest
import com.lganado.api.login.LoginResponse
import com.lganado.api.login.UseCaseResponse
import com.lganado.login.remote.LoginRepository
import remote.LoginService
import javax.inject.Inject

class PostLoginUseCase @Inject constructor(private val loginService: LoginService) {

    suspend operator fun invoke(loginRequest: LoginRequest): UseCaseResponse<LoginResponse> {
        return loginService.getLoginToken(loginRequest)
    }
}