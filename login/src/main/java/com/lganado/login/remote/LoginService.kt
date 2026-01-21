package remote

import com.lganado.api.login.LoginRequest
import com.lganado.api.login.LoginResponse
import com.lganado.api.login.UseCaseResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {

    @POST("login")
    fun getLoginToken(@Body loginRequest: LoginRequest): UseCaseResponse<LoginResponse>

}