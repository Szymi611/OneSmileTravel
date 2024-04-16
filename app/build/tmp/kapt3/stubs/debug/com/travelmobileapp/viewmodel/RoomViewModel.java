package com.travelmobileapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/travelmobileapp/viewmodel/RoomViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_rooms", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/travelmobileapp/data/Room;", "roomRepository", "Lcom/travelmobileapp/data/RoomRepository;", "rooms", "Landroidx/lifecycle/LiveData;", "getRooms", "()Landroidx/lifecycle/LiveData;", "createRoom", "", "name", "", "loadRooms", "app_debug"})
public final class RoomViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.travelmobileapp.data.Room>> _rooms = null;
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.RoomRepository roomRepository = null;
    
    public RoomViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.travelmobileapp.data.Room>> getRooms() {
        return null;
    }
    
    public final void createRoom(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void loadRooms() {
    }
}