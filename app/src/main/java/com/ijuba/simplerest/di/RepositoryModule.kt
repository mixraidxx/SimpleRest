package com.ijuba.simplerest.di



import com.ijuba.simplerest.DataSource.RestDataSource
import com.ijuba.simplerest.repository.UserRepository
import com.ijuba.simplerest.repository.UserRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun userRespository(repo: UserRepositoryImp): UserRepository

}