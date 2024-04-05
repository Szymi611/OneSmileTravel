package com.travelmobileapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/travelmobileapp/Screen;", "", "route", "", "title", "icon", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getIcon", "()I", "getRoute", "()Ljava/lang/String;", "getTitle", "AddScreen", "CountriesScreen", "TravelsScreen", "Lcom/travelmobileapp/Screen$AddScreen;", "Lcom/travelmobileapp/Screen$CountriesScreen;", "Lcom/travelmobileapp/Screen$TravelsScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int icon = 0;
    
    private Screen(java.lang.String route, java.lang.String title, @androidx.annotation.DrawableRes
    int icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/Screen$AddScreen;", "Lcom/travelmobileapp/Screen;", "()V", "app_debug"})
    public static final class AddScreen extends com.travelmobileapp.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.Screen.AddScreen INSTANCE = null;
        
        private AddScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/Screen$CountriesScreen;", "Lcom/travelmobileapp/Screen;", "()V", "app_debug"})
    public static final class CountriesScreen extends com.travelmobileapp.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.Screen.CountriesScreen INSTANCE = null;
        
        private CountriesScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/Screen$TravelsScreen;", "Lcom/travelmobileapp/Screen;", "()V", "app_debug"})
    public static final class TravelsScreen extends com.travelmobileapp.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.Screen.TravelsScreen INSTANCE = null;
        
        private TravelsScreen() {
        }
    }
}