package com.nirviklabs.aiquills.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/nirviklabs/aiquills/di/AppModule;", "", "()V", "provideAppDatabase", "Lcom/nirviklabs/aiquills/token/AppDatabase;", "context", "Landroid/content/Context;", "provideTokenDao", "Lcom/nirviklabs/aiquills/token/TokenDao;", "appDatabase", "provideTokenRepository", "Lcom/nirviklabs/aiquills/token/TokenRepository;", "tokenDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.nirviklabs.aiquills.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.nirviklabs.aiquills.token.AppDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.nirviklabs.aiquills.token.TokenDao provideTokenDao(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.nirviklabs.aiquills.token.TokenRepository provideTokenRepository(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.TokenDao tokenDao) {
        return null;
    }
}