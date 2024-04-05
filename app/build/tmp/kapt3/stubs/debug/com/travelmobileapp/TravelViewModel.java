package com.travelmobileapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001-B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fJ\b\u0010%\u001a\u00020\"H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0015J\u000e\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0015J\u000e\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001a\u00a8\u0006."}, d2 = {"Lcom/travelmobileapp/TravelViewModel;", "Landroidx/lifecycle/ViewModel;", "travelRepository", "Lcom/travelmobileapp/data/TravelRepository;", "(Lcom/travelmobileapp/data/TravelRepository;)V", "_countriesState", "Landroidx/compose/runtime/MutableState;", "Lcom/travelmobileapp/TravelViewModel$CountriesState;", "countriesState", "Landroidx/compose/runtime/State;", "getCountriesState", "()Landroidx/compose/runtime/State;", "getAllTravels", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/travelmobileapp/data/Travel;", "getGetAllTravels", "()Lkotlinx/coroutines/flow/Flow;", "setGetAllTravels", "(Lkotlinx/coroutines/flow/Flow;)V", "<set-?>", "", "travelDescriptionState", "getTravelDescriptionState", "()Ljava/lang/String;", "setTravelDescriptionState", "(Ljava/lang/String;)V", "travelDescriptionState$delegate", "Landroidx/compose/runtime/MutableState;", "travelTitleState", "getTravelTitleState", "setTravelTitleState", "travelTitleState$delegate", "addTravel", "", "travel", "deleteTravel", "fetchingCountries", "getATravelById", "id", "", "onTravelDescriptionChanged", "newString", "onTravelTitleChanged", "updateTravel", "CountriesState", "app_debug"})
public final class TravelViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.TravelRepository travelRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState travelTitleState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState travelDescriptionState$delegate = null;
    public kotlinx.coroutines.flow.Flow<? extends java.util.List<com.travelmobileapp.data.Travel>> getAllTravels;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.travelmobileapp.TravelViewModel.CountriesState> _countriesState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.travelmobileapp.TravelViewModel.CountriesState> countriesState = null;
    
    public TravelViewModel(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.TravelRepository travelRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTravelTitleState() {
        return null;
    }
    
    public final void setTravelTitleState(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTravelDescriptionState() {
        return null;
    }
    
    public final void setTravelDescriptionState(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void onTravelTitleChanged(@org.jetbrains.annotations.NotNull
    java.lang.String newString) {
    }
    
    public final void onTravelDescriptionChanged(@org.jetbrains.annotations.NotNull
    java.lang.String newString) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.travelmobileapp.data.Travel>> getGetAllTravels() {
        return null;
    }
    
    public final void setGetAllTravels(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.travelmobileapp.data.Travel>> p0) {
    }
    
    public final void addTravel(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.Travel travel) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.travelmobileapp.data.Travel> getATravelById(long id) {
        return null;
    }
    
    public final void updateTravel(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.Travel travel) {
    }
    
    public final void deleteTravel(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.Travel travel) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.travelmobileapp.TravelViewModel.CountriesState> getCountriesState() {
        return null;
    }
    
    private final void fetchingCountries() {
    }
    
    public TravelViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/travelmobileapp/TravelViewModel$CountriesState;", "", "loading", "", "list", "", "Lcom/travelmobileapp/Country;", "error", "", "(ZLjava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getLoading", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class CountriesState {
        private final boolean loading = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.travelmobileapp.Country> list = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String error = null;
        
        public CountriesState(boolean loading, @org.jetbrains.annotations.NotNull
        java.util.List<com.travelmobileapp.Country> list, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
            super();
        }
        
        public final boolean getLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.travelmobileapp.Country> getList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getError() {
            return null;
        }
        
        public CountriesState() {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.travelmobileapp.Country> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.travelmobileapp.TravelViewModel.CountriesState copy(boolean loading, @org.jetbrains.annotations.NotNull
        java.util.List<com.travelmobileapp.Country> list, @org.jetbrains.annotations.Nullable
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}