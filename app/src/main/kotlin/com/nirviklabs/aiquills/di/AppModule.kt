package com.nirviklabs.aiquills.di

import android.content.Context
import androidx.room.Room
import com.nirviklabs.aiquills.token.AppDatabase
import com.nirviklabs.aiquills.token.TokenDao
import com.nirviklabs.aiquills.token.TokenRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context) : AppDatabase{
        return Room.databaseBuilder(context,
            AppDatabase::class.java,
            "app_database").fallbackToDestructiveMigration()
            .build()

    }
    @Provides
    @Singleton
    fun provideTokenDao(appDatabase: AppDatabase ) : TokenDao
            = appDatabase.tokenDao()

    @Provides
    @Singleton
    fun provideTokenRepository(tokenDao: TokenDao): TokenRepository{

        return TokenRepository(tokenDao)

    }


}