package com.travelmobileapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/travelmobileapp/Graph;", "", "()V", "countryRepository", "Lcom/travelmobileapp/data/CountryRepository;", "getCountryRepository", "()Lcom/travelmobileapp/data/CountryRepository;", "countryRepository$delegate", "Lkotlin/Lazy;", "database", "Lcom/travelmobileapp/data/AppDatabase;", "travelRepository", "Lcom/travelmobileapp/data/TravelRepository;", "getTravelRepository", "()Lcom/travelmobileapp/data/TravelRepository;", "travelRepository$delegate", "provide", "", "context", "Landroid/content/Context;", "app_debug"})
public final class Graph {
    private static com.travelmobileapp.data.AppDatabase database;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy travelRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy countryRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.travelmobileapp.Graph INSTANCE = null;
    
    private Graph() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.travelmobileapp.data.TravelRepository getTravelRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.travelmobileapp.data.CountryRepository getCountryRepository() {
        return null;
    }
    
    public final void provide(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}