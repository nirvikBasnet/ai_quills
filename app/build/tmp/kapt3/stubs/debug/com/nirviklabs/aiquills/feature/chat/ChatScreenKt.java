package com.nirviklabs.aiquills.feature.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0012\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001\u001a\u001c\u0010\f\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00a8\u0006\u0010"}, d2 = {"ChatBubbleItem", "", "chatMessage", "Lcom/nirviklabs/aiquills/feature/chat/ChatMessage;", "ChatList", "chatMessages", "", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "ChatRoute", "chatViewModel", "Lcom/nirviklabs/aiquills/feature/chat/ChatViewModel;", "MessageInput", "onSendMessage", "Lkotlin/Function1;", "", "app_debug"})
public final class ChatScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void ChatRoute(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.feature.chat.ChatViewModel chatViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ChatList(@org.jetbrains.annotations.NotNull
    java.util.List<com.nirviklabs.aiquills.feature.chat.ChatMessage> chatMessages, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.lazy.LazyListState listState) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ChatBubbleItem(@org.jetbrains.annotations.NotNull
    com.nirviklabs.aiquills.feature.chat.ChatMessage chatMessage) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public static final void MessageInput(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSendMessage) {
    }
}