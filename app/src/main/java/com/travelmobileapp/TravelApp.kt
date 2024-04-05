package com.travelmobileapp

import android.app.Application

class TravelApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}
