package com.lganado.day1transfer2.hilt

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
class DataModule {

    val client = OkHttpClient.Builder().build()


    @Provides
    @Singleton
    fun provideLoginService(): LoginService {
        return Retrofit.Builder().baseUrl("https://reqres.in/api/").client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LoginService::class.java)
    }
}