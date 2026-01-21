package com.lganado.day1transfer2.hilt

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import di.LoginModule

@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        LoginModule::class,
        DataModule::class
    ]
)
interface AggregatorModule