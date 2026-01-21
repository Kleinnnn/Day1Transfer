package di

import com.lganado.api.login.LoginApiInteractor
import com.lganado.login.presentation.screens.LoginScreen
import com.lganado.login.remote.LoginApiInteractorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import remote.LoginService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginModule {

    @Provides
    fun provideLoginApiInteractor(loginService: LoginService): LoginApiInteractor {
        return LoginApiInteractorImpl(loginService)
    }
}