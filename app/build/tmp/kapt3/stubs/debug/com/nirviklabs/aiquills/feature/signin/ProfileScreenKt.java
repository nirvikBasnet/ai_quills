package com.nirviklabs.aiquills.feature.signin;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0007\u001a\"\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007\u001a\u001a\u0010\u0019\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0007\u001a.\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007\u001a\u001e\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006!"}, d2 = {"DefaultButton", "", "buttonText", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "Header", "title", "subtitle", "InformationCard", "information", "ProfileAvatar", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "size", "", "ProfileContent", "user", "Lcom/google/firebase/auth/FirebaseUser;", "activity", "Landroid/app/Activity;", "viewModel", "Lcom/nirviklabs/aiquills/token/TokenViewModel;", "ProfileImage", "url", "contentDescription", "ProfileScreen", "onItemClicked", "Lkotlin/Function1;", "TextButton", "text", "app_debug"})
public final class ProfileScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void ProfileScreen(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.TokenViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileImage(@org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String contentDescription) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileContent(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseUser user, @org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.token.TokenViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Header(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subtitle) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileAvatar(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.painter.Painter painter, int size, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InformationCard(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String information) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DefaultButton(@org.jetbrains.annotations.NotNull
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TextButton(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}