package com.lganado.login.remote

import com.lganado.api.login.LoginApiInteractor
import com.lganado.api.login.LoginRequest
import com.lganado.api.login.LoginResponse
import com.lganado.api.login.UseCaseResponse
import com.lganado.login.usecases.PostLoginUseCase
import remote.LoginService

class LoginApiInteractorImpl(loginService: LoginService): LoginApiInteractor {

    private val postLoginUseCase = PostLoginUseCase(loginService)

    override suspend fun getLoginToken(loginRequest: LoginRequest): UseCaseResponse<LoginResponse> {
        return postLoginUseCase.invoke(loginRequest)
    }

}