package com.nirviklabs.aiquills.token;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/nirviklabs/aiquills/token/TokenRepository;", "", "tokenDao", "Lcom/nirviklabs/aiquills/token/TokenDao;", "(Lcom/nirviklabs/aiquills/token/TokenDao;)V", "getTokenById", "Landroidx/lifecycle/LiveData;", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToken", "", "additionalToken", "subtractToken", "subtractedToken", "app_debug"})
public final class TokenRepository {
    @org.jetbrains.annotations.NotNull
    private final com.nirviklabs.aiquills.token.TokenDao tokenDao = null;
    
    @javax.inject.Inject
    public TokenRepository(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.TokenDao tokenDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTokenById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<java.lang.Integer>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertToken(int additionalToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object subtractToken(int subtractedToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}