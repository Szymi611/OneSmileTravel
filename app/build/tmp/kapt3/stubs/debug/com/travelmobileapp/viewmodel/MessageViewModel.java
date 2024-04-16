package com.travelmobileapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/travelmobileapp/viewmodel/MessageViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/travelmobileapp/data/User;", "_messages", "", "Lcom/travelmobileapp/data/Message;", "_roomId", "", "currentUser", "Landroidx/lifecycle/LiveData;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "messageRepository", "Lcom/travelmobileapp/data/MessageRepository;", "messages", "getMessages", "userRepository", "Lcom/travelmobileapp/data/UserRepository;", "loadCurrentUser", "", "loadMessages", "sendMessage", "text", "setRoomId", "roomId", "app_debug"})
public final class MessageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.MessageRepository messageRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.travelmobileapp.data.Message>> _messages = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _roomId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.travelmobileapp.data.User> _currentUser = null;
    
    public MessageViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.travelmobileapp.data.Message>> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.travelmobileapp.data.User> getCurrentUser() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public final void loadMessages() {
    }
    
    private final void loadCurrentUser() {
    }
}