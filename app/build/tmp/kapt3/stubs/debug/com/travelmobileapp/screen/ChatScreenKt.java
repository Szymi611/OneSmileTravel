package com.travelmobileapp.screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0003\u001a\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0003\u001a\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0003\u00a8\u0006\u0014"}, d2 = {"ChatMessageItem", "", "message", "Lcom/travelmobileapp/data/Message;", "ChatScreen", "roomId", "", "messageViewModel", "Lcom/travelmobileapp/viewmodel/MessageViewModel;", "formatDate", "dateTime", "Ljava/time/LocalDateTime;", "formatTime", "formatTimestamp", "timestamp", "", "isSameDay", "", "dateTime1", "dateTime2", "app_debug"})
public final class ChatScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @androidx.compose.runtime.Composable
    public static final void ChatScreen(@org.jetbrains.annotations.NotNull
    java.lang.String roomId, @org.jetbrains.annotations.NotNull
    com.travelmobileapp.viewmodel.MessageViewModel messageViewModel) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private static final java.lang.String formatTimestamp(long timestamp) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private static final boolean isSameDay(java.time.LocalDateTime dateTime1, java.time.LocalDateTime dateTime2) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private static final java.lang.String formatTime(java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private static final java.lang.String formatDate(java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @androidx.compose.runtime.Composable
    public static final void ChatMessageItem(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.Message message) {
    }
}