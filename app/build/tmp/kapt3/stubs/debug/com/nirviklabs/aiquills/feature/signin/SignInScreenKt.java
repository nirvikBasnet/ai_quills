package com.nirviklabs.aiquills.feature.signin;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001c\u0010\b\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a<\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a8\u0006\u0011"}, d2 = {"GoogleSignInButton", "", "onItemClicked", "Lkotlin/Function1;", "", "LoginScreenInfo", "modifier", "Landroidx/compose/ui/Modifier;", "SignInScreen", "rememberFirebaseAuthLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "onAuthComplete", "Lcom/google/firebase/auth/AuthResult;", "onAuthError", "Lcom/google/android/gms/common/api/ApiException;", "app_debug"})
public final class SignInScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void SignInScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked) {
    }
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.activity.result.ActivityResult> rememberFirebaseAuthLauncher(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.firebase.auth.AuthResult, kotlin.Unit> onAuthComplete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.android.gms.common.api.ApiException, kotlin.Unit> onAuthError) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void GoogleSignInButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LoginScreenInfo(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}