package com.example.daggerhiltsimpleproject.di

import android.app.Application
import com.example.daggerhiltsimpleproject.data.remote.MyApi
import com.example.daggerhiltsimpleproject.data.repository.MyRepositoryImpl
import com.example.daggerhiltsimpleproject.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //all these dependencies will live as long as the application does
object AppModule {
    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi, app: Application): MyRepository {
        return MyRepositoryImpl(api, app)
    }
}