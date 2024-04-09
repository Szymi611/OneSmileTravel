package com.travelmobileapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00010B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011J\b\u0010$\u001a\u00020\"H\u0002J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0015J\u000e\u0010*\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0015J\u0016\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001a\u00a8\u00061"}, d2 = {"Lcom/travelmobileapp/TravelViewModel;", "Landroidx/lifecycle/ViewModel;", "travelRepository", "Lcom/travelmobileapp/data/TravelRepository;", "countryRepository", "Lcom/travelmobileapp/data/CountryRepository;", "(Lcom/travelmobileapp/data/TravelRepository;Lcom/travelmobileapp/data/CountryRepository;)V", "_countriesState", "Landroidx/compose/runtime/MutableState;", "Lcom/travelmobileapp/TravelViewModel$CountriesState;", "countriesState", "Landroidx/compose/runtime/State;", "getCountriesState", "()Landroidx/compose/runtime/State;", "getAllTravels", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/travelmobileapp/data/Travel;", "getGetAllTravels", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "", "travelDescriptionState", "getTravelDescriptionState", "()Ljava/lang/String;", "setTravelDescriptionState", "(Ljava/lang/String;)V", "travelDescriptionState$delegate", "Landroidx/compose/runtime/MutableState;", "travelTitleState", "getTravelTitleState", "setTravelTitleState", "travelTitleState$delegate", "addTravel", "", "travel", "fetchCountries", "getATravelById", "id", "", "onTravelDescriptionChanged", "newString", "onTravelTitleChanged", "updateCountryVisitedStatus", "countryId", "visited", "", "updateTravel", "CountriesState", "app_debug"})
public final class TravelViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.TravelRepository travelRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.travelmobileapp.data.CountryRepository countryRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState travelTitleState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState travelDescriptionState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.travelmobileapp.TravelViewModel.CountriesState> _countriesState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.travelmobileapp.TravelViewModel.CountriesState> countriesState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.travelmobileapp.data.Travel>> getAllTravels = null;
    
    public TravelViewModel(@org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.TravelRepository travelRepository, @org.jetbrains.annotations.NotNull
    com.travelmobileapp.data.CountryRepository countryRepository) {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.travelmobileapp.TravelViewModel.CountriesState> getCountriesState() {
        return null;
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
    
    public final void updateCountryVisitedStatus(@org.jetbrains.annotations.NotNull
    java.lang.String countryId, boolean visited) {
    }
    
    private final void fetchCountries() {
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