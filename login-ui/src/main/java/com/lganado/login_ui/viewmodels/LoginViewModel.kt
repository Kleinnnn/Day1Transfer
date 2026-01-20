package com.lganado.login_ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lganado.api.login.LoginApiInteractor
import com.lganado.api.login.LoginResponse
import com.lganado.api.login.UseCaseResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val loginApiInteractor: LoginApiInteractor) : ViewModel() {

    private val _response = MutableStateFlow<LoginResponse>(LoginResponse())
    val response: Flow<LoginResponse> get() = _response.asStateFlow()

    private val _errorMessage = MutableStateFlow<String>("")
    val errorMessage: Flow<String> get() = _errorMessage.asStateFlow()

    init {
        getLoginToken()
    }

    private fun getLoginToken() {
        viewModelScope.launch(Dispatchers.IO) {
            val res = loginApiInteractor.getLoginToken()
            when (res) {
                is UseCaseResponse.Error -> {
                   _errorMessage.value = res.errorMessage
                }
                is UseCaseResponse.Success -> {
                    _response.value = res.data
                }
            }
        }
    }
}