package com.nirviklabs.aiquills.feature.multimodal;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/nirviklabs/aiquills/feature/multimodal/PhotoReasoningViewModel;", "Landroidx/lifecycle/ViewModel;", "generativeModel", "Lcom/google/ai/client/generativeai/GenerativeModel;", "(Lcom/google/ai/client/generativeai/GenerativeModel;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/nirviklabs/aiquills/feature/multimodal/PhotoReasoningUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "reason", "", "userInput", "", "selectedImages", "", "Landroid/graphics/Bitmap;", "app_debug"})
public final class PhotoReasoningViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.google.ai.client.generativeai.GenerativeModel generativeModel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nirviklabs.aiquills.feature.multimodal.PhotoReasoningUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.nirviklabs.aiquills.feature.multimodal.PhotoReasoningUiState> uiState = null;
    
    public PhotoReasoningViewModel(@org.jetbrains.annotations.NotNull
    com.google.ai.client.generativeai.GenerativeModel generativeModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.nirviklabs.aiquills.feature.multimodal.PhotoReasoningUiState> getUiState() {
        return null;
    }
    
    public final void reason(@org.jetbrains.annotations.NotNull
    java.lang.String userInput, @org.jetbrains.annotations.NotNull
    java.util.List<android.graphics.Bitmap> selectedImages) {
    }
}