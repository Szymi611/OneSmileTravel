package com.travelmobileapp.screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/travelmobileapp/screen/Screen;", "", "route", "", "title", "icon", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getIcon", "()I", "getRoute", "()Ljava/lang/String;", "getTitle", "AddScreen", "ChatRoomsScreen", "ChatScreen", "CountriesScreen", "LoginScreen", "SignupScreen", "TravelsScreen", "Lcom/travelmobileapp/screen/Screen$AddScreen;", "Lcom/travelmobileapp/screen/Screen$ChatRoomsScreen;", "Lcom/travelmobileapp/screen/Screen$ChatScreen;", "Lcom/travelmobileapp/screen/Screen$CountriesScreen;", "Lcom/travelmobileapp/screen/Screen$LoginScreen;", "Lcom/travelmobileapp/screen/Screen$SignupScreen;", "Lcom/travelmobileapp/screen/Screen$TravelsScreen;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$AddScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class AddScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.AddScreen INSTANCE = null;
        
        private AddScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$ChatRoomsScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class ChatRoomsScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.ChatRoomsScreen INSTANCE = null;
        
        private ChatRoomsScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$ChatScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class ChatScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.ChatScreen INSTANCE = null;
        
        private ChatScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$CountriesScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class CountriesScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.CountriesScreen INSTANCE = null;
        
        private CountriesScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$LoginScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class LoginScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.LoginScreen INSTANCE = null;
        
        private LoginScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$SignupScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class SignupScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.SignupScreen INSTANCE = null;
        
        private SignupScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/travelmobileapp/screen/Screen$TravelsScreen;", "Lcom/travelmobileapp/screen/Screen;", "()V", "app_debug"})
    public static final class TravelsScreen extends com.travelmobileapp.screen.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.travelmobileapp.screen.Screen.TravelsScreen INSTANCE = null;
        
        private TravelsScreen() {
        }
    }
}