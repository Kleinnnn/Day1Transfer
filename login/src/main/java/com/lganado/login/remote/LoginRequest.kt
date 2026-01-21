package com.lganado.api.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    var username: String,
    var password: String
) {

}

@Serializable
data class LoginResponse(
    var token: String = ""
)
