package com.nirviklabs.aiquills.token;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/nirviklabs/aiquills/token/TokenViewModel;", "Landroidx/lifecycle/ViewModel;", "tokenRepository", "Lcom/nirviklabs/aiquills/token/TokenRepository;", "(Lcom/nirviklabs/aiquills/token/TokenRepository;)V", "_token", "Landroidx/lifecycle/MutableLiveData;", "", "token", "Landroidx/lifecycle/LiveData;", "getToken", "()Landroidx/lifecycle/LiveData;", "fetchToken", "", "insertToken", "Lkotlinx/coroutines/Job;", "subtractToken", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TokenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.nirviklabs.aiquills.token.TokenRepository tokenRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _token = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> token = null;
    
    @javax.inject.Inject
    public TokenViewModel(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.TokenRepository tokenRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getToken() {
        return null;
    }
    
    public final void fetchToken() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertToken(int token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job subtractToken(int token) {
        return null;
    }
}